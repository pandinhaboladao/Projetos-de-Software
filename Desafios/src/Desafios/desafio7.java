package Desafios;

import java.util.Scanner;

public class desafio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C;
		
		//Pedindo infos
		System.out.println("Digite o valor do lado A do triângulo: ");
		A = scanner.nextDouble();
		
		System.out.println("Digite o valor do lado B do triângulo: ");
		B = scanner.nextDouble();
		
		System.out.println("Digite o valor do lado C do triângulo: ");
		C = scanner.nextDouble();
		
		//Calculando
		if(A + B > C && A + C > B && B + C > A) {
			System.out.println("O triãngulo é válido");
			
			//Classificação de tipos
			if(A == B && B == C) {
				System.out.println("O triângulo é equilátero");
			}
			else if(A == B || A == C || B == C) {
				System.out.println("O triãngulo é isósceles");
			}
			else {
				System.out.println("O triãngulo é escaleno");
			}
		}
		else {
			System.out.println("O triângulo não é válido");
		}

		scanner.close();

	}

}
