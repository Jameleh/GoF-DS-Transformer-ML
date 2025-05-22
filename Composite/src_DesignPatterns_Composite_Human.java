package src.DesignPatterns.Composite;

public interface Human {

    String getNume();
    String getPrenume();
    void print();
    void addResponsabil(Human responsabil);
    void addManager(Human manager);
    void addAdmin(Human admin);
}
