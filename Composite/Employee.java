/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* COMPONENT CLASS work about COMPOSITE CLASS and LEAF CLASS */
public class Employee {
    private String name;
    private String position;
    private int salary;
    /* Composite Relation, store list object */
    public List<Employee> children = new ArrayList<>();
    
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String dept) {
        this.position = dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /* UNIFORM INTERFACE */
    public void print(StringBuilder stringBuilder, int depth) {
        stringBuilder.append(String.join("", Collections.nCopies(depth, "")))
                .append(depth > 0 ? "" : "")
                .append("Employee :[ Name: ").append(getName())
                .append(", Position: ").append(getPosition())
                .append(", Salary: ").append(getSalary())
                .append(" ]\n");
        /* IF HAVE CHILDREN */
        for (Employee child : children) {
            child.print(stringBuilder, depth + 1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }
}