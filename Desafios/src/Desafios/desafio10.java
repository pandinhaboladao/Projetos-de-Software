package Desafios;

import java.util.Scanner;

public class desafio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		//Pedindo info
		System.out.println("Digite um número interio e positivo: ");
		num = scanner.nextInt();
		
		//Calculando fatorial
		if(num < 0) {
			System.out.println("Número inválido");
		}
		else {
			long fatorial = 1;
			for(int i = 1; i <= num; i++) {
				fatorial *= i;
			}
			System.out.println("O fatorial de " + num + " é: " + fatorial);
		}

		scanner.close();

	}

}
