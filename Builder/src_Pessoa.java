// É Resposável pela difinir o tipo de Objeto(Product)
public class Pessoa {

    private String nome;
    private String sobrenome;
    private String userName;
    private String email;
    private int idade;
    private String endereco;
    private String trabalho;

    // Construtor privado, então ela só pode ser instanciada pela classe interna
    // BuilderPessoa.
    private Pessoa(String nome, String sobrenome, String userName, String email, int idade, String endereco,
            String trabalho) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.userName = userName;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
        this.trabalho = trabalho;
    }

    // Método toString para impressão dos dados
    @Override
    public String toString() {
        return "\n\nPessoa =\n{Nome = " + nome + "\nSobrenome = " + sobrenome + "\nUserName = " + userName
                + "\nEmail = "
                + email + "\nIdade = " + idade + "\nEndereco = " + endereco + "\nTrabalho = " + trabalho + "}\n";
    }

    // Subclasse dentro de Pessoa. Ela segue o padrão de construção em etapas, onde
    // cada método
    // (nome, sobrenome, etc.) Retorna o próprio builder para permitir encadeamento
    // de chamadas.
    public static class BuilderPessoa {
        private String nome;
        private String sobrenome;
        private String userName;
        private String email;
        private int idade;
        private String endereco;
        private String trabalho;

        public BuilderPessoa nome(String nome) {
            this.nome = nome;
            return this;
        }

        public BuilderPessoa sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public BuilderPessoa userName(String userName) {
            this.userName = userName;
            return this;
        }

        public BuilderPessoa email(String email) {
            this.email = email;
            return this;
        }

        public BuilderPessoa idade(int idade) {
            this.idade = idade;
            return this;
        }

        public BuilderPessoa endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public BuilderPessoa trabalho(String trabalho) {
            this.trabalho = trabalho;
            return this;
        }

        // Método para criar o objeto Pessoa
        public Pessoa build() {
            return new Pessoa(nome, sobrenome, userName, email, idade, endereco, trabalho);
        }
    }
}