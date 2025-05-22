// Controle o Objeto do Produto Final. O Director chama os métodos do Builder em sequência
// Cada um desses métodos chama o método correspondente no BuilderPessoa, configurando os dados da pessoa.
public class Director {

    private Builder builder;

    // Construtor da Classe
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructCompletePessoa() {
        builder.setNome("Eduardo");
        builder.setSobrenome("Frainer");
        builder.setUserName("123456789");
        builder.setEmail("edu@gmail.com");
        builder.setIdade(15);
        builder.setEndereco("Rua navegantes casa 116");
        builder.setTrabalho("Banco do Brasil, Doutor Pedrinho, agencia 5441");
    }

    // Após o Director completar a configuração, o método getProduct() é chamado no
    // ConcreteBuilderPessoa.

}