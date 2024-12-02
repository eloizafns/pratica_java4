package atividades_java;

import java.util.Scanner;

public class AtividadeMedias {

	public static void main(String[] args) {
		
		// Variáveis
		
		String nome;
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		// Construindo o leia
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados
		
		System.out.println("Insira seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		// Processamento
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
				
		// Saída de dados
		System.out.printf("Sua média final é %.1f. ", media);
		
	}

}
