package exerciciosEstruturadeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		int contador = 1;
		String nome;

		Queue<String> fila = new LinkedList<String>();

		while (contador != 0) {

			System.out.println("Menu");
			System.out.println("1 - Adicionar cliente na fila ");
			System.out.println("2 - Listar todos os clientes ");
			System.out.println("3 - Retirar cliente da fila ");
			System.out.println("0 - Sair ");

			System.out.println("\nDigite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite seu nome:");
				nome = leia.next();
				fila.add(nome);
				System.out.println("\nCliente adicionado na fila: " + fila);
				break;

			case 2:

				System.out.println("\nClientes na fila: " + fila);
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nSua fila esta vazia.");

				} else {

					System.out.println("Cliente foi removido." + fila.remove());

				}
				break;

			case 0:
				System.out.println("Você saiu.");
				break;

			}
		}
	}

}
