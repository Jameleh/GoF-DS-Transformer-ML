package br.edu.univas.si8.dp;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("Atividade Design Patterns - Proxy\n");
		Proxy p1 = new Proxy();
		p1.request();
		
		Proxy p2 = new Proxy(new CamisaBrasil("2024"));
		p2.request();
		
		Proxy p3 = new Proxy(new CamisaComplemento("Assinatura"));
		p3.request();
		
		Proxy p4 = new Proxy(new CamisaBrasil("2024"), new CamisaComplemento("Assinatura"));
		p4.request();
		
		System.out.print("Fim!");
	}
}
