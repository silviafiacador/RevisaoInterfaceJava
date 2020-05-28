package principal;

import model.Autorizavel;
import model.Cartao;
import model.Operadora;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		// respeitando a regra de neg�cio para o cart�o Cielo ou seja
		//o n�mero do cart�o deve come�ar com 123 e o valor autori-
		//z�vel tem que ser menor que 100
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal()<100;
	}

}
