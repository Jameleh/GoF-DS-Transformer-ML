package senders;

public class EmailSender implements Sender {

	private String mensagem;
	private String sender = "por Email";
	
	@Override
	public String getSender() {
		return (this.mensagem+" "+this.sender);
	}

	@Override
	public void setSender(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
