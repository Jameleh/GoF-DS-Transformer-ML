public class BTelefon implements ITelefon{
    @Override
    public void aramaYap() {
        System.out.println("B tel arama yapıyor");
    }

    @Override
    public void accept(IMessage iMessage) {
        System.out.println("mms kabul edildi");
    }
}
