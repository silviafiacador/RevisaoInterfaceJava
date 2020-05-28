package model;
        
public class CheckOut {
//quando vou pagar a conta
    private Operadora operadora;
    private Impressora impressora;
    

//interface de operadora e de impressora
public CheckOut (Operadora operadora, Impressora impressora){
	this.operadora = operadora;
	this.impressora = impressora;

}

public void fecharCompra (Compra compra, Cartao cartao) {
    boolean autorizacao = this.operadora.autorizar(compra, cartao);
    if (autorizacao){
        this.impressora.imprimir(compra);}
    else {
        System.out.println("Pagamento negado!");  }

}
}