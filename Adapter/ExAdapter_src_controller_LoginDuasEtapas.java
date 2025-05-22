package controller;

import model.Usuario;

public class LoginDuasEtapas {
	public void fazerLogin(Usuario u) {
		System.out.println("Nome: " + u.getNome()+ " - Senha: "+u.getSenha()+" logado no sistema");	
	}
	public void confirmarSegundaEtapa(int chaveConfirmacao) {
		System.out.println("Login por duas etapas e esta È a chave de confirmacao: " 
							+ chaveConfirmacao);
	}
}
