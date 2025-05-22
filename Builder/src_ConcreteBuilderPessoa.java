// Implementa a interface do Builder. Contem as funcionalidades para criar um Objeto
// onde cada método constrói uma parte do objeto Pessoa.

public class ConcreteBuilderPessoa implements Builder {

    private Pessoa.BuilderPessoa builder;

    // Construtor da classe
    public ConcreteBuilderPessoa() {
        this.builder = new Pessoa.BuilderPessoa();
    }

    // Método que reinicia o processo de construção.
    @Override
    public void reset() {
        this.builder = new Pessoa.BuilderPessoa();
    }

    // Define o nome da pessoa no objeto builder.
    @Override
    public void setNome(String nome) {
        builder.nome(nome); // Chama o método nome() do BuilderPessoa
    }

    @Override
    public void setSobrenome(String sobrenome) {
        builder.sobrenome(sobrenome);
    }

    @Override
    public void setUserName(String userName) {
        builder.userName(userName);
    }

    @Override
    public void setEmail(String email) {
        builder.email(email);
    }

    @Override
    public void setIdade(int idade) {
        builder.idade(idade);
    }

    @Override
    public void setEndereco(String endereco) {
        builder.endereco(endereco);
    }

    @Override
    public void setTrabalho(String trabalho) {
        builder.trabalho(trabalho);
    }

    // Esse método chama build() no BuilderPessoa, que retorna o objeto Pessoa
    // construído.
    public Pessoa getProduct() {
        return builder.build();
    }
}