package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1ArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cor = new ArrayList<String>();

		for (int sug = 1; sug < 6; sug++) {
			System.out.println("Insira a " + sug + "° cor:");
			String cores = leia.nextLine();

			cor.add(cores);

		}
		System.out.println("Listar todas as cores:");
		for (String item : cor) {
			System.out.println(item);

		}

		cor.sort(null);
		System.out.println("Listar todas as cores ordenadas:");
		for (String item : cor) {
			System.out.println(item);

		}

	}
}
