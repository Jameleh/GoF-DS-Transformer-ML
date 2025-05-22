abstract class BangunDatarHandler {
    protected BangunDatarHandler nextHandler;

    public void setNextHandler(BangunDatarHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract double hitungLuas(HitungLuasRequest request);
}