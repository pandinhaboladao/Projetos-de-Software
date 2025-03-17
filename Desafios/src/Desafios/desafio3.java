package Desafios;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double emprestimo;
		int parcelas;
		
		//Pedindo o valor do emprestimo
		System.out.println("Digite o valor do empréstimo: ");
		emprestimo = scanner.nextDouble();
		
		//Pedindo número de parcelas
		System.out.println("Digite o número de parcelas");
		System.out.println("1 - 6 meses");
		System.out.println("2 - 12 meses");
		System.out.println("3 - 24 meses");
		parcelas = scanner.nextInt();
		
		//Calculando o valor final com taxas
		switch(parcelas) {
			case 1:
				System.out.println("O valor final do empréstimo com as taxas será: " + (emprestimo + (emprestimo * 0.05)));
				break;
			case 2:
				System.out.println("O valor final do empréstimo com as taxas será " + (emprestimo + (emprestimo * 0.1)));
				break;
			case 3:
				System.out.println("O valor final do empréstimo com as taxas será " + (emprestimo + (emprestimo * 0.2)));
				break;
			default:
				System.out.println("Opção Inválida");
				break;
		}
		
		scanner.close();

	}

}
