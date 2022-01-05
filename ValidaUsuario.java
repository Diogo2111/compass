import java.util.Calendar;
public class ValidaUsuario {

 private String	login [] = new String [5];
 private String senha [] = new String [5];
 
 public ValidaUsuario() {
	 setLogin();
	 setSenha();
 }

 public void setLogin () {
	 
	 login [0] = "Ana";
	 login [1] = "Pedro";
	 login [2] = "Bia";
	 login [3] = "Juca";
	 login [4] = "Carla";
	 
 }
public void setSenha () {
	 
	 senha [0] = "123456";
	 senha [1] = "654321";
	 senha [2] = "234567";
	 senha [3] = "765432";
	 senha [4] = "345678";
	 
 }
public String getLogin (int numero) {
	
	return login [numero];
}

public String getSenha (int numero) {
	
	return senha [numero];
}

public boolean validaLogin (String usuario, String senha) {
	boolean resp = false ;

	for (int i=0; i< login.length;i++) {
		if(usuario.equals(this.login[i]) && senha.equals(this.senha[i])) {
            resp= true; 
			break; 
		}
	}
	return resp;
}

public String getMensagem (boolean acesso ) {
	String msg="";
	if (!acesso) {
		msg = "Usuário e/ou senha incorretos." ;
	} else {
			Calendar calendario = Calendar.getInstance();
			int hora = calendario.get(Calendar.HOUR_OF_DAY);

			if(hora > 5 && hora < 12){
				msg = "Bom dia, você se logou ao nosso sistema";
			}else if (hora > 11 && hora < 18){
				msg = "Boa tarde, você se logou ao nosso sistema";
			}else if (hora > 17 && hora < 24){
				msg = "Boa noite, você se logou ao nosso sistema";
				
			}else if (hora >= 0 && hora < 6){
				msg = "Boa madrugada, você se logou ao nosso sistema";
				
			} 
	
	}
	return msg;
}
}
