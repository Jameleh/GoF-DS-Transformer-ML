class SegitigaHandler extends BangunDatarHandler {
    @Override
    public double hitungLuas(HitungLuasRequest request) {
        if (request.getJenisBangun().equalsIgnoreCase("segitiga")) {
            double alas = 4.0;
            double tinggi = 3.0;
            return 0.5 * alas * tinggi;
        } else if (nextHandler != null) {
            return nextHandler.hitungLuas(request);
        }
        return -1.0;
    }
}