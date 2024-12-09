package exercicios_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		LinkedList<String> fila = new LinkedList<String>();
		int numero = 0;
		Scanner leia = new Scanner(System.in);
		String cliente;

		do {

			System.out.println("*******************************");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("\n*****************************");
			System.out.println("Entre com a opção desejada: ");
			numero = leia.nextInt();

			switch (numero) {
			case 1:
				do {
					System.out.println("Digite o nome: ");
					cliente = leia.next();
					fila.add(cliente);

					Iterator<String> listarClientes = fila.iterator();

					while (listarClientes.hasNext()) {
						System.out.println(listarClientes.next());
					}

					System.out.println("Cliente adicionado!");
				} while (numero != 1);
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					System.out.println("Lista de clientes na Fila: ");
					Iterator<String> listarClientes = fila.iterator();

					while (listarClientes.hasNext()) {
						System.out.println(listarClientes.next());
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					fila.remove();
					Iterator<String> listarClientes = fila.iterator();

					while (listarClientes.hasNext()) {
						System.out.println(listarClientes.next());
					}
					System.out.println("O cliente foi Chamado!");
				}

			}

		} while (numero != 0);
		System.out.println("Programa Finalizado!");
	}

}
