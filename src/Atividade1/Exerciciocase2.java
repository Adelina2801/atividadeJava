package Atividade1;

import java.util.Scanner;

public class Exerciciocase2 {

	public static void main(String[] args) {
		
		int numero;
		double salario;
		String nome;
		
		 Scanner leia = new Scanner(System.in);
			
			System.out.println("Informe seu nome: ");
			nome = leia.next();
			
			System.out.println("Informe numero de seu cargo: ");
			numero = leia.nextInt();
			
			System.out.println("Informe o seu salario atual: ");
			salario = leia.nextDouble();
		
		
		switch (numero) {
		case 1:
			System.out.println(" Gerente "  + nome +  " - Salário: R$" + (salario + (salario * 0.10)));
			break;
			
		case 2:
			System.out.println(" Vendedor "  + nome +  " - Salário: R$" + (salario + (salario * 0.07)));
			break;
			
		case 3:
			System.out.println(" Supervisor "  + nome +  " - Salário: R$" + (salario + (salario * 0.09)));
			break;
			
		case 4:
			System.out.println("Motorista "  + nome +  " - Salário: R$" + (salario + (salario * 0.06)));
			break;
			
		case 5: 
			System.out.println("Estoquista "  + nome +  " - Salário: R$" + (salario + (salario * 0.05)));
			break;
			
		case 6:
			System.out.println("Tecnico de TI "  + nome +  " - Salário: R$" + (salario + (salario * 0.08)));
			break;
		
		}
		
		
	}


}