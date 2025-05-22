package model;

public class LoginBuilder {
	
	private Usuario usuario;
	private Login login;
	
	public LoginBuilder() {
		this.usuario = new Usuario();
		this.login = new Login();
	}
	
	public static LoginBuilder builder() {
		return new LoginBuilder();
	}
	
	public LoginBuilder addUsuario(String senha, String nome) {
		usuario.setSenha(senha);
		usuario.setNome(nome);
		return this;
	}
	
	public LoginBuilder addchaveConfirmacao(int chaveConfirmacao) {
		login.setChaveConfirmacao(chaveConfirmacao);
		return this;
	}
	
	public LoginBuilder addToken(int token) {
		login.setToken(token);
		return this;
	}
	
	public Login get() {
		login.setUsuario(usuario);
		return login;
	}
}
