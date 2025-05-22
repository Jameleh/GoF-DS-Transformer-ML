package factory.method;

import java.util.Scanner;
/**
 *
 * @author Ygor
 */
public class Main {

    	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Programação Avançada - Padrão Factory Method\n");
                
                System.out.println("Digite o número correspondente a classe:\n1 - Assassino\n2 - Mago\n3 - Guerreiro");
                int input = scan.nextInt();
                while(input > 3){
                    System.out.println("Opção não existe, digite novamente: ");
                    input = scan.nextInt();
                }
                
                System.out.println("Informe seu nick: ");
                String input2 = scan.next();
                
                System.out.println("");
                System.out.println("Personagem criado com sucesso!\n");
                System.out.println("Informações iniciais.");
                System.out.println("Nick: "+input2);
                criarPersonagem(input);
                
	}
	
	public static void criarPersonagem(int p) {
		PersonagemFactory personagem = null;
                switch (p) {
                    case 1:
                        personagem = new AssassinoFactory();
                        break;
                    case 2:
                        personagem = new MagoFactory();
                        break;
                    case 3:
                        personagem = new GuerreiroFactory();
                        break;
                    default:
                        break;
                }
		personagem.criarPersonagem();
		personagem.exibirPersonagem();
                
	}
    
}
