public class Person {
    private String name;
    private int age;
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
    public static class Builder {
        private String name;
        private int age;
        public Builder(String name) {
            this.name = name;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Alice")
                .age(30)
                .build();
        Person person2 = new Person.Builder("Bob")
                .age(25)
                .build();
        System.out.println("Person 1: " + person1.toString());
        System.out.println("Person 2: " + person2.toString());
    }
}
