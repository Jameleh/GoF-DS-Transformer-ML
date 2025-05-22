public class App {

    public static void main(String[] args) {

        Folder root = new Folder("Design Pattern");

        Folder d1 = (Folder) root.add(new Folder("Comportement"));
        Folder d2= (Folder)  root.add(new Folder("Structure"));
        Folder d3 = (Folder)  root.add(new Folder("Creation"));
        d1.add(new File("Strategy"));
        d1.add(new File("Observer"));
        d2.add(new File("Decorateur"));
        d2.add(new File("Composite"));
        d2.add(new File("Adapter"));
        d3.add(new File("Singleton"));
        d3.add(new File("Builder"));

        Folder d21 = (Folder) d2.add(new Folder("Str21"));

        d21.add(new File("C211"));
        d21.add(new File("C212"));
        d21.add(new File("C213 "));

        root.show();


    }
}
