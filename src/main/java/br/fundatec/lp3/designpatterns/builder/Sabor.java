package br.fundatec.lp3.designpatterns.builder;

public enum Sabor {

	CALABRESA,
	_4QUEIJOS,
	BACON,
	MARGUERITA;

	public static Sabor getByVal(int i) throws Exception {

		switch(i) {
			case 1:
				return CALABRESA;
			case 2:
				return _4QUEIJOS;
			case 3:
				return BACON;
			case 4:
				return MARGUERITA;
			default:
				throw new Exception("Sabor não encontrado");
		}

	}

}
