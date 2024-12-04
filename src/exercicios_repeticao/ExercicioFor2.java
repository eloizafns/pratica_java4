package exercicios_repeticao;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		
		int par = 0, impar = 0, numero, contador;
		Scanner leia = new Scanner(System.in);
				
		
		for(contador = 1; contador < 11; contador = contador +1) {
		System.out.println("Digite o " + contador + "º número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			par++;
		} else {
			impar++;
		}
		
	}
		System.out.println("Total de números pares " + par);
		System.out.println("Total de números ímpares " + impar);
		
}

}
