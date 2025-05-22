package messages;

import senders.Sender;

public class TextMessage extends Message {
	
	public TextMessage(Sender s) {
		super(s);
	}

	@Override
	public void EscreveMensagem(){
		this.s.setSender("text message");
		System.out.println("Forma: "+s.getSender());
	}
	
}
