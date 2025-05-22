import java.util.Hashtable;
public class DocsShape {
    private static Hashtable<String, Docs> docsRegister  = new Hashtable<String, Docs>();
    public DocsShape(){
        Docs letterAd = new Letter("Administrative");
        Docs resumeMod = new Resume("Moder Writer");
        Docs reportMeet = new Report("Meeting");


        docsRegister.put("Administrative letter blue template", letterAd);
        docsRegister.put("Meeting report ", reportMeet);
        docsRegister.put("Resume With Modern Template", resumeMod);
    }


    public Docs put(String description, Docs shape) {
        docsRegister.put(description, shape);
        return shape;
    }
    public Docs get(String description ) throws CloneNotSupportedException {
        return docsRegister.get(description).clone();
    }
    @Override
    public String toString() {
        String test="";
        docsRegister.forEach((key,value) -> System.out.println(key + " = " + value));
        return test;
    }

}
