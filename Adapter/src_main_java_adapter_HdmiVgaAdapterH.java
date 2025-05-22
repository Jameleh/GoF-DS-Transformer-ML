package adapter;

import computer.Hdmi;
import computer.TV;
import computer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga{
    @Override
    public void print(String mesg) {
        System.out.println("=========== Adapter =========");
        byte[] data = mesg.getBytes();
        super.view(data);
        System.out.println("=========== /Adapter =========");
    }

}
