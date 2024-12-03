package exercicios_condicionais;

import java.util.Scanner;

public class ExercicioIf2 {

	public static void main(String[] args) {
		
		int numero;
		int resto;
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		resto = numero%2;
		
		if (resto == 0){
			if(numero <= 0)
			System.out.println("O número " + numero + " é par e negativo!");
			else
			System.out.println("O número " + numero + " é par e positivo!");
			
		}else {
			if(numero <= 0)
			System.out.println("O número " + numero + " é ímpar e negativo!");
			else
			System.out.println("O número " + numero + " é ímpar e positivo!");
			
		}
		
		}
		
	}


