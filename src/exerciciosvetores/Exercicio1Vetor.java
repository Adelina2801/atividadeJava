package exerciciosvetores;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int item;
		boolean caiu = false;

		int Numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite um número inteiro: ");
		item = leia.nextInt();

		for (int contador = 0; contador < 10; contador++) {
			if (item == Numeros[contador]) {
               System.out.println("O numero " + item+ " esta na posição " +contador);
               
               caiu = true;
			}
		}
			
			if (caiu == false) 
				System.out.println("O numero " +item+ " não foi encontrado");
			
			 leia.close();
		}

	}

    