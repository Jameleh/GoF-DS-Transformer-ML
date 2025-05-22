public class Letter extends Docs{


    public Letter(String name) {
        this.setType("Letter");
        this.setName(name);
    }

    @Override
    protected Docs clone() throws CloneNotSupportedException {
        return (Letter) super.clone();
    }

}
