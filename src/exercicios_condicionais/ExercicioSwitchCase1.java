package exercicios_condicionais;

import java.util.Scanner;

public class ExercicioSwitchCase1 {

	public static void main(String[] args) {
		
		int numero;
		int valorX = 0;
		int unidades;
		float total;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println(" --------------- Cardápio ------------------");
		System.out.println(" Digite 1 ------------------ Cachorro Quente");
		System.out.println(" Digite 2 ------------------------- X-Salada");
		System.out.println(" Digite 3 -------------------------- X-Bacon");
		System.out.println(" Digite 4 ---------------------------- Bauru");
		System.out.println(" Digite 5 --------------------- Refrigerante");
		System.out.println(" Digite 6 ------------------ Suco de laranja");
		
		System.out.println("Digite a opção desejada: ");
		numero = leia.nextInt();
		System.out.println("Quantas unidades deseja? ");
		unidades = leia.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Cachorro Quente");
			valorX = unidades * 10;
			System.out.println("Valor total é de R$" + valorX);
			break;
		case 2:
			System.out.println("X-Salada");
			valorX = unidades * 15;
			System.out.println("Valor total é de R$" + valorX);
			break;
		case 3:
			System.out.println("X-Bacon");
			valorX = unidades * 18;
			System.out.println("Valor total é de R$" + valorX);
			break;
		case 4:
			System.out.println("Bauru");
			valorX = unidades * 12;
			System.out.println("Valor total é de R$" + valorX);
			break;
		case 5:
			System.out.println("Refrigerante");
			valorX = unidades * 8;
			System.out.println("Valor total é de R$" + valorX);
			break;
		case 6:
			System.out.println("Suco de laranja");
			valorX = unidades * 13;
			System.out.println("Valor total é de R$" + valorX);
			break;
		default:
			System.out.println("Opção inválida." );
		}
		
	}

}
