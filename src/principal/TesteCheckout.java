package principal;

import model.Cartao;
import model.CheckOut;
import model.Compra;
import model.Impressora;
import model.Operadora;

public class TesteCheckout {

	public static void main(String[] args) {
		//não instanciar - operadora é interface
		//portanto não tem implementação
		Operadora operadora =new Cielo();
		Impressora impressora=new ImpressoraEpson();
		
		//instanciando a classe Cartao
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Maria F. Santos");
		cartao.setNumeroCartao("222");
		
		Compra compra = new Compra();
		compra.setCliente("Maria Figueiredo Santos");
		compra.setProduto("Creme para cabelo");
		compra.setValorTotal(23.5);
		
		//fechando a compra
		CheckOut checkout = new CheckOut(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}

}
