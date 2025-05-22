package adapter;

public class CpfSemMascara implements ICpf{

    private String cpfComMascara;


    @Override
    public String getCpf() {
        return this.cpfComMascara;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpfComMascara = cpf;
    }
}
