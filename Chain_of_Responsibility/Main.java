public class Main {
    public static void main(String[] args) {
        BangunDatarHandler lingkaranHandler = new LingkaranHandler();
        BangunDatarHandler segitigaHandler = new SegitigaHandler();

        lingkaranHandler.setNextHandler(segitigaHandler);

        HitungLuasRequest requestLingkaran = new HitungLuasRequest("lingkaran");
        double luasLingkaran = lingkaranHandler.hitungLuas(requestLingkaran);
        System.out.println("Luas Lingkaran: " + luasLingkaran);

        HitungLuasRequest requestSegitiga = new HitungLuasRequest("segitiga");
        double luasSegitiga = lingkaranHandler.hitungLuas(requestSegitiga);
        System.out.println("Luas Segitiga: " + luasSegitiga);
    }
}