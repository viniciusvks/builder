package br.fundatec.lp3.designpatterns.builder.pizza;

import br.fundatec.lp3.designpatterns.builder.Massa;
import br.fundatec.lp3.designpatterns.builder.Sabor;
import br.fundatec.lp3.designpatterns.builder.Tamanho;

public class PizzaPersonalizada extends Pizza {

	private Tamanho tamanho;
	private Sabor primeiroSabor;
	private Sabor segundoSabor;
	private Massa massa;
	private boolean bordaRecheada;

	@Override
	public void preparar() {
		System.out.println("Preparando pizza");
	}

	@Override
	public void cozinhar() {
		System.out.println("Assando por 25min a 350 graus");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando em fatias diagonais");
	}

	@Override
	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");
	}

	@Override
	public String getName() {
		return "Pizza personalizada";
	}

	public String getTamanho() {
		if(tamanho == null) {
			return "null";
		}
		return tamanho.name();
	}

	public String getPrimeiroSabor() {
		if(primeiroSabor == null) {
			return "null";
		}
		return primeiroSabor.getTitulo();
	}

	public String getSegundoSabor() {
		if(segundoSabor == null) {
			return "null";
		}
		return segundoSabor.getTitulo();
	}

	public String getMassa() {
		if(massa == null) {
			return "null";
		}
		return massa.getTitulo();
	}

	public boolean temBordaRecheada() {
		return bordaRecheada;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	public void setPrimeiroSabor(Sabor primeiroSabor) {
		this.primeiroSabor = primeiroSabor;
	}

	public void setSegundoSabor(Sabor segundoSabor) {
		this.segundoSabor = segundoSabor;
	}

	public void setMassa(Massa massa) {
		this.massa = massa;
	}

	public void temBordaRecheada(boolean bordaRecheada) {
		this.bordaRecheada = bordaRecheada;
	}

}
