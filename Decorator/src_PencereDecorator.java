// Decorator yani ev deorator yapısını extend eden ve temel ev sınıfına türetme yapmış olan concrete decorator yapısı
public class PencereDecorator extends EvDecorator{
    public PencereDecorator(Ev ev) {
        super(ev);
    }
    @Override
    public String aciklama() {
        return super.aciklama() + ", Pencere";
    }

    @Override
    public double fiyat() {
        return super.fiyat() + 1500;
    }

}
