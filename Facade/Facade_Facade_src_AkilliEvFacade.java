public class AkilliEvFacade {

    private Klima _klima;
    private Kapi _kapi;
    private İsik _isik;
    private Televizyon _tv;


    public AkilliEvFacade() {
        _klima=new Klima();
        _kapi=new Kapi();
        _isik=new İsik();
        _tv=new Televizyon();


    }

    public void Klimayiac() {
        _klima.ac();

    }
    public void KlimayiKapat() {
        _klima.kapat();
    }
    public void KapiyiKilitle() {
        _kapi.kilitle();
    }
    public void KapininKilidiniAc() {
        _kapi.kilitAc();
    }
    public void ÝsikAc() {
        _isik.ac();
    }
    public void ÝsikKapat() {
        _isik.kapat();
    }
    public void tvAc() {
        _tv.ac();
    }
    public void tvKapat() {
        _tv.kapat();
    }
    public void tvSesAzalt() {
        _tv.sesAzalt();

    }
    public void tvSesArttýr() {
        _tv.sesArttır();
    }
    public void tvKanalAzalt() {
        _tv.kanalAzalt();
    }
    public void tvKanalArttýr() {
        _tv.kanalArttır();
    }

    public void uykuModu() {
        KlimayiKapat();
        ÝsikKapat();
        KapiyiKilitle();
        tvKapat();

    }

    public void sinemaModu() {
        ÝsikKapat();
        tvAc();
        tvSesArttýr();

    }

}