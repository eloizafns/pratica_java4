package exercicios_repeticao;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		int numero = 0;
		int soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
		if (numero > 0) {
			soma = numero + soma;
		}
		
	}
		while (numero != 0);
		System.out.println("A soma dos números positivos é: ." + soma);

}
	
}
