package dp_facade;

public class Combo {

    public void criarCombo(int tipoCombo) {
        Burger burger = new Burger();
        Sobremesa sobremesa = new Sobremesa();
        Bebida bebida = new Bebida();

        switch (tipoCombo) {
            case 1:
                configurarCombo(burger, "X-Burger", 6.0, 100,
                                sobremesa, "Casquinha", 4.0, "Pequena",
                                bebida, "Latinha", 4.0, 220);
                break;

            case 2:
                configurarCombo(burger, "Big Macintosh", 20.0, 450,
                                sobremesa, "Sundae Pro Max", 23.00, "Grande",
                                bebida, "ICoke 13", 12.0, 700);
                break;

            default:
                System.out.println("Opção inválida!");
                return;
        }

        exibirDetalhesCombo(burger, sobremesa, bebida);
    }

    private void configurarCombo(Burger burger, String descBurger, double precoBurger, int gramasBurger,
                                 Sobremesa sobremesa, String descSobremesa, double precoSobremesa, String tamanhoSobremesa,
                                 Bebida bebida, String descBebida, double precoBebida, int mlBebida) {
        burger.setDescricao(descBurger);
        burger.setPreco(precoBurger);
        burger.setGramas(gramasBurger);

        sobremesa.setDescricao(descSobremesa);
        sobremesa.setPreco(precoSobremesa);
        sobremesa.setTamanho(tamanhoSobremesa);

        bebida.setDescricao(descBebida);
        bebida.setPreco(precoBebida);
        bebida.setMl(mlBebida);
    }

    private void exibirDetalhesCombo(Burger burger, Sobremesa sobremesa, Bebida bebida) {
        double valorFinal = burger.getPreco() + sobremesa.getPreco() + bebida.getPreco();

        System.out.println("Preço: " + valorFinal);
        System.out.println("\nBurger: " + burger.getDescricao());
        System.out.println("Preço: " + burger.getPreco());
        System.out.println("Gramas: " + burger.getGramas());

        System.out.println("\nSobremesa: " + sobremesa.getDescricao());
        System.out.println("Preço: " + sobremesa.getPreco());
        System.out.println("Tamanho: " + sobremesa.getTamanho());

        System.out.println("\nBebida: " + bebida.getDescricao());
        System.out.println("Preço: " + bebida.getPreco());
        System.out.println("Quantidade: " + bebida.getMl());
    }
}
