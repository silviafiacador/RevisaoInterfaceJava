package model;

public interface Operadora {
	//operadora precisa autorizar ou n�o
	//a compra. 
	//o cart�o ser� uma classe
    public boolean autorizar (Autorizavel autorizavel, Cartao cartao);
    
}
