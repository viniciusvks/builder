package br.fundatec.lp3.designpatterns.builder;

public enum Massa {

	FINA,
	GROSSA;

	public static Massa getByVal(int i) throws Exception {

		switch(i) {
			case 1:
				return FINA;
			case 2:
				return GROSSA;
			default:
				throw new Exception("Massa não encontrado");
		}

	}

}
