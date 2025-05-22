public abstract class OrganizationComponent {
    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract String getName();
    public abstract double getSalary();
    public abstract String toXML(int indentLevel);
}
