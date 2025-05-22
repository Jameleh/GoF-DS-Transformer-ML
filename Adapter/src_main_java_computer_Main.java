package computer;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale=new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("HELLO ");
        System.out.println();
        System.out.println();


        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("VIDEO");
        System.out.println();
        System.out.println();


        AdapterHDMI adapterHDMIVGACLASS=new AdapterHDMI();
        adapterHDMIVGACLASS.setHDMI(new SUPERVP());
        uniteCentrale.setVga(adapterHDMIVGACLASS);
        uniteCentrale.print("VIDEO");


        System.out.println();
        System.out.println();


        uniteCentrale.setVga(new SUPERVP());
        uniteCentrale.print("video");



        System.out.println();
        System.out.println();

        AdapterHDMIVGAComposition adapterHDMI=new AdapterHDMIVGAComposition();
        adapterHDMI.setHdmi(new TV());
        uniteCentrale.setVga(adapterHDMI);
        adapterHDMI.print("hy");

        System.out.println();
        System.out.println();

        AdapterHDMIVGACLASS adapterHDMIclass=new AdapterHDMIVGACLASS();
        adapterHDMIclass.setHDMI(new TV());
        uniteCentrale.setVga(adapterHDMIclass);
        adapterHDMIclass.print("hy");
    }
}
