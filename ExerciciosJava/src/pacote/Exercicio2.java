package pacote;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em 
		anos, meses e dias. 
		*/
			
			// declara��o de variaveis
		    int dias =  0 , anos =  0 , meses =  0 ;
			
			// entradas
			Scanner tec =  new  Scanner ( System.in);
			System.out.printf ( " Informe a sua idade em dias: " );
			dias = tec . nextInt ();
			
			// calculo
			anos = (dias / 365 );
			meses = (dias % 365 ) / 30 ;
			dias = (dias % 365 ) % 30 ;
			
			// saida
			System.out.printf ( "Voc� possui %d anos, %d meses e %d dias " , anos, meses, dias);
		}

	

	}


