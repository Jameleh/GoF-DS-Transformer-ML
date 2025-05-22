import Computer.*;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale= new UniteCentrale();
       uniteCentrale.setVga(new Ecran ());
        uniteCentrale.print("hello");
        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("salut");
        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapter );
        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.print("Coucou");
        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapter1);
        uniteCentrale.print("hi");

    }
}
