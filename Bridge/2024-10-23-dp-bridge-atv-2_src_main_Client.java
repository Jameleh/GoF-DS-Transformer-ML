package main;

import messages.EmailMessage;
import messages.TextMessage;
import senders.EmailSender;
import senders.SMSSender;

public class Client {
	
	public static void main(String[] args) {
		
		SMSSender ss = new SMSSender();
		TextMessage tm1 = new TextMessage(ss);
		EmailMessage em1 = new EmailMessage(ss);
		
		EmailSender es = new EmailSender();
		TextMessage tm2 = new TextMessage(es);
		EmailMessage em2 = new EmailMessage(es);
		
		tm1.EscreveMensagem();
		em1.EscreveMensagem();
		
		tm2.EscreveMensagem();
		em2.EscreveMensagem();
	}
}
