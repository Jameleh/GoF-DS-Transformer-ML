public class ATelefon implements ITelefon
{
    @Override
    public void aramaYap() {
        System.out.println("A tel arama yapıyor");
    }

    @Override
    public void accept(IMessage iMessage) {
        System.out.println("sms kabul edildi");
    }
}
