package src.DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Responsabil implements Human{

    private String nume;

    private String prenume;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Responsabil(String nume, String prenume) {
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
        for (Human manager: managers) {
            System.out.println("  - Name : " + manager.getNume());
        }
        System.out.println("==============================");
    }


    @Override
    public void addResponsabil(Human responsabil) {

    }

    private List<Human> managers = new ArrayList<>();
    @Override
    public void addManager(Human manager) {
        managers.add(manager);
    }

    @Override
    public void addAdmin(Human admin) {

    }
}
