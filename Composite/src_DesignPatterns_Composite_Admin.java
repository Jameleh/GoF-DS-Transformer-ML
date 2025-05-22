package src.DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Admin implements Human{

    private String nume;

    private String prenume;

    public Admin(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getPrenume() {
        return prenume;
    }


    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Nume : " + getNume());
        System.out.println("Prenume : " + getPrenume());
        System.out.println("Responsabili :");
        for (Human responsabil: responsabili) {
            System.out.println("  - Name : " + responsabil.getNume());
        }
        System.out.println("==============================");
    }

    private List<Human> responsabili = new ArrayList<>();
    @Override
    public void addResponsabil(Human responsabil) {
        responsabili.add(responsabil);
    }

    @Override
    public void addManager(Human manager) {

    }

    @Override
    public void addAdmin(Human admin) {

    }
}
