package entities;

public class Account {
	private int numeroConta;
	private String cliente;
	private double saldo;
	
	public Account() {
	}

	public Account(int numeroConta, String cliente, double saldo) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Account(int numeroConta, String cliente) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double valor) {
		this.saldo += valor;
	}

	public void withdraw(double valor) {
		this.saldo -= valor + 5.00;
	}
	
	public String toString() {
		return
		"Account "
		+ numeroConta
		+", "
		+"Hold: "
		+ cliente
		+", "
		+"Balance: $"
		+ String.format("% .2f", saldo);
	}
	
}
