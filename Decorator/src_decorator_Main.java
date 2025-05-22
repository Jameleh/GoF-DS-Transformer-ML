package decorator;

import java.util.Scanner;
/**
 *
 * @author Ygor
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Programação Avançada - Padrão Decorator\n");
        System.out.println("Digite uma das opções abaixo: \n");
        System.out.println("1 - Criar Pinheiro3d");
        System.out.println("2 - Criar Pinheiro de Crochê");
        System.out.println("3 - Criar Pinheiro de Papel");
        System.out.println("4 - Sair");
        
        int entrada = input.nextInt();
        while(entrada > 4){
            System.out.print("Opção não existe digite novamente: ");
            entrada = input.nextInt();
        }
        switch(entrada){
            case 1:
                System.out.println("Deseja adicionar enfeites?");
                System.out.println("1 - SIM");
                System.out.println("2 - NÃO");
                int entrada2 = input.nextInt();
                while(entrada2 > 2){
                System.out.print("Opção não existe digite novamente: ");
                entrada2 = input.nextInt();
                }
                switch(entrada2){
                    case 1:
                        ArvoreDeNatal arvore1 = new Boneco(new Bolinha(new Luzes(new Laco(new Pinheiro3d("Pinheiro 3D")))));
                        arvore1.adicionar();
                        break;
                    case 2:
                        arvore1 = new Pinheiro3d("Pinheiro 3D");
                        arvore1.adicionar();
                        break;
                }
                break;
            case 2:
                System.out.println("Deseja adicionar enfeites?");
                System.out.println("1 - SIM");
                System.out.println("2 - NÃO");
                int entrada3 = input.nextInt();
                while(entrada3 > 2){
                System.out.print("Opção não existe digite novamente: ");
                entrada3 = input.nextInt();
                }
                switch(entrada3){
                    case 1:
                        ArvoreDeNatal arvore2 = new Boneco(new Bolinha(new Luzes(new Laco(new PinheiroDeCroche("Pinheiro de Crochê")))));
                        arvore2.adicionar();
                        break;
                    case 2:
                        arvore2 = new PinheiroDeCroche("Pinheiro de Crochê");
                        arvore2.adicionar();
                        break;
                }
                break;
            case 3:
                System.out.println("Deseja adicionar enfeites?");
                System.out.println("1 - SIM");
                System.out.println("2 - NÃO");
                int entrada4 = input.nextInt();
                while(entrada4 > 2){
                System.out.print("Opção não existe digite novamente: ");
                entrada4 = input.nextInt();
                }
                switch(entrada4){
                    case 1:
                        ArvoreDeNatal arvore3 = new Boneco(new Bolinha(new Luzes(new Laco(new PinheiroDePapel("Pinheiro de Papel")))));
                        arvore3.adicionar();
                        break;
                    case 2:
                        arvore3 = new PinheiroDePapel("Pinheiro de Papel");
                        arvore3.adicionar();
                        break;
                }
                break;
            case 4:
                System.out.println("Saindo...");
                break;
        }
        
    }
    
}
