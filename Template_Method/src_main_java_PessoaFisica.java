public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public float calculateTax() {
        return getIncome() * 0.1f;
    }

    @Override
    public String description() {
        return "Pessoa Física (" + this.cpf + ")";
    }
}
