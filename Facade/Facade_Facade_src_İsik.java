public class İsik {

    private boolean durum;

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }
    public İsik() {

    }
    public İsik(int isikDurum) {
        if(this.durum==false) {
            isikDurum=1;
        }
        else {
            isikDurum=0;
        }
    }

    public void ac() {
        int isikDurum = 1;
        System.out.println("Isık açıldı.");


    }
    public void kapat() {
        int isikDurum=0;
        System.out.println("Isık kapatıldı.");
    }

}