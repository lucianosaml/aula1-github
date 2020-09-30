package entities;

public class Employee {
	private int Id;
	private String name;
	private Double salary;
	
	public Employee() {		
	}

	public Employee(int id, String name, Double salary) {
		Id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increase(double taxa) {
		this.salary *= (1+taxa);
	}
	
	public String toString() {
		return Id + ", " + name + ", " + salary;
	}


}
	
