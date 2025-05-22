package composite;

import java.util.Scanner;
/**
 *
 * @author Ygor
 */
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
                System.out.println("Programação Avançada - Padrão Composite\n");
                
                System.out.println("Digite o tipo da sua residência:");
                String resi = input.nextLine();
                System.out.println("");
                Localidade residencia = new LocalidadePrimitiva(resi);
		residencia.exibirLocalidade();
		System.out.println("------------------------\n");
		
                System.out.println("Digite seu Logradouro: ");
                String logra = input.nextLine();
                System.out.println("");
		LocalidadeComposta logradouro = new LocalidadeComposta(logra);
		logradouro.addLocalidade(residencia);
		logradouro.exibirLocalidade();
		System.out.println("------------------------\n");
                
                System.out.println("Digite seu Bairro: ");
                String bair = input.nextLine();
                System.out.println("");
                LocalidadeComposta bairro = new LocalidadeComposta(bair);
                bairro.addLocalidade(logradouro);
		bairro.exibirLocalidade();
		System.out.println("------------------------\n");
                
                System.out.println("Digite sua Cidade: ");
                String cida = input.nextLine();
                System.out.println("");
                LocalidadeComposta cidade = new LocalidadeComposta(cida);
                cidade.addLocalidade(bairro);
		cidade.exibirLocalidade();
		System.out.println("------------------------\n");
                
                System.out.println("Digite seu Estado: ");
                String esta = input.nextLine();
                System.out.println("");
                LocalidadeComposta estado = new LocalidadeComposta(esta);
                estado.addLocalidade(cidade);
		estado.exibirLocalidade();
		System.out.println("------------------------\n");
                
                System.out.println("Digite seu País: ");
                String pa = input.nextLine();
                System.out.println("");
                LocalidadeComposta pais = new LocalidadeComposta(pa);
                System.out.println("Sua localidade é composta por: \n");
                pais.addLocalidade(estado);
		pais.exibirLocalidade();
		System.out.println("------------------------\n");
    }
    
}
