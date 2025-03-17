package Desafios;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double compra;
		int quant;
		double desconto = 0;
		
		//Pedindo infos
		System.out.println("Digite o valor da compra: ");
		compra = scanner.nextDouble();
		
		System.out.println("Digite o número de itens adquiridos: ");
		quant = scanner.nextInt();
		
		double valorTotal = compra * quant;
		
		//Calculando
		if(valorTotal > 1000) {
			desconto = 0.2;
		}
		else if(valorTotal > 100 || quant > 5) {
			desconto = 0.1;
		}
		else if(valorTotal > 300 || quant > 3){
			desconto = 0.05;
		}
		else {
			desconto = 0;
		}
		
		//Resultado
		if(desconto > 0) {
			System.out.println("O valor total com desconto ficou: R$" + (valorTotal - (valorTotal * desconto)));
		}
		else {
			System.out.println("O valor total sem descontos ficou: R$" + valorTotal);
		}
		
		scanner.close();

	}

}
