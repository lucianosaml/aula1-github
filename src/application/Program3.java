package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program3 {
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator(); a classe Calculator é static não precisa estânciar
				
		System.out.printf("Valor do raio:");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferência: %.2f \n", c);
		System.out.printf("Volume: %.2f \n", v);
		System.out.printf("Valor PI: %.2f \n", Calculator.PI);
		
		
		sc.close();
	}
	


}
