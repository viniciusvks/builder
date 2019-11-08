package br.fundatec.lp3.designpatterns.builder;

import java.util.Scanner;

import br.fundatec.lp3.designpatterns.builder.pizza.Pizza;
import br.fundatec.lp3.designpatterns.builder.pizza.PizzaPersonalizada;

public class App {

    public static void main( String[] args ) {

    	try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("> MENU:");
            System.out.println("> ESCOLHA O TAMANHO:");
            System.out.println(">| 1 - P");
            System.out.println(">| 2 - M");
            System.out.println(">| 3 - G");
            Tamanho tamanho = Tamanho.getByVal(scanner.nextInt());

            System.out.println("> ESCOLHA O PRIMEIRO SABOR:");
            System.out.println(">| 1 - Calabresa");
            System.out.println(">| 2 - 4 Queijos");
            System.out.println(">| 3 - Bacon");
            System.out.println(">| 4 - Marguerita");
            Sabor primeiroSabor = Sabor.getByVal(scanner.nextInt());

            System.out.println("> ESCOLHA O SEGUNDO SABOR:");
            System.out.println(">| 1 - Calabresa");
            System.out.println(">| 2 - 4 Queijos");
            System.out.println(">| 3 - Bacon");
            System.out.println(">| 4 - Marguerita");
            Sabor segundoSabor = Sabor.getByVal(scanner.nextInt());

            System.out.println("> ESCOLHA A MASSA:");
            System.out.println(">| 1 - Fina");
            System.out.println(">| 2 - Grossa");
            Massa massa = Massa.getByVal(scanner.nextInt());

            System.out.println("> BORDA RECHEADA?");
            System.out.println(">| 1 - Sim");
            System.out.println(">| 2 - Não");

            int opBordaRecheada = scanner.nextInt();

            if(opBordaRecheada != 1 && opBordaRecheada != 2) {
            	throw new Exception("Opção de borda não encontrada");
            }

            boolean bordaRecheada = opBordaRecheada == 1 ? true : false;           

            Pizza pizza = PizzaPersonalizada.builder()
            				.comTamanho(tamanho)
            				.comPrimeiroSabor(primeiroSabor)
            				.comSegundoSabor(segundoSabor)
            				.comBordaRecheada(bordaRecheada)
            				.comMassa(massa)
            				.build();
            
            pizza.preparar();
            pizza.cozinhar();
            pizza.cortar();
            pizza.embalar();

    	} catch(Exception e) {
    		System.out.println("Opção inválida: ");
    	}
    }

}
