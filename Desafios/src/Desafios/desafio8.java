package Desafios;

import java.util.Scanner;

public class desafio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int cont = 0;
		double media = 0;
		
		//Pedindo infos com do while
		System.out.println("Digite vários números e quando quiser parar, digite 0: ");
		do {
			num = scanner.nextInt();
			if (num != 0) {
				media += num;
				cont++;
			}
			
		} while (num != 0);
		
		if(cont > 0) {
			media /= cont;
			System.out.println("A média dos números é: " + media);
		}
		else {
			System.out.println("Nenhum número foi digitado");
		}

		scanner.close();

	}

}
