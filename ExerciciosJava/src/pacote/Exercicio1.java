package pacote;

import  java.util.Scanner ;

public  class Exercicio1 {

	public  static  void  main ( String [] args ) {
	/*
	1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a 
	expressa apenas em dias. 
	*/
		// Declara��o de variaveis
		int anos =  0 , meses =  0 , dias =  0 , res =  0 ;
				
		// Inputs
		Scanner tec = new  Scanner ( System.in);
		System.out.printf ( " Informe seu ano de nascimento: " );
		anos = tec.nextInt ();
		
		System.out.printf ( " Informe quantos meses: " );
		meses = tec . nextInt ();
		
		System.out.printf ( " Informe quantos dias: " );
		dias = tec . nextInt ();
		
		
		// calculo
		res = (anos * 365 ) + (meses * 30 ) + dias;
		
		// saida
		System.out.printf ( "Voc� tem% d dias " , res);
		

	}

}