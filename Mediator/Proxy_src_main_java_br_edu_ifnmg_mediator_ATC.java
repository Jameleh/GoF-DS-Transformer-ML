package br.edu.ifnmg.mediator;

import java.util.List;

/**
 *
 * @author analu
 */
public class ATC implements Mediator {

    String atcName;
    ATCMediator mediator;
    List<Plane> contactedPlanes;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public ATC(String atcName) {
        this.atcName = atcName;
    }
//</editor-fold>

    public void setContactedPlanes(List<Plane> contactedPlanes) {
        this.contactedPlanes = contactedPlanes;
    }

    public String getAtcName() {
        return atcName;
    }

    @Override
    public void execute() {
        mediator = new ATCMediator();
        try {
            mediator.setRunaway(this.contactedPlanes);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
