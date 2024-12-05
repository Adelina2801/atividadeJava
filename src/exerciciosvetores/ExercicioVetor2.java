package exerciciosvetores;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {

		int numero[] = new int[10], contador = 0;
		float media, soma = 0;

		Scanner leia = new Scanner(System.in);

		for (contador = 0; contador < 10; contador++) {

			System.out.println("O digite o " + (contador + 1) + "° numero:");
			numero[contador] = leia.nextInt();
			soma = soma + numero[contador];
		}

		System.out.println("Elementos nos indices impares: ");
		for (contador = 0; contador < 10; contador++) {
			if (contador % 2 != 0) {
				System.out.println(numero[contador]);
			}
		}

		System.out.println("Elementos pares: ");
		for (contador = 0; contador < 10; contador++) {
			if (numero[contador] % 2 == 0) {
				System.out.println(numero[contador]);
			}

		}

		System.out.println("Soma: " + soma);

		media = soma / 10;
          System.out.println("Média: " +media);
	}
}
