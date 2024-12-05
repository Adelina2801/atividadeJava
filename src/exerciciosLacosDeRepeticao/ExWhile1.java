package exerciciosLacosDeRepeticao;

import java.util.Scanner;

public class ExWhile1 {

	public static void main(String[] args) {
		
		int idade = 0;
		int contadorMenor21 = 0;
		int contadorMaior50 = 0;
		int contador = 0;
		
		
		
		Scanner leia = new Scanner (System.in);
		
		while (idade >=0) {
		System.out.println("Digite a sua idade " + (contador + 1)+ ": ");
		idade = leia.nextInt();
		
		if (idade <21 && idade >0) { contadorMenor21++;
		
		}else if (idade >50) { contadorMaior50++; 
		contador++;
		}
		
		
		}
		System.out.println("Temos o total de " +contadorMenor21+ " pessoas menores de 21 anos.");
		System.out.println("Temos o total de " +contadorMaior50+ " pessoas maiores de 50 anos.");  
	}


	}



