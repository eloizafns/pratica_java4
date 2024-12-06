package exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String corX; //variável para pegar os dados do usuário.
		int indice; //Para iniciar o loop.

		for (indice = 0; indice < 5; indice++) { //loop para solicitar as 5 cores
			System.out.println("Olá! Digite 5 cores: ");
			corX = leia.next();
			cores.add(corX); //as cores serão adicionadas e armazenadas aqui
		}
		
		System.out.println("Listar todas as cores: ");
		for (String cor : cores) { //For Each. Variável local + collection que irá percorrer
			System.out.println(cor);
		}
		;

		cores.sort(null); //Ondem alfabética
		System.out.println("Ordenar as cores: ");
		for (String cor : cores) { //For Each
			System.out.println(cor);
		}

	}

}
