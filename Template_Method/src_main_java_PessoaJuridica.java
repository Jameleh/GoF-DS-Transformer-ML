public class PessoaJuridica extends Pessoa{

    private String cnpj;


    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public float calculateTax() {
        float tax;

        if (getIncome() < 1000) {
            tax = getIncome() * 0.05f;
        } else if (getIncome() < 10000) {
            tax = getIncome() * 0.1f;
        } else {
            tax = getIncome() * 0.15f;
        }

        return tax;
    }

    @Override
    public String description() {
        String size = "";
        if (getIncome() < 1000) {
            size = "pequena";
        } else if (getIncome() < 10000) {
            size = "média";
        } else {
            size = "grande";
        }

        return "Pessoa Jurídica (" + this.cnpj + ", " + size + ")";
    }
}
