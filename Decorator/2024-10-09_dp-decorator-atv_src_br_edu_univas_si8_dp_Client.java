package br.edu.univas.si8.dp;

public class Client {
	
	public static void main(String[] args) {
		
		/*
		Implemente um projeto para uma montadora da Citroen utilizando o Design Pattern Decorator conforme instruções abaixo:
			• Projeto deve refletir a venda de automóveis;
			• Deverá retornar o nome do veículo, a versão, o valor do veículo, o valor adicional da versão e o valor total;
			• Implementar como exemplo a venda do C4 Cactus;
			• Oferecer as versões Live (de entrada), Feel (com acréscimo de 3mil) e Shine (com acréscimo de 5mil)
		*/
		
		C4Cactus c1 = new C4Cactus();
		System.out.println("Product:");
		System.out.println("Nome: " 		+ c1.getName());
		System.out.println("Versao: " 		+ c1.getVersion());
		System.out.println("Preco: " 		+ c1.getPrice());
		System.out.println("Preco Versao: " + c1.getAddVersionPrice());
		System.out.println("Preco Total: " 	+ c1.getTotalPrice());
		
		System.out.println("\n");
		
		Decorator c2 = new Decorator(c1);
		System.out.println("Decorator:");
		System.out.println("Nome: " 		+ c2.getName());
		System.out.println("Versao: " 		+ c2.getVersion());
		System.out.println("Preco: " 		+ c2.getPrice());
		System.out.println("Preco Versao: " + c2.getAddVersionPrice());
		System.out.println("Preco Total: " 	+ c2.getTotalPrice());
		
		System.out.println("\n");
		
		Live c3 = new Live(c1);
		System.out.println("Live:");
		System.out.println("Nome: " 		+ c3.getName());
		System.out.println("Versao: " 		+ c3.getVersion());
		System.out.println("Preco: " 		+ c3.getPrice());
		System.out.println("Preco Versao: " + c3.getAddVersionPrice());
		System.out.println("Preco Total: " 	+ c3.getTotalPrice());
		
		System.out.println("\n");
		
		Feel c4 = new Feel(c1);
		System.out.println("Feel:");
		System.out.println("Nome: " 		+ c4.getName());
		System.out.println("Versao: " 		+ c4.getVersion());
		System.out.println("Preco: " 		+ c4.getPrice());
		System.out.println("Preco Versao: " + c4.getAddVersionPrice());
		System.out.println("Preco Total: " 	+ c4.getTotalPrice());
		
		System.out.println("\n");
		
		Shine c5 = new Shine(c1);
		System.out.println("Shine:");
		System.out.println("Nome: " 		+ c5.getName());
		System.out.println("Versao: " 		+ c5.getVersion());
		System.out.println("Preco: " 		+ c5.getPrice());
		System.out.println("Preco Versao: " + c5.getAddVersionPrice());
		System.out.println("Preco Total: " 	+ c5.getTotalPrice());
	}
}
