
public class Funcionario {
	private String nome;
	private double salario; 
	private double bonus;
	private double salarioLiquido;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return nome;
	}

	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public double getSalario () {
		return salario;
	}
	
	public void setBonus (){
		double valor; 
		if (this.salario <= 1000) {
			valor = this.salario * 0.2;
		}else if (this.salario > 1000 && this.salario <= 2000) {
			valor = this.salario * 0.1;
		}else 
			valor = this.salario * 0.1 * -1;
		this.bonus = valor;
		setSalarioLiquido();
	}
	
	public double getBonus () {
		return bonus;
	}
	

	private void setSalarioLiquido() {
		this.salarioLiquido = this.salario + this.bonus;
	}
	
	public double getSalarioLiquido () {
		return salarioLiquido;
	}
}
