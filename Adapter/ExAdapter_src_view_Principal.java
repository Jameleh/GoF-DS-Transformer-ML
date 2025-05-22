package view;

import controller.IServLogin;
import controller.LoginDuasEtapas;
import controller.LoginDuasEtapasAdapter;
import controller.LoginToken;
import controller.LoginTokenAdapter;
import model.Login;
import model.LoginBuilder;
import model.Usuario;

public class Principal {
	
	public static void main(String[] args) {
		Login login = LoginBuilder.builder()
				.addUsuario("123456", "Lucas")
				.addchaveConfirmacao(1)
				.addToken(987654321)
				.get();
		
	//	LoginDuasEtapas lde = new LoginDuasEtapas();
	//	IServLogin servLogin = new LoginDuasEtapasAdapter(lde);
		
		LoginToken lt = new LoginToken();
		IServLogin servLogin = new LoginTokenAdapter(lt);
		
		servLogin.logar(login);
	}
}
