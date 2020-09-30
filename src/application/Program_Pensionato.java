package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program_Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno[] quarto = new Aluno[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + (i+1));
			System.out.printf("Nome: ");
			String name = sc.nextLine();
			System.out.printf("E-mail: ");
			String email = sc.nextLine();
			System.out.printf("Nº do quarto: ");
			int num = sc.nextInt();
			quarto[num] = new Aluno(name, email);
			System.out.println("");
		}
		
//		System.out.println("Quartos ocupados: ");
//		for (int i = 0; i < quarto.length; i++) {
//			if (quarto[i] != null) {
//				System.out.println(i + ": " + quarto[i]);
//			}
//		}
		
		for (Aluno x : quarto) {
			if (x != null) {
				System.out.println(quarto.length + " - " + x);
			}
		}
		
		sc.close();

	}

}
