
package Atividade1;

import java.util.Scanner;

public class Exercicioifdois {

	public static void main(String[] args) {
		
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			
			numero = leia.nextInt();
		}
		
		String paridade = (numero % 2 == 0) ? " par " : " ímpar ";
		String sinal;
		
		if (numero > 0) {
			sinal = " positivo ";
			
		} else if (numero < 0) {
			sinal = " negativo ";
		} else {
			sinal = " zero ";
		}
		
		System.out.println("O numero " + numero + " é " + paridade + "e" + sinal + ".");
		
	
		
	
		
		
		} 
			
			
	}	
	
 	

	
		
		




