package vetores;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		float media = 0;
		int soma = 0;
		
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			numeros[indice] = leia.nextInt();
		}
		
		System.out.println("Os elementos nos índices ímpares são: ");
		 for (int indice = 0; indice < 10; indice++) {
			 if (numeros[indice] % 2 != 0) {
				System.out.println(numeros[indice] + " ");
				} 	
			}
		 
		 System.out.println("Os elementos nos índices pares são: ");
		  for (int indice = 0; indice < 10; indice++) {
			  if (numeros[indice] % 2 == 0) {
				System.out.println(numeros[indice] + " "); 
			  }
			  soma = soma + numeros[indice];
			  media = soma/10;
		  }
		  System.out.println("A soma é: " + soma); 
		  System.out.printf("A média é %.2f. ", media);
		  leia.close();
	}
	
}
