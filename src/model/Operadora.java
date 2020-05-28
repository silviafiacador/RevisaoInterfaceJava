package model;

public interface Operadora {
	//operadora precisa autorizar ou não
	//a compra. 
	//o cartão será uma classe
    public boolean autorizar (Autorizavel autorizavel, Cartao cartao);
    
}
