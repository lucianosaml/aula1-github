package entities;

public class CadFuncionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double taxaAumento;
	
	public double CalcSalario() {
		return this.salarioBruto - this.imposto;
	}
	
	public String Aumento(){
		return "Funcion�rio(a): "
				+ nome 
				+ " - Sal�rio: R$"
				+ String.format("% .2f", (this.salarioBruto * (1 + this.taxaAumento/100)));
	}
	
	public String toString() {
		return "Funcion�rio(a): "
				+ nome 
				+ " - Sal�rio: R$"
				+ String.format("% .2f",salarioBruto);
	}
	
}
