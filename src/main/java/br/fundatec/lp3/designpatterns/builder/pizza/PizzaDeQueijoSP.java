package br.fundatec.lp3.designpatterns.builder.pizza;

public class PizzaDeQueijoSP extends Pizza {

	@Override
	public void preparar() {
		
		System.out.println("Preparando pizza de queijo com borda fina");
		System.out.println("Adicionando 100g de queijo gorgonzola");
		System.out.println("Adicionando orégano");
		System.out.println("Adicionando molho suave");

	}

	@Override
	public void cozinhar() {
		System.out.println("Assando por 20min a 250 graus");

	}

	@Override
	public void cortar() {
		System.out.println("Cortando em fatias quadradas");

	}

	@Override
	public void embalar() {
		System.out.println("Acomodando na caixa da pizzaria");

	}

	@Override
	public String getName() {
		return "Pizza de Queijo da franquia de São Paulo";
	}

}
