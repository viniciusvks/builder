package br.fundatec.lp3.designpatterns.builder;

public enum Tamanho {

	P,
	M,
	G;

	public static Tamanho getByVal(int i) throws Exception {

		switch(i) {
			case 1:
				return P;
			case 2:
				return M;
			case 3:
				return G;
			default:
				throw new Exception("Tamanho não encontrado");
		}

	}

}
