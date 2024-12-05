package Atividade1;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float Nota1;
		float Nota2;
		float Nota3;
		float Nota4;
		
		System.out.println("Informe a primeira nota:");
		Nota1 = leia.nextFloat();
		
		System.out.println("Informe a segunda nota:");
		Nota2 = leia.nextFloat();
		
		System.out.println("Informe a terceira nota:");
		Nota3 = leia.nextFloat();
		
		System.out.println("Informe a quarta nota:");
		Nota4 = leia.nextFloat();
		
		 System.out.println("A media total das notas é de: " + (Nota1 + Nota2 + Nota3 + Nota4) / 4);
		
		
		
	}

}
