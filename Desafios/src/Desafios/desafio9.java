package Desafios;

import java.util.Scanner;

public class desafio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		//Pedindo infos com while
		System.out.println("Digite vários números e quando quiser parar, digite 0: ");
		while (true) {
			num = scanner.nextInt();
			
			//Quebrando quando escrever 0
			if(num == 0) {
				break;
			}
			
			//Formando pares e impares
			if(num % 2 == 0) {
				par += num;
			}
			else {
				impar += num;
			}
		}
		
		System.out.println("O total de número pares é: " + par + " e o total de números ímpares é: " + impar);

		scanner.close();

	}

}
