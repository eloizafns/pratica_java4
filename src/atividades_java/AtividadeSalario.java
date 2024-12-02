package atividades_java;

import java.util.Scanner;

public class AtividadeSalario {

	public static void main(String[] args) {
		
		// Variáveis
		
		float salario;
		float abono;
		float NovoSalario;
		
		// Construindo o leia
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		
		System.out.println("Digite o valor do seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do seu abono: ");
		abono = leia.nextFloat();
		
		//Processamento
		
		NovoSalario = salario + abono;
		
		//Saída de dados
		System.out.printf("Seu novo salário é %.2f. ", NovoSalario);

	}

}
