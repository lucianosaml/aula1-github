package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Prog_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many employees will be registered? ");
		int N = sc.nextInt();
		
		Employee func = new Employee();
		List<Employee> list =  new ArrayList<>();
				
		for (int i = 0; i < N; i++) {
			System.out.println("Emplyoee #"+(i+1)+":");
			System.out.printf("Id: ");
			Integer id = sc.nextInt();
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			double salary = sc.nextDouble();
			func = new Employee(id, name, salary);
			list.add(func);
		}
		
		System.out.printf("\nEnter the employee id that will have salary increase: ");
		N = sc.nextInt();
		String result = "";
		
		for(Employee x : list) {
			if(x.getId() == N) {
				System.out.printf("Enter the percentage: ");
				double taxa = sc.nextDouble();
				x.increase(taxa);
			}else {
				result = "This id does not exist!";
			}
		}
		System.out.println(result + "\n");
		
		System.out.println("List of employees:");
		for(Employee x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
