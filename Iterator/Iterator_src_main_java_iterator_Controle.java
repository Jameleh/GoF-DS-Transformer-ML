package iterator;

import java.util.Iterator;

public class Controle {

    public static Integer TorcedoresComTicket(Estadio estadio){
        int quantidadeTorcedoresComTicket =0;
        for(Torcedor torcedor: estadio){
            if(torcedor.getTicket()) quantidadeTorcedoresComTicket++;
        }
        return quantidadeTorcedoresComTicket;
    }

    public static Integer TotalTorcedores(Estadio estadio){
        int quantidadeTorcedores =0;
        for(Iterator a = estadio.iterator(); a.hasNext();){
            quantidadeTorcedores++;
            a.next();
        }
        return quantidadeTorcedores;
    }
}
