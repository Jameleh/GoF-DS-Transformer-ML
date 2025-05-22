/* 413226087 李柏翰 */
/* 413085043 謝慶章 */

public class Main {
    public static void main(String[] args) {
        Company company = new Company(5);

        company.addDepartment("行政部");
        company.addDepartment("總務部");
        company.addDepartment("行銷部");
        company.addDepartment("業務部");
        company.addDepartment("生產部");

        IIterator iterator = company.getIterator();
        System.out.println("Company Departments:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
