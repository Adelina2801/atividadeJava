package Atividade1;

import java.util.Scanner;

public class Atividade3 {
  
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in); 
	
	float SalarioBruto;
	float AdicionalNoturno;
	float HorasExtras;
	float Descontos;
	
	 System.out.println("Digite o valor de Salario Bruto:");
	 SalarioBruto = leia.nextFloat();
	 
	 System.out.println("Digite o valor de Adicional Noturno:");
	 AdicionalNoturno = leia.nextFloat();
	 
	 System.out.println("Digite o valor de Horas Extras:");
	 HorasExtras = leia.nextFloat();
	 
	 System.out.println("Digite o valor de Descontos:");
	 Descontos = leia.nextFloat();
	 
	 System.out.println("O valor de remuneracao total é: " +(SalarioBruto + AdicionalNoturno + HorasExtras + Descontos));
	 
	 
	 
}	 
	 
	 
}
	 
	 


