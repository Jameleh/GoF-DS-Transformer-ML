public class Televizyon {
    private int sesSeviyesi;
    private int kanalNumarasi;

    public Televizyon() {
        this.sesSeviyesi=0;
        this.kanalNumarasi=1;
    }

    public void ac() {
        System.out.println("Televizyon açıldı.");

    }

    public void kapat() {
        System.out.println("Televizyon kapatıldı.");
    }

    public void sesArttır() {
        sesSeviyesi++;
        System.out.println("Ses seviyesi arttırıldı.");
    }

    public void sesAzalt() {
        sesSeviyesi--;
        System.out.println("Ses seviyesi azaltıldı.");

    }
    public void kanalAzalt() {
        kanalNumarasi--;
        System.out.println("Kanal azaltıldı.");

    }
    public void kanalArttır() {
        System.out.println("Kanal arttırıldı.");
    }


}