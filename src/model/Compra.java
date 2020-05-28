package model;

public class Compra implements Autorizavel, Imprimivel{
  //uma compra precisa ser autorizavel e imprimivcel
	private double ValorTotal;
    private String produto;
    private String cliente;

    public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}

	@Override  //implementação do método da interface autorizavel
    public double getValorTotal() {
        return this.ValorTotal;
    }

    @Override
    public String getCabecalhoPagina() {
        return this.getProduto() + "=" + this.getValorTotal();
        
    }

    @Override
    public String getCorpoPagina() {
            return this.getCliente();
    }

    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
}
