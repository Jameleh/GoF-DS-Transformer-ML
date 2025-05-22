public abstract class Docs implements Cloneable {
    private String type;
    private String name ;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
      return name;
    }
    @Override
    public String toString() {
        return "Docs[type=" + getType() + ", name=" + getName() + "]";
    }

    @Override
    protected Docs clone() throws CloneNotSupportedException {
        return (Docs) super.clone();
    }
}
