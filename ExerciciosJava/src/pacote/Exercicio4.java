package pacote;

import  java.util.Scanner ;

public  class Exercicio4 {
	public  static  void  main ( String [] args ) {
	/*
	4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a 
	seguinte express�o: 
	*/
		// variaveis
		int a =  0 , b =  0 , c = 0 , d = 0 , r =  0 , s =  0 ;
		
		// input
		Scanner tec =  new  Scanner ( System.in);
		System.out.printf ( " Digite um valor para A: " );
		a = tec.nextInt ();
		
		System.out.printf ( " Digite um valor para B: " );
		b = tec . nextInt ();
		
		System.out.printf ( " Digite um valor para C: " );
		c = tec . nextInt ();
		
		// calculo
		r = (a + b) + (a + b);
		s = (b + c) + (b + c);
		d = (r + s) / 2 ;
		
		// saida
		System.out.printf ( " \n O resultado da express�o �% .2f " , d);
	}

}