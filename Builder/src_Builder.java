// Classe abstrara ou interface. Define as etapas que devem ser executadas. construir um objeto passo a passo.

public interface Builder {
    void reset();
    void setNome(String nome);
    void setSobrenome(String sobrenome);
    void setUserName(String userName);
    void setEmail(String email);
    void setIdade(int idade);
    void setEndereco(String endereco);
    void setTrabalho(String trabalho);
}