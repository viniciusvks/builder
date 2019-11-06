package br.fundatec.lp3.designpatterns.builder.pizza;

public abstract class Pizza {

	public abstract void preparar();
	
	public abstract void cozinhar();
	
	public abstract void cortar();
	
	public abstract void embalar();
	
	public abstract String getName();
	
}
