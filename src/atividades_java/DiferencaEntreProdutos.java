package atividades_java;

import java.util.Scanner;

public class DiferencaEntreProdutos {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		float num3;
		float num4;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		num4 = leia.nextFloat();
		
		
		diferenca = (num1 * num2) - (num3 * num4);
		
		System.out.println("A diferença do 1º e 2º número para o 3º e 4° é de: "+ diferenca);

	}

}
