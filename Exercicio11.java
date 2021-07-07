package curso_programacao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a paga
		
		Scanner sc = new Scanner(System.in);
		  
		int codItem = sc.nextInt();
		int qtdItem = sc.nextInt();
		
		double total = 0;
		
		if(codItem == 1) {
			total = qtdItem * 4.0;
		}
		else if (codItem == 2) {
			total = qtdItem * 4.5;
		}
		else if(codItem == 3) {
			total = qtdItem * 5.0;
		}
		else if(codItem == 4) {
			total = qtdItem * 2.0;
		}
		else if(codItem == 5) {
			total = qtdItem * 1.5;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
	
}
