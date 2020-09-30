package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Boletim;

public class cadAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Boletim bolAlun = new Boletim();
		
		System.out.print("Nome do aluno(a): ");
		bolAlun.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		bolAlun.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		bolAlun.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		bolAlun.nota3 = sc.nextDouble();
		bolAlun.notaFinal();
		
		System.out.println("" + bolAlun);
		
		sc.close();
	}

}
