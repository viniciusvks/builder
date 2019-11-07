package br.fundatec.lp3.designpatterns.builder;

public enum Massa {

	FINA("Fina"),
	GROSSA("Grossa");

	private String titulo;

	Massa(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return this.titulo;
	}

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
