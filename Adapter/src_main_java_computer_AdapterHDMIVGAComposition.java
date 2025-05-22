package computer;

public class AdapterHDMIVGAComposition  implements VGA {
    private HDMI hdmi;
    @Override
    public void print(String message) {
        System.out.println("------Adapter par Composition--------");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("------Adapter par Composition--------");


    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
