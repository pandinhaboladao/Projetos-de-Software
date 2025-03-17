package Desafios;

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idade, anos;
		String sexo;
		double salario = 0;
		
		//Pedindo infos
		System.out.println("Digite a sua idade: ");
		idade = scanner.nextInt();
		
		System.out.println("Digite o seu sexo: ");
		sexo = scanner.next().toUpperCase(); //Conversão para caixa alta para melhor comparacao
		
		System.out.println("Digite seus anos de experiência como motorista: ");
		anos = scanner.nextInt();
		
		//Calculando
		if(sexo.equals("MASCULINO") && idade < 25 && anos < 2) {
			salario = 2000;
		}
		else if(sexo.equals("FEMININO") && idade < 25 && anos < 2) {
			salario = 1800;
		}
		else if(idade > 25 && anos > 2) {
			salario = 1200;
		}
		else{
			salario = 0;
			
		}
		
		//Resultado
		if (salario > 0) {
			System.out.println("O seu salário é: R$" + salario);
		}
		else {
			System.out.println("Você não se enquadra nas condições especificadas");
		}
		
		scanner.close();

	}

}
