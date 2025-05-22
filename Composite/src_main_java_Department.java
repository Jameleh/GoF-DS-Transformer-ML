import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return components.stream().mapToDouble(OrganizationComponent::getSalary).sum();
    }

    @Override
    public String toXML(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        StringBuilder xml = new StringBuilder(indent + "<department name=\"" + name + "\">\n");
        for (OrganizationComponent component : components) {
            xml.append(component.toXML(indentLevel + 1)).append("\n");
        }
        xml.append(indent + "</department>");
        return xml.toString();
    }
}
