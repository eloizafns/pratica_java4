package exercicios_collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {

		Stack<String> lista = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		String livro;

		do {
			System.out.println("************* MENU ************");
			System.out.println("1- Adicionar livro na pilha.");
			System.out.println("2- Listar todos os livros.");
			System.out.println("3- Retirar livro da pilha.");
			System.out.println("0- Sair.");
			System.out.println("*******************************");
			System.out.println("Entre com a opção desejada: ");
			numero = leia.nextInt();

			switch (numero) {
			case 1:
				do {
					System.out.println("Digite o nome do livro: ");
					leia.skip("\\R?");
					livro = leia.nextLine();
					lista.push(livro);

					Iterator<String> iterator = lista.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("Livro adicionado!");
				} while (numero != 1);
				break;
			case 2:
				if (lista.isEmpty()) {
					System.out.println("A lista está vazia!");
				} else {
					System.out.println("Lista de cliente na fila: ");
					Iterator<String> iterator = lista.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;
			case 3:
				if (lista.isEmpty()) {
					System.out.println("A lista está vazia!");
				} else {
					lista.pop();
					Iterator<String> iterator = lista.iterator();

					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("Um livro foi retirado da pilha!");
				}

			}

		} while (numero != 0);
		System.out.println("Programa Finalizado!");
	}
}
