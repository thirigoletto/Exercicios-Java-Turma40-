package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares
		 */
		
		int n =  0 , par = 0 , impar = 0 ;
		
		Scanner tec =  new  Scanner ( System.in);
		
		
		for ( int i =  0 ; i <  10 ; i ++ ) {
			System.out.print ( " Informe 10 numeros: " );
			n = tec . nextInt ();
				if (n % 2 == 0 ) {
					par ++ ;
					
				}
				else {
					impar ++ ;
				}
		}
		System.out.printf ( " % d numeros s�o pares e% d numeros s�o impares " , par, impar);
	}

}

