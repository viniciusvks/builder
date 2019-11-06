package br.fundatec.lp3.designpatterns.builder.pizzaria;

import br.fundatec.lp3.designpatterns.builder.pizza.Pizza;
import br.fundatec.lp3.designpatterns.builder.pizza.PizzaDeQueijoSP;

public class PizzariaSP extends Pizzaria {

	@Override
	protected Pizza criarPizza(String sabor) {
		
		switch(sabor) {
			case "queijo":
				return new PizzaDeQueijoSP();
		}
		
		return null;
	}

}
