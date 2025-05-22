package adapter;

import computer.Hdmi;
import computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String mesg) {
        System.out.println("=========== Adapter =========");
        byte[] data = mesg.getBytes();
        hdmi.view(data);
        System.out.println("=========== /Adapter =========");
    }
    public void setHdmi(Hdmi hdmi){
        this.hdmi = hdmi;
    }
}
