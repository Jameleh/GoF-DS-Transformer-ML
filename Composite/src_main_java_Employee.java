public class Employee extends OrganizationComponent {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        return indent + "<employee name=\"" + name + "\" salary=\"" + salary + " €\" />";
    }
}