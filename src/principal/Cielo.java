package principal;

import model.Autorizavel;
import model.Cartao;
import model.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		// respeitando a regra de negócio para o cartão Cielo ou seja
		//o número do cartão deve começar com 123 e o valor autori-
		//zável tem que ser menor que 100
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal()<100;
	}

}
