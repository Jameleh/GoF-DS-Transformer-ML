package adapter;

public class EmployeeDB implements Employee {

    String id;
    String firstName;
    String lastName;
    String email;
    public EmployeeDB(String id, String fname, String lname, String email){
        this.id = id;
        this.firstName = fname;
        this.lastName = lname;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
