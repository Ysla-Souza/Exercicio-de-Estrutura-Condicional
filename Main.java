package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	//uma operadora de telefonia cobra R$ 50.00 por um plano basico que da direito a 100 minutos de telefone
	//Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00
	// Fazer um programa para çer a quantidade de minutos que uma pessoa consumiu dai mostra o valor a ser pago
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}
	System.out.printf("Valor da conta = R$ %.2f%n" , conta);
	
	sc.close();
	}
	

}
