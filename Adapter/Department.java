package AdapterDesignPattern;

public class Department {

    private faculty f;

    public faculty getF() {
        return f;
    }

    public void setF(faculty f) {
        this.f = f;
    }

    public void education(String str)
    {
         f.teaching(str);
    }

}
