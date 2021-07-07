package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

	//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
	//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
	//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if(numero <= 25.0) {
			System.out.println("Intervalo de [0,25]");	
		}
		else if(numero <= 50.0) {
			System.out.println("Intervalo de [25,50]");
		}
		else if(numero <= 75.0) {
			System.out.println("Intervalo de [50,75]");	
		}
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}
		// a entrada deve ser inserida usando virgula
		// exemplo: 25,00
		

