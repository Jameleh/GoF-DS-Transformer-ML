public class Main {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("Mario", "Rossi").build();
        person.setAge(29);
        Person person1 = new Person.PersonBuilder("Loris", "verdi").setAge(21).setAddress("Viale Primavera, 6").build();
        System.out.println(person);
        System.out.println(person1);


    }
}