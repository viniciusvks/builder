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

}
