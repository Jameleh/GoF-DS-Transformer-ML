// Decorator yani ev deorator yapısını extend eden ve temel ev sınıfına türetme yapmış olan concrete decorator yapısı
public class OdaDecorator extends EvDecorator{
    public OdaDecorator(Ev ev) {
        super(ev);
    }

    @Override
    public String aciklama() {
        return super.aciklama() + ", Ekstra Oda ";
    }

    @Override
    public double fiyat() {
        return super.fiyat() + 7500;
    }
}

