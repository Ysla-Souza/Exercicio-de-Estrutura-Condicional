package curso_programacao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um n?mero inteiro, e depois dizer se este n?mero ? negativo ou n?o.
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o Numero: ");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
	
		}
		sc.close();
	}	
	
		
}
