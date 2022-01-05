
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
		perguntas [0] = "1 - identifique a instrução para selecionar um dos muitos blocos de código a serem executados. : 1) while, 2) for ou 3) switch ";
		perguntas [1] = "2 - identifique a instrução que pode ser usada para sair de um loop. : 1) continue, 2) break ou 3) go ";
		perguntas [2] = "3 - As matrizes são usadas para armazenar vários valores em uma única variável. : 1) Sim ou 2) Não";
		perguntas [3] = "4 - O objetivo do polimorfismo é garantir que dados confidenciais sejam ocultados dos usuários. :  1) Sim ou 2) Não";
	
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
