package exerciciosEstruturadeDados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Integer opcao;
		Integer contador = 1;
		String nome;

		Stack<String> livro = new Stack<String>();

		while (contador != 0) {

			System.out.println("Menu");
			System.out.println("1 - Adicionar livro da pilha ");
			System.out.println("2 - Listar todos os livros ");
			System.out.println("3 - Retirar livro da pilha ");
			System.out.println("0 - Sair ");

			System.out.println("\nDigite a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			
			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome:");
				nome = leia.nextLine();
				
				
				System.out.println("\nLivro adicionado a pilha: " + livro.push (nome));
				break;

			case 2:

				System.out.println("\nLista de livros na pilha: " + livro);
				break;

			case 3:
				if (livro.isEmpty()) {
					System.out.println("\nSua pilha está vazia.");

				} else {

					System.out.println("Um livro foi removido." + livro.pop());

				}
				break;

			case 0:
				System.out.println("Programa finalizado.");
				break;

			}

		}
	}
}
