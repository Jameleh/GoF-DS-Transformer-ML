public class Student {
    //required information.
    private String name;
    private String university;

    //optional information
    private int age;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.university = studentBuilder.university;
        this.age = studentBuilder.age;
        
    } 

    public static class StudentBuilder {
    // the required information and cannot be changed.
    private final String name; 
    private final String university; 
    //  the optional information
    private int age; 

    public StudentBuilder(String name,String university) {
      this.name = name;
      this.university = university;
    }
    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }
    public Student build(){
      return new Student(this);
    }
    }

    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("name: " + name + "\n");
    sb.append("name: " + university + "\n");
    if (this.age != 0) {
      sb.append("Age : " + age + "\n");
    }
    return sb.toString();
  }
}
