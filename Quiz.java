
public class Quiz {
	private String respostas [] = new String [4];
	private String perguntas [] = new String [4];
	private String nome;
	
	public  Quiz () {
		setPergunta();
		setResposta();
	}
	
	public String getNome () {
		return nome ;
	}
	
	public void setNome (String vnome) {
		this.nome = vnome;
	}
	
	private void setPergunta (){
		perguntas [0] = "1 - identifique a instru��o para selecionar um dos muitos blocos de c�digo a serem executados. : 1) while, 2) for ou 3) switch ";
		perguntas [1] = "2 - identifique a instru��o que pode ser usada para sair de um loop. : 1) continue, 2) break ou 3) go ";
		perguntas [2] = "3 - As matrizes s�o usadas para armazenar v�rios valores em uma �nica vari�vel. : 1) Sim ou 2) N�o";
		perguntas [3] = "4 - O objetivo do polimorfismo � garantir que dados confidenciais sejam ocultados dos usu�rios. :  1) Sim ou 2) N�o";
	
	}
	
	public String getPergunta (int numero) {
		
		return perguntas[numero];
	}
	
	private  void setResposta(){
		respostas [0] =  "3";
		respostas [1] =  "2";
		respostas [2] =  "1";
		respostas [3] =  "2";
	}
	
	public String getResposta (int numero) {
		
		return respostas[numero];
	}
	
	public int getTamanho () {
		return perguntas.length;
	}
	

}
