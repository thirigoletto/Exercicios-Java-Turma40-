package pacote;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		3. Fa?a um sistema que leia o tempo de dura??o de um evento em uma f?brica expressa em 
		segundos e mostre-o expresso em horas, minutos e segundos. 
		*/
			
			// declara??o de variaveis
			int segundos =  0 , horas =  0 , minutos =  0 ;
			
			// entradas
			Scanner tec =  new Scanner ( System.in);
			System.out.printf ( " Informe o tempo de dura??o de um evento em uma f?brica expressa em segundos: " );
			segundos = tec . nextInt ();
			
			// calculo
			horas = (segundos / 3600 );
			minutos = (segundos % 3600 ) / 60 ;
			segundos = (segundos % 3600 ) % 60 ;
			
			// saida
			System.out.printf ( " O seu evento durou% d horas,% d minutos e% d segundos " , horas, minutos, segundos);
		}


	}

