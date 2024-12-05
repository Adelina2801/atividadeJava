package exerciciosLacosDeRepeticao;

import java.util.Scanner;

public class ExLacoDeRep1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 int numero = 0;
		 int contador;
		 int contadorImpar = 0;
		 int contadorPar = 0;
		 
		 for (contador = 1; contador <= 10; contador++) {
		   System.out.println("Digite o " +contador+ "° numero:");
		   numero = leia.nextInt();
		 
		   if (numero % 2 == 0) { contadorPar++;
		   System.out.println("Você inseriu " +contadorPar+ " numeros pares.");
		   }else { contadorImpar++;
		   System.out.println("Você inseriu " +contadorImpar+ " numeros impares.");
		   }
		   
		   
		 
	    
	    }

} 

}	
	  
   

