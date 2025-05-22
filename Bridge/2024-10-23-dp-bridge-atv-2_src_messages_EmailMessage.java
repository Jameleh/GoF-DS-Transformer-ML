package messages;

import senders.Sender;

public class EmailMessage extends Message {

	public EmailMessage(Sender s) {
		super(s);
	}

	@Override
	public void EscreveMensagem(){
		this.s.setSender("email message");
		System.out.println("Forma: "+s.getSender());
	}
	
}
