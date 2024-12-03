package exercicios_condicionais;

import java.util.Scanner;

public class ExercicioIf1 {

	public static void main(String[] args) {
		
		int valorA;
		int valorB;
		int valorC;
		float soma;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o valor A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o valor B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o valor C: ");
		valorC = leia.nextInt();
		
		soma = (valorA + valorB);
		
		if (soma > valorC) {
			System.out.println("A soma de A + B é maior do que C.");
			
		} else if(soma == valorC) {
			System.out.println("A soma de A + B é igual a C.");
			
		}else {
			System.out.println("A soma de A + B é menor do que C.");
			
		}
			

	}

}
