package exercicios_repeticao;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {

		int num1, num2, contador, resposta;

		Scanner leia = new Scanner(System.in);

		System.out.println("---- No intervalo entre 10 e 100 ------");
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1 > num2) {
			System.out.println("Intervalo Inválido!");

		} else {
			for (contador = num1; contador <= num2; contador = contador + 1) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println("No intervalo entre " + num1 + " e " + num2);
					System.out.println(contador + " é múltiplo de 3 e 5.");
				}
			}
			
			
		}

		

	}

}
