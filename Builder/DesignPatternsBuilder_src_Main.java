public class Main {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("Giacomo","Verdi").setAge(19).setAddress("Via Galbani").build();
        Person person1 = new Person.PersonBuilder("Mario","Rossi").setAge(24).setAddress("Via Marzo").build();

        System.out.println(person + "\n" + person1);
    }
}