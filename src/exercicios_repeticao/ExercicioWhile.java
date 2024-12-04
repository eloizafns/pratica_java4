package exercicios_repeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		

		int idade, menorVinteUm = 0, maiorCinquenta = 0;
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade > 0) {
			if (idade < 21 && idade > 0) {
				menorVinteUm = menorVinteUm + 1;
				
			}
			
			if (idade > 50) {
				maiorCinquenta = maiorCinquenta +1;
				
			}
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos é de: " + menorVinteUm);
		System.out.println("Total de pessoas maiores de 50 anos é de: " + maiorCinquenta);
		
	}
			
		

	}
		



