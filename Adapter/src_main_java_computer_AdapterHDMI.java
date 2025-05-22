package computer;

public class AdapterHDMI extends TV implements VGA {
    private HDMI h;


    @Override
    public void print(String message) {
        System.out.println("------Adapter--------");
        byte[] data= message.getBytes();
        super.view(data);
        System.out.println("------Adapter--------");

    }

    public void setHDMI(HDMI h) {
        this.h = h;
    }
}
