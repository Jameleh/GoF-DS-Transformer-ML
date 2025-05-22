public class Person {

    private String firtName;
    private String lastName;
    private int age;
    private String address;

    public Person(PersonBuilder personBuilder){
        this.firtName = personBuilder.firtName;
        this.lastName = personBuilder.lastName;
        this.address = personBuilder.address;
        this.age = personBuilder.age;
    }

    @Override
    public String toString() {
        return "Name: " + firtName + " Surname: " + lastName + " Age: " + age + " Address: " + address;
    }

    public static class PersonBuilder {

        private String firtName;
        private String lastName;
        private int age;
        private String address;

        public PersonBuilder(String firstName, String lastName){
            this.firtName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setEta(int age) throws AgeErrorException{
            if(age < 0){
                throw new AgeErrorException("Errore: età minore di zero");
            }
            this.age = age;
            return this;
        }

        public void setFirtName(String firtName) {
            this.firtName = firtName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
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
