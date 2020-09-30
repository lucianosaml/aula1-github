package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CadFuncionario;

public class folhaPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CadFuncionario cadfunc = new CadFuncionario(); 
		
		System.out.print("Nome do funcionário: ");
		cadfunc.nome = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		cadfunc.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto devido: ");
		cadfunc.imposto = sc.nextDouble();
		
		System.out.println(""+ cadfunc);
		
		System.out.print("Taxa de aumento: ");
		cadfunc.taxaAumento = sc.nextDouble();
		
		System.out.println(""+ cadfunc.Aumento());
		
		sc.close();

	}

}
