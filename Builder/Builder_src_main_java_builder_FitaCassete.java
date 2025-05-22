package builder;

import java.util.Date;

public class FitaCassete {
    private int id;
    private String nomeFita;
    private Date dataLocacao;
    private String prateleira;

    public FitaCassete(){
        this.id = 0;
        this.nomeFita = "";
        this.prateleira = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFita() {
        return nomeFita;
    }

    public void setNomeFita(String nomeFita) {
        this.nomeFita = nomeFita;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }


    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }
}
