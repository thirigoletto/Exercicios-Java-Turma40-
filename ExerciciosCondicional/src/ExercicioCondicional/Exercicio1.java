package ExercicioCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o 
		maior.
		 */
		
		// variaveis
		int num1 = 0 , num2 = 0 , num3 = 0 ;

	    // input
	    Scanner tec =  new  Scanner ( System.in);
		System.out.printf ( " Digite o numero 1: " );
		num1 = tec . nextInt ();
		
		System.out.print ( " Digite o numero 2: " );
		num2 = tec . nextInt ();
		
		System.out.print ( " Digite o numero 3: " );
		num3 = tec . nextInt ();
		
	    // la�o de decis�o
	    if (num1 > num2)
	    {
	        if (num1 > num3)
	        {
	            System.out.printf ( " O maior numero �% d " , num1);
	        }
	        else
	        {
	        	System.out.printf ( " O maior numero �% d " , num3);
	        }
	    }
	    else
	    {
	        if (num2 > num3)
	        {
	        	System.out.printf ( " O maior numero �% d " , num2);
	        }
	        else
	        {
	        	System.out.printf ( " O maior numero �% d " , num3);
	        }
	        
	    }
	    
	}
	
}
	        
	    






