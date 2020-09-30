package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//-------------------------------------------------------------------- Exemplo 1		
//		System.out.printf("Enter account number:  ");
//		int number = sc.nextInt();
//		System.out.printf("Enter account holder: ");
//		String name = sc.next();
//		System.out.printf("Is there na initial desopit (y/n)? ");
//		char resp = sc.next().charAt(0);
//		System.out.printf("Enter initial deposit value: ");
//		double value = sc.nextDouble();
//		
//		Account account = new Account(number, name, value);
//		System.out.println("\nAccount data: ");
//		System.out.printf("" + account + "\n");
//		 
//		System.out.printf("\nEnter deposit value: ");
//		double valor = sc.nextDouble();
//		account.deposit(valor);
//		
//		System.out.println("Updated account data:");
//		System.out.printf("" + account);
//		
//		System.out.println("\nAccount data: ");
//		System.out.printf("" + account + "\n");
//		 
//		System.out.printf("\nEnter a withdraw value: ");
//		valor = sc.nextDouble();
//		account.withdraw(valor);
//		
//		System.out.println("Updated account data:");
//		System.out.printf("" + account);
		
//-------------------------------------------------------------------- Exemplo 2
		System.out.printf("Enter account number:  ");
		int number = sc.nextInt();
		System.out.printf("Enter account holder: ");
		String name = sc.next();
		System.out.printf("Is there na initial desopit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		Account account = new Account(number, name);
		System.out.println("\nAccount data: ");
		System.out.printf("" + account + "\n");
		
		System.out.printf("\nEnter deposit value: ");
		double valor = sc.nextDouble();
		account.deposit(valor);
		System.out.println("\nAccount data: ");
		System.out.printf("" + account + "\n");
		
		System.out.printf("\nEnter a withdraw value: ");
		valor = sc.nextDouble();
		account.withdraw(valor);
		
		System.out.println("Updated account data:");
		System.out.printf("" + account);
		
		sc.close();
	}

}
