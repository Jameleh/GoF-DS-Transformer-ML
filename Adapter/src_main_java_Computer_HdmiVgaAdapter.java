package Computer;

public class HdmiVgaAdapter implements  VGA {
    private HDMI hdmi;
    @Override
    public void print(String message) {
        System.out.println("========adapter========");
        byte[] data=message.getBytes();
hdmi.view(data);
        System.out.println("========adapter========");

    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
