package curso_programacao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//Fazer um programa para ler um n?mero inteiro e dizer se este n?mero ? par ou ?mpar
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o numero: ");
		num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
			sc.close();
	}

}
