public abstract class Kapak<virtual> {

    private  IkapakRenk kapakrenk;
    private IkapakBoyut kapakBoyut;


    public IkapakRenk getKapakrenk() {
        return kapakrenk;
    }
    public void setKapakrenk(IkapakRenk kapakrenk) {
        this.kapakrenk = kapakrenk;
    }
    public IkapakBoyut getKapakBoyut() {
        return kapakBoyut;
    }
    public void setKapakBoyut(IkapakBoyut kapakBoyut) {
        this.kapakBoyut = kapakBoyut;
    }

    public Kapak(IkapakRenk kapakrenk,IkapakBoyut kapakboyut) {

        this.kapakBoyut=kapakboyut;
        this.kapakrenk=kapakrenk;

    }

    public abstract void kapakTuru();


}