public class Resume extends Docs{
    public Resume(String name) {
        this.setType("Resume");
        this.setName(name);
    }

    @Override
    protected Docs clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }
}
