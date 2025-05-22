package computer;

public class AdapterHDMIVGACLASS extends TV implements VGA {
    private HDMI h;


    @Override
    public void print(String message) {
        System.out.println("------Adapter par heritage --------");
        byte[] data= message.getBytes();
        super.view(data);
        System.out.println("------Adapter par heritage--------");

    }

    public void setHDMI(HDMI h) {
        this.h = h;
    }
}
