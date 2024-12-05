package Atividade1;

import java.util.Scanner;

public class ExercicioCase1 {

	public static void main(String[] args) {
		 int opcao;
         int quantidade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-- Digite 1 Cachorro quente ");
		System.out.println("-- Digite 2 X-Salada ");
		System.out.println("-- Digite 3 X-Bacon ");
		System.out.println("-- Digite 4 Bauru ");
		System.out.println("-- Digite 5 Refrigerante ");
		System.out.println("-- Digite 6 Suco de Laranja ");
		System.out.println("Item desejado: ");
		opcao = leia.nextInt();
		System.out.println("Quantidade desejada: ");
		quantidade = leia.nextInt();
		
		switch (opcao) {
		case 1:
		    System.out.println("Cachorro quente - Valor:R$10,00");
		    System.out.println("O valor final é: " + (10 * quantidade) );
		    break;
		case 2:
			System.out.println("X-Salada - Valor:R$15,00");
		    System.out.println("O valor final é: " + (15 * quantidade) );
		   break;
		case 3:
			System.out.println("X-Bacon - Valor:R$18,00");
		    System.out.println("O valor final é: " + (18 * quantidade) );
		case 4:
			System.out.println("Bauru - Valor:R$12,00");
		    System.out.println("O valor final é: " + (12 * quantidade) );
		case 5:
			System.out.println("Refrigerante - Valor:R$8,00");
		    System.out.println("O valor final é: " + (8 * quantidade) );
		case 6:
			System.out.println("Suco de Laranja - Valor:R$13,00");
		    System.out.println("O valor final é: " + (13 * quantidade) );
		    
		    
		    leia.close();
	
		}
		
	}
			
			
			
			
}


		
	
