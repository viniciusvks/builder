package br.fundatec.lp3.designpatterns.builder.pizza;

import br.fundatec.lp3.designpatterns.builder.Massa;
import br.fundatec.lp3.designpatterns.builder.Sabor;
import br.fundatec.lp3.designpatterns.builder.Tamanho;

public class PizzaPersonalizada extends Pizza {

	private Tamanho tamanho;
	private Sabor primeiroSabor;
	private Sabor segundoSabor;
	private Massa massa;
	private Boolean bordaRecheada;

	private PizzaPersonalizada() {}

	public static Builder builder() {
		return new PizzaPersonalizada().new Builder();
	}

	public class Builder {

		private PizzaPersonalizada pizza;

		Builder() {
			this.pizza = new PizzaPersonalizada();
		}

		public Builder comTamanho(Tamanho tamanho) {
			pizza.tamanho = tamanho;
			return this;
		}

		public Builder comPrimeiroSabor(Sabor sabor) {
			pizza.primeiroSabor = sabor;
			return this;
		}

		public Builder comSegundoSabor(Sabor sabor) {
			pizza.segundoSabor = sabor;
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

		public Pizza build() throws Exception {

			if(tamanho == null) {
				throw new Exception("Pizza inválida: tamanho não informado");				
			}
			
			if(primeiroSabor == null) {
				throw new Exception("Pizza inválida: primeiro sabor não informado");				
			}
			
			if(segundoSabor == null) {
				throw new Exception("Pizza inválida: segundo sabor não informado");				
			}
			
			if(massa == null) {
				throw new Exception("Pizza inválida: massa não informada");				
			}
			
			if(bordaRecheada == null) {
				throw new Exception("Pizza inválida: borda recheada não informada");				
			}
			
			return pizza;
			
		}

	}

	@Override
	public void preparar() {

		System.out.println("Preparando pizza");
		System.out.println("Tamanho: " + tamanho.name());
		System.out.println("Sabores: " + primeiroSabor.getTitulo() + ", " + segundoSabor.getTitulo());
		System.out.println("Massa: " + massa.getTitulo());

		if(bordaRecheada) {
			System.out.println("Com borda recheada");
		} else {
			System.out.println("Sem borda recheada");
		}

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
		return "Pizza customizada";
	}

}
