package Atividade1;

import java.util.Scanner;

public class ExerciciosIF {

	public static void main(String[] args) {
		
		int A; 
		int B; 
		int C = 5; 
		
		Scanner leia = new Scanner(System.in);
		
	    System.out.println("Digite o valor de A: ");
	    A = leia.nextInt();
	    
	    System.out.println("Digite o valor de B: ");
	    B = leia.nextInt();
	    
	    if (A + B > C) {
	    System.out.println("O valor de A + B é maior que C.");
	    } 
	    
	    else if (A + B < C) {
	    System.out.println("O valor de A + B é menor que C.");
	    } 
	    
	    else {
	    	System.out.println("O valor de A + B é igual a C.");
	    }
	    
		
		

	

}
	
	
}
