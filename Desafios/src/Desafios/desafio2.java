package Desafios;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double real;
		int moeda;
		
		//Pedindo o valor em real
		System.out.println("Digite um valor em reais: ");
		real = scanner.nextDouble();
		
		//Pedindo o tipo de moeda
		System.out.println("Digite a moeda para qual deseja converter: ");
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Libra");
		moeda = scanner.nextInt();
		
		//Mostrando o resultado para cada tipo de moeda
		switch(moeda) {
			case 1: //Dólar
				System.out.println("O valor em dólar é: " + (real * 0.20));
				break;
			case 2: //Euro
				System.out.println("O valor em euro é: " + (real * 0.18));
				break;
			case 3: //Libra
				System.out.println("O valor em libra é: " + (real * 0.15));
				break;
			default:
				System.out.println("Opção Inválida");
		}
		
		scanner.close();

	}

}
