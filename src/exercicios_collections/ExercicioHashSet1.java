package exercicios_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioHashSet1 {

	public static void main(String[] args) {

		Set<Integer> setValores = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		int indice, numero;

		for (indice = 0; indice < 10; indice++) {
			System.out.println("Olá! Digite 10 valores inteiros: ");
			numero = leia.nextInt();
			setValores.add(numero);
		}
		
		System.out.println("Listar dados do Set: " + setValores);
	}

}
