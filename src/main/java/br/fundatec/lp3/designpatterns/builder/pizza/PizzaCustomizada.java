package br.fundatec.lp3.designpatterns.builder.pizza;

import br.fundatec.lp3.designpatterns.builder.Massa;
import br.fundatec.lp3.designpatterns.builder.Sabor;
import br.fundatec.lp3.designpatterns.builder.Tamanho;

public class PizzaCustomizada extends Pizza {

	private Tamanho tamanho;
	private Sabor primeiroSabor;
	private Sabor segundoSabor;
	private Massa massa;
	private boolean bordaRecheada;

	private PizzaCustomizada() {}

	public Builder builder() {
		return new Builder(this);
	}

	private class Builder {

		private PizzaCustomizada pizza;

		Builder(PizzaCustomizada pizza) {
			this.pizza = pizza;
		}

		public Builder comTamanho(Tamanho tamanho) {
			pizza.tamanho = tamanho;
			return this;
		}

		public Builder comPrimeiroSabor(Sabor sabor) {
			pizza.primeiroSabor = sabor;
			return this;
		}

		public Builder comMassa(Massa massa) {
			pizza.massa = massa;
			return this;
		}

		public Builder comBordaRecheada(boolean bordaRecheada) {
			pizza.bordaRecheada = bordaRecheada;
			return this;
		}

		public Pizza build() {

			 preparar();
			 cozinhar();
			 cortar();
			 embalar();

			return pizza;
		}

	}

	@Override
	public void preparar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cozinhar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cortar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void embalar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
