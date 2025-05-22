// Builder
public class App {

    public static void main(String[] args) {
        // Cria o ConcreteBuilderPessoa
        ConcreteBuilderPessoa builder = new ConcreteBuilderPessoa();

        // Cria o Director, que vai controlar o processo de construção
        Director director = new Director(builder);

        // Diretor constrói uma Pessoa completa
        director.constructCompletePessoa();

        // Obtém o objeto final (Pessoa) construído
        Pessoa pessoa = builder.getProduct();

        System.out.println(pessoa);
    }
}
