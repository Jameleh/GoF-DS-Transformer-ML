public class Klima {

    private int sicaklik;

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }

    public void guncelle(int yeniSicaklik) {
        this.sicaklik=yeniSicaklik;
        System.out.println("Yeni sıcaklık:"+yeniSicaklik);

    }


    public void kapat() {
        System.out.println("Klima kapatıldı.");
    }

    public void ac() {
        System.out.println("Klima açıldı.");
    }



}