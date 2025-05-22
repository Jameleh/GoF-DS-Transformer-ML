// componenti yani ev arayüzünü implemente eden özelliklerin dinamik eklenmesini sağlayan decorator yapısı
public abstract class EvDecorator implements Ev{
    protected Ev decoratedEv;
    public EvDecorator(Ev ev){
        this.decoratedEv = ev;
    }
    @Override
    public String aciklama() {
        return decoratedEv.aciklama();
    }

    @Override
    public double fiyat() {
        return decoratedEv.fiyat();
    }

}
