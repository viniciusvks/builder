package br.fundatec.lp3.designpatterns.builder.pizza;

public class PizzaDeQueijoPOA extends Pizza {

	@Override
	public void preparar() {
		
		System.out.println("Preparando pizza de queijo com borda grossa");
		System.out.println("Adicionando 200g de queijo mussarella");
		System.out.println("Adicionando orégano");
		System.out.println("Adicionando molho apimentado");
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
		return "Pizza de Queijo da franquia da Porto Alegre";
	}

}
