package vetores;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int x, indice;
		boolean encontrado = false;

		Scanner leia = new Scanner(System.in);

			System.out.println("Digite o número que você deseja encontrar: ");
			x = leia.nextInt();

			for (indice = 0; indice < 10; indice++) {
				if (numeros[indice] == x) {
					System.out.println("O número " + x + " está localizado na posição: " + indice);
					encontrado = true;
				} 
			}
			
			if (!encontrado) {
					System.out.println("O número " + x + " não foi encontrado!");
					leia.close();
				}

			}

	}


