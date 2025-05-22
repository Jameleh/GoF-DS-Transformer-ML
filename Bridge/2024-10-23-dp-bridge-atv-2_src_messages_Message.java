package messages;

import senders.Sender;

public abstract class Message {
	
	protected Sender s;
	
	public Message(Sender s) {
		this.s = s;
	}

	public void EscreveMensagem() {};
}
