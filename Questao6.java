
     import java.util.Scanner;

	public class Questao6 {

		public static void main(String[] args) {
			 
			String resp;
			int contaAcertos = 0;
			int contaErros= 0; 
			
			Scanner ler = new Scanner(System.in);
		
			Quiz meuQuiz = new Quiz ();
		
			System.out.println("Digite seu nome : ");
			meuQuiz.setNome(ler.nextLine());
			
			for (int i=0 ; i < meuQuiz.getTamanho() ; i++) {
				System.out.println(meuQuiz.getPergunta(i));
				resp = ler.nextLine();
				
				if (resp.equals(meuQuiz.getResposta(i))) {
					   System.out.println ("Voc� acertou");
					   contaAcertos ++;
				} else {
					   System.out.println ("Voc� errou");
					   contaErros++;
				}
			}	
			System.out.println ("\nUsu�rio:" + meuQuiz.getNome() );
			System.out.println ("Voc� acertou: " + contaAcertos + "vezes." );
			System.out.println ("Voc� errou: " + contaErros + "vezes.");
		}
	}


