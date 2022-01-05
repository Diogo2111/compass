import java.util.Scanner;
public class Questao7 {

	public static void main(String[] args) {
 String login;
 String senha;
 
ValidaUsuario  user = new ValidaUsuario();
Scanner ler = new Scanner(System.in);
System.out.println ("digite o usuario");
login = ler.nextLine();
System.out.println ("digite a senha");
senha = ler.nextLine();

boolean acesso = user.validaLogin(login,senha) ;
System.out.println (user.getMensagem(acesso));
	}

}
