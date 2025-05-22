public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " +
                "firstName: " + firstName + '\'' +
                ", lastName: " + lastName + '\'' +
                ", age: " + age +
                ", address: " + address + '\'';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        public PersonBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public PersonBuilder setFirstName(String fistName) {
            this.firstName = fistName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
