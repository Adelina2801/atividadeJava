package exerciciosLacosDeRepeticao;

import java.util.Scanner;

public class ExDoWhile {

	public static void main(String[] args) {

		int numero, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			
			if (numero >0 ) {
		        soma += numero++;
			
			}
		} while  (numero != 0);
		
		 System.out.println("A soma dos numeros pares é: " +soma);
	
		}	
		
	}

