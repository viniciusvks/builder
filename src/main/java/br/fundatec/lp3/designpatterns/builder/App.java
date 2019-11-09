package br.fundatec.lp3.designpatterns.builder;

import br.fundatec.lp3.designpatterns.builder.pizza.Pizza;
import br.fundatec.lp3.designpatterns.builder.pizza.PizzaPersonalizada;

public class App {

    public static void main( String[] args ) {

    	try {

            Pizza pizza = PizzaPersonalizada.builder()
            				.comTamanho(Tamanho.M)
            				.comPrimeiroSabor(Sabor.CALABRESA)
            				.comSegundoSabor(Sabor._4QUEIJOS)
            				.comBordaRecheada(true)
            				.comMassa(Massa.FINA)
            				.build();

            pizza.preparar();
            pizza.cozinhar();
            pizza.cortar();
            pizza.embalar();

    	} catch(Exception e) {
    		System.out.println("Opção inválida: " + e.getMessage());
    	}
    }

}
