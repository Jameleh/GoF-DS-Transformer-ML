public class Report extends Docs {
    public Report(String name) {
        this.setType("Report");
        this.setName(name);
    }

    @Override
    protected Docs clone() throws CloneNotSupportedException {
        return (Report) super.clone();
    }
}
