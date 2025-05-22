package br.edu.ifnmg.mediator;

/**
 *
 * @author analu
 */
public class Plane extends Thread {

    private ATC atc;
    private String planeName;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Plane(ATC atc, String planeName) {
        this.atc = atc;
        this.planeName = planeName;
    }
//</editor-fold>

    public String getPlaneName() {
        return planeName;
    }

    public String getATCName() {
        return this.atc.getAtcName();
    }
}
