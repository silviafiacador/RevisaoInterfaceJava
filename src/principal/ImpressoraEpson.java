package principal;

import model.Impressora;
import model.Imprimivel;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("*********************************");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("*********************************");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println();
		System.out.println("*********************************");
		System.out.println("--->          EPSON          <---");
		System.out.println("*********************************");
		

	}

}
