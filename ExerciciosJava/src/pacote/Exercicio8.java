package pacote;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc =  new  Scanner ( System.in);

		double valorCarroTotal, custoFabrica, valorDistribuicao, valorImposto;

		System.out.print ( " Digite o valor do carro no custo de fabrica: " );
		custoFabrica = sc . nextDouble ();

		valorDistribuicao = custoFabrica + (custoFabrica *  28  /  100 );
		valorImposto = custoFabrica + (custoFabrica *  45  /  100 );

		valorCarroTotal = custoFabrica + valorDistribuicao + valorImposto;

		System.out.printf ( " O custo ao consumidor é:% .2f " , valorCarroTotal);
		
	}
}