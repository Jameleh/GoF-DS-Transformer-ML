/* 413226087 李柏翰 */
/* 413085043 謝慶章 */

public class Company implements IDepartment {
    private String[] departments;
    private int count = 0;

    public Company(int maxCount) {
        departments = new String[maxCount];
    }

    public void addDepartment(String department) {
        if (count < departments.length) {
            departments[count++] = department;
        }
        else {
            System.out.println("Department is Full");
        }
    }

    public IIterator getIterator() {
        return new DepartmentIterator(departments);
    }
}
