package pacote;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
		P (x1, y1) e P (x2, y2), percorrer a dist?ncia entre eles. A f?rmula que efetua tal c?lculo ?:
		*/
			
			// variaveis
		Scanner sc = new Scanner ( System.in);

	    double x1, x2, y1, y2, d, raiz;

		System.out.print ( " Digite o valor do x1: " );
		x1 = sc . nextDouble ();

		System.out.printf ( " Digite o valor do x2: " );
		x2 = sc . nextDouble ();

		System.out.print ( " Digite o valor do y1: " );
		y1 = sc . nextDouble ();

		System.out.print ( " Digite o valor do y2: " );
		y2 = sc . nextDouble ();

		d = (x1 - x2) * (x2 - x1) + (y1 - y2) * (y2 - y1);

		raiz =  Math.sqrt (d);

		System.out.println ( " \n Raiz: "  + raiz);
	}
}
		