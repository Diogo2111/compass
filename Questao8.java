import java.util.Scanner;
public class Questao8 {

	public static void main(String[] args) {
		int	num;
		String nome;
		double salario;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite a quantidade de funcionarios");
		num = Integer.parseInt(ler.nextLine());
		
		Funcionario[] empregados = new Funcionario[num];
		
		for (int i=0; i<num;i++) {	
			
			empregados[i] = new Funcionario();
		
			System.out.println("digite o nome do funcionario");
			nome = ler.nextLine();
			empregados[i].setNome(nome);
			
			System.out.println("digite o salario do funcionario");
			salario = Double.parseDouble(ler.nextLine());
			empregados[i].setSalario(salario);
			
			empregados[i].setBonus();
		}

		for (int i=0; i<num;i++) {
			System.out.println("\nfuncionario: " + empregados[i].getNome());
			System.out.println("salario: " + empregados[i].getSalario());
			if ( empregados[i].getBonus() > 0 )
				System.out.println("bonus: " + empregados[i].getBonus());
			else
				System.out.println("Desconto: " + (empregados[i].getBonus()*-1));
				
			System.out.println("salario liquido: " + empregados[i].getSalarioLiquido());
			
		}	
	}
}
