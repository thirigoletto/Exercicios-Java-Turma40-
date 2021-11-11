package pacote;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		7. Um sistema de equações lineares do tipo: pode ser resolvido segundo abaixo: 
		*/
		Scanner sc =  new  Scanner ( System.in);

		int a, b, c, d, e, f, x, y;

		System.out.print ( " Digite o valor do a: " );
		a = sc . nextInt ();

		System.out.print ( " Digite o valor do b: " );
		b = sc . nextInt ();

		System.out.print ( " Digite o valor do c: " );
		c = sc . nextInt ();

		System.out.print ( " Digite o valor do d: " );
		d = sc . nextInt ();

		System.out.print ( " Digite o valor do e: " );
		e = sc . nextInt ();

		System.out.print ( " Digite o valor do f: " );
		f = sc . nextInt ();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.println ( " Valor de X: "  + x +  " e o valor de Y: "  + y);

	
	}

}

