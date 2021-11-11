package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		6 - Escrever um programa que receba vários números inteiros no teclado. 
		E no final  imprimir a média dos números múltiplos de 3. Para sair digitar
		0 (zero). (FAÇA ... ENQUANTO)
		 */
		int soma =  0 , numDigit =  1 , contador =  0 ;
		double dupla =  0 ;
		
		Scanner tec =  new  Scanner ( System.in);
		
		System.out.print ( " Para sair do programa, digite 0! " );
		
		 {
			System.out.print ( " Digite um numero: " );
			numDigit = tec . nextInt ();
			if (numDigit % 3  ==  0  && numDigit >  0 ) {
				soma = soma + numDigit;
				contador = contador +  1 ;
			}
		} while (numDigit !=  0 );
		
		dupla = (soma / contador);
		System.out.printf ( " A media final é% .2f " , dupla);
		
		tec.close();
	}


	}

