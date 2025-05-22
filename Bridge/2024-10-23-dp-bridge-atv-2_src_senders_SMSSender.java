package senders;

public class SMSSender implements Sender {

	private String mensagem;
	private String sender = "por SMS";
	
	@Override
	public String getSender() {
		return (this.mensagem+" "+this.sender);
	}

	@Override
	public void setSender(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
