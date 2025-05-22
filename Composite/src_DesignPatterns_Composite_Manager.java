package src.DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Human{

    private String nume;

    private String prenume;

    public Manager(String nume, String prenume) {
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
        System.out.println("Manageri :");
        for (Human manager: admins) {
            System.out.println("  - Name : " + manager.getNume());
        }
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

    private List<Human> admins = new ArrayList<>();
    @Override
    public void addManager(Human manager) {
        admins.add(manager);

    }

    @Override
    public void addAdmin(Human admin) {

    }
}
