import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployee{
    private String name;
    private String position;
    private int salary;
    private List<IEmployee> subordinates;

    public Manager(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(IEmployee component) {
        subordinates.add(component);
    }

    @Override
    public void print() {
        System.out.println("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
        for (IEmployee subordinate : subordinates) {
            subordinate.print();
        }

    }
}
