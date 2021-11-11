package ExercicioCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Faça um programa que receba a idade de uma pessoa e mostre na 
		saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
		 */
		
		// Declaração de variaveis
		int idade =  0 ;
						
		// Inputs
		Scanner tec =  new  Scanner ( System.in);
		System.out.print ( " Informe sua idade: " );
		idade = tec . nextInt ();
		
		// Laço de decisão
		if (idade >=  10  && idade <= 14 ) {
			System.out.printf ( "Você tem% d anos e sua categoria é a infantil " , idade);
		}
		else  if (idade >=  15  && idade <= 17 ) {
			System.out.printf ( "Você tem% d anos e sua categoria é a Juvenil " , idade);
		}
		else  if (idade >=  18  && idade <= 25 ) {
			System.out.printf ( "Você tem% d anos e sua categoria é um adulto " , idade);
		}
	}


	}


