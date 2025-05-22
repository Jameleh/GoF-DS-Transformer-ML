public class Builder {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Builder(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder setPhoneNumber(String phone) {
      this.phoneNumber = phone;
      return this;
    }

    public User build() {
      return new User(this.firstName,
                      this.lastName,
                      this.email,
                      this.phoneNumber);
    }

}
