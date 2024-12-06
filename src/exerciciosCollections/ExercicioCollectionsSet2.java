package exerciciosCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionsSet2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<Integer>();

		for (int item = 1; item < 11; item++) {
			System.out.println("Insira a " + item + "° numero:");
			Integer num = leia.nextInt();
			numeros.add(num);

		}
		numeros.addAll(numeros);
		System.out.print("Listar dados do Set: ");
		for (Integer i : numeros) {
			System.out.println(i);

		}

	}

}
