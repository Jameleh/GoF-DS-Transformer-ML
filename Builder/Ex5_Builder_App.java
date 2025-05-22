public class App {
    public static void main(String[] args) {
        Student prayuth = new Student.StudentBuilder("Prayuth","Bobo University")
            .age(80)
            .build();
        System.out.println(prayuth);
    }
}
