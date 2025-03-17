package Desafios;

import java.util.Scanner;
import java.util.Random;

public class desafio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pegando número aleatorio de 1 a 10
		Random random = new Random();
        int numAleatorio = random.nextInt(10) + 1; //nextInt(10) gera numero aleatorio de 0 a 9
      
        int tentativa = 0;
 
        System.out.println("Tente adivinhar um número entre 1 e 10.");
        while (true) {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            
            if (tentativa < numAleatorio) {
                System.out.println("O número é maior. Tente novamente!");
            } else if (tentativa > numAleatorio) {
                System.out.println("O número é menor. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
                break; 
            }
        }

        scanner.close();
	}

}
