package exercicios_condicionais;

import java.util.Scanner;

public class ExercicioSwitchCase2 {

	public static void main(String[] args) {
		
		String nome;
		int cod;
		float salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite 1 para Gerente.");
		System.out.println("Digite 2 para Vendedor.");
		System.out.println("Digite 3 para Surpevisor.");
		System.out.println("Digite 4 para Motorista.");
		System.out.println("Digite 5 para Estoquista.");
		System.out.println("Digite 6 para Técnico de TI.");
		cod = leia.nextInt();
		
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		switch (cod ) {
		case 1:
			System.out.println("Olá, gerente " + nome);
			System.out.printf("Seu novo salário é de: %.2f.", salario * 1.1);
			break;
		case 2:
			System.out.println("Olá, vendedore " + nome);
			System.out.printf("Seu novo salário é de: %.2f.", salario * 1.07);
			break;
		case 3:
			System.out.println("Olá, supervisore " + nome);
			System.out.printf("Seu novo salário é de: %.2f.", salario * 1.09);
			break;
		case 4:
			System.out.println("Olá, motorista " + nome);
			System.out.printf("Seu novo salário é de: %.2f.", salario * 1.06);
			break;
		case 5:
			System.out.println("Olá, estoquista " + nome);
			System.out.printf("Seu novo salário é de: %.2f.", salario * 1.05);
			break;
		case 6:
			System.out.println("Olá, técnic " + nome);
			System.out.printf("Seu novo salário é de: %.2f.", salario * 1.08);
			break;
			
		}		
		

	}

}
