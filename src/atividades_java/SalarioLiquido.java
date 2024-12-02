package atividades_java;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		String nome;
		float SalarioBruto;
		float AdicionalNoturno;
		float HorasExtras;
		float descontos;
		float SalarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Insira seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite o valor do seu salário bruto: ");
		SalarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do seu adicional noturno: ");
		AdicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		HorasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos seus descontos: ");
		descontos = leia.nextFloat();
		
		
		SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras * 5) - descontos;
		
		System.out.printf("Seu salário líquido é %.2f. ", SalarioLiquido);

	}

}
