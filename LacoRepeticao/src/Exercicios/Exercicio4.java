package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		5 - Crie um programa que leia um n�mero do teclado at� que encontre um 
		n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
		(FAZER ENQUANTO)
		 */

		int n = 0 , soma = 0 ;
		
		Scanner tec =  new  Scanner ( System.in);
		
		{
			System.out.print ( " Informe um n�mero at� ser igual a 0: " );
			n = tec . nextInt ();
			
			soma = soma + n;

		} while (n >  0 );
		if (n ==  0 ) {
			System.out.printf ( " 0 encontrado e o total da soma dos numeros digitados foi:% d " , soma);
			tec.close();
		}
		else {
			System.out.printf ( " NUMERO INVALIDO " );
		}
	}
}

