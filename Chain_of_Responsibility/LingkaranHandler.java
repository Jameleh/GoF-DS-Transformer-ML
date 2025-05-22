class LingkaranHandler extends BangunDatarHandler {
    @Override
    public double hitungLuas(HitungLuasRequest request) {
        if (request.getJenisBangun().equalsIgnoreCase("lingkaran")) {
            double radius = 5.0; 
            return Math.PI * radius * radius;
        } else if (nextHandler != null) {
            return nextHandler.hitungLuas(request);
        }
        return -1.0;
    }
}