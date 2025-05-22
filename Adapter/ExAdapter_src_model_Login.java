package model;

public class Login {
	
	private Usuario usuario;
	private int chaveConfirmacao;
	private int token;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getChaveConfirmacao() {
		return chaveConfirmacao;
	}
	public void setChaveConfirmacao(int chaveConfirmacao) {
		this.chaveConfirmacao = chaveConfirmacao;
	}
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "Login [usuario=" + usuario + ", chaveConfirmacao=" + chaveConfirmacao + ", token=" + token + "]";
	}
	
}
