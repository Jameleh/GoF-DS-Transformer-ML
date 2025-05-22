package adapter;

public class Cidadao {

    ICpf cpf;
    CpfAdapter persistencia;

    public Cidadao(){
        cpf = new CpfSemMascara();
        persistencia = new CpfAdapter(cpf);
    }

    public void setCpf(String cpfSemMascara){
        cpf.setCpf(cpfSemMascara);
        persistencia.salvarCpf();
    }

    public String getCpf(){
        return persistencia.recuperarCpf();
    }

    public String getCpfComMascara(){
        return persistencia.getCpfComMascara();
    }


}
