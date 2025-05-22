package controller;

import model.Login;

public class LoginDuasEtapasAdapter implements IServLogin{
	LoginDuasEtapas lde;
	
	public LoginDuasEtapasAdapter(LoginDuasEtapas lde) {
		this.lde = lde;
	}

	@Override
	public void logar(Login login) {
     	lde.fazerLogin(login.getUsuario());
		lde.confirmarSegundaEtapa(login.getChaveConfirmacao());
	}
}
