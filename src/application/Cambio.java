package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConveter;

public class Cambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual � o pre�o em d�lar: ");
		double cotacao = sc.nextDouble();
		
		System.out.printf("Quantos d�lares ser�o comprados: ");
		double quant = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais: %.2f \n", CurrencyConveter.dolar(cotacao, quant) );
		
		sc.close();
	}

}
