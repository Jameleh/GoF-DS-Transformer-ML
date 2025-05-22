package src.DesignPatterns.Composite;

public class CompositeMain {

    public static void main(String[] args) {

        Responsabil codrin = new Responsabil("Codrin", "Le Codrin");
        Manager marin = new Manager("Marin", "Le Marin");
        Manager costel = new Manager("Costel", "Le Costel");

        codrin.addManager(marin);
        codrin.addManager(costel);
        marin.addResponsabil(codrin);
        costel.addManager(marin);
        costel.addResponsabil(codrin);

        Admin filip = new Admin("Filip", "Filip");

        filip.addResponsabil(marin);
        marin.addManager(costel);

        codrin.print();
        marin.print();
        costel.print();
    }
}
