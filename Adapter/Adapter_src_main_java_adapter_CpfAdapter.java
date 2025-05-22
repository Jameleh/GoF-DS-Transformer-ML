package adapter;

public class CpfAdapter extends CpfComMascara{

    private ICpf cpfSemMascara;

    public CpfAdapter(ICpf cpfSemMascara){
        this.cpfSemMascara = cpfSemMascara;
    }

    public String recuperarCpf(){
        if(this.getCpfComMascara() != null)
            cpfSemMascara.setCpf(removeMascaraCPF(this.getCpfComMascara()));
        return cpfSemMascara.getCpf();
    }

    public void salvarCpf(){
        if(cpfSemMascara.getCpf()!= null)
            this.setCpfComMascara(colocaMascaraCPF(cpfSemMascara.getCpf()));
    }

    private String removeMascaraCPF(String cpf){
        cpf = cpf.replace(".","");
        return cpf.replace("-","");
    }

    private String colocaMascaraCPF(String cpf){
        return (cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
    }
}
