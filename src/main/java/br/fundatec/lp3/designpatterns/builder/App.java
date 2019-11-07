package br.fundatec.lp3.designpatterns.builder;

import br.fundatec.lp3.designpatterns.builder.pizza.PizzaPersonalizada;

public class App {

    public static void main( String[] args ) {

    	PizzaPersonalizada pizza = new PizzaPersonalizada();
    	pizza.setTamanho(Tamanho.P);
//    	pizzaPersonalizada.setMassa(Massa.FINA);
    	pizza.setPrimeiroSabor(Sabor.CALABRESA);
//    	pizzaPersonalizada.setSegundoSabor(Sabor._4QUEIJOS);
    	pizza.temBordaRecheada(true);

    	System.out.println("Saindo uma pizza personalizada");
    	System.out.println("Tamanho: " + pizza.getTamanho());
		System.out.println("Sabores: " + pizza.getPrimeiroSabor() + ", " + pizza.getSegundoSabor());
		System.out.println("Massa: " + pizza.getMassa());

		if(pizza.temBordaRecheada()) {
			System.out.println("Com borda recheada");
		} else {
			System.out.println("Sem borda recheada");
		}

    	pizza.preparar();
    	pizza.cozinhar();
    	pizza.cortar();
    	pizza.embalar();

    }

}
