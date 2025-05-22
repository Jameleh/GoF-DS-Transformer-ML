public abstract class Component {
    public Component(String name) {
        this.name = name;
    }

    protected String name;
    protected int level;
    public abstract void show();

    public  String tab(){

        String tab="";
        for (int i=0;i<level;i++){
            tab+="\t";
        }
        return tab;
    }

}
