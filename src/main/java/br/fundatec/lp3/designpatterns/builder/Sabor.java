package br.fundatec.lp3.designpatterns.builder;

public enum Sabor {

	CALABRESA("Calabresa"),
	_4QUEIJOS("4 Queijos"),
	BACON("Bacon"),
	MARGUERITA("Marguerita");

	private String titulo;

	Sabor(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

}
