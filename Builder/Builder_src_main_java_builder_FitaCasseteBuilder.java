package builder;

import java.time.Instant;
import java.util.Date;

public class FitaCasseteBuilder {
    private FitaCassete fitaCassete;
    private Date hoje;

    public FitaCasseteBuilder(){
        fitaCassete = new FitaCassete();
        hoje = Date.from(Instant.now());
    }

    public FitaCassete build(){
        if(fitaCassete.getNomeFita().equals(""))
            throw new IllegalArgumentException("Nome de Fita inválido");
        if(fitaCassete.getId() < 1)
            throw new IllegalArgumentException("Id de Fita inválido");
        if(fitaCassete.getPrateleira().equals(""))
            throw new IllegalArgumentException("Prateleira da Fita inválida");
        if(fitaCassete.getDataLocacao().after(hoje))
            throw new IllegalArgumentException("Data de Locacao da Fita inválida");
        return fitaCassete;
    }

    public FitaCasseteBuilder setId(int id){
        fitaCassete.setId(id);
        return this;
    }

    public FitaCasseteBuilder setNomeFita(String nomeFita){
        fitaCassete.setNomeFita(nomeFita);
        return this;
    }

    public FitaCasseteBuilder setDataLocacao(Date dataLocacao){
        fitaCassete.setDataLocacao(dataLocacao);
        return this;
    }

    public FitaCasseteBuilder setPrateleira(String prateleira){
        fitaCassete.setPrateleira(prateleira);
        return this;
    }


}
