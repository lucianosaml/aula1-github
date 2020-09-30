package entities;

public class Boletim {
	public String nome;
	public double nota1, nota2, nota3, notafinal, faltou;
	
	public void notaFinal() {
		this.notafinal = (this.nota1 + this.nota2 + this.nota3);
	}
	
	public String resultado () {
		if(this.notafinal >= 60) {
			return "Passou!";
		}else {
			this.faltou = 60 - this.notafinal;
			return "Não passou!";
		}
		
	}
	
	public String toString() {
		if(this.notafinal >= 60) {
			return
			"Nota Final: "
			+ this.notafinal
			+ "\n"
			+ resultado()
			;
		}
		else {
			return
			"Nota Final: "
			+ this.notafinal
			+ "\n"
			+ resultado()
			+ "\nFaltou: "
			+ this.faltou
			+ " Pontos."
			;
		}
		
		
	}
}
