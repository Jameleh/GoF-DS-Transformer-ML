package islemler;

import sehiyyenazirliyi.*;

import java.util.List;

public class CovidXesteSayisi implements Visitor {
    @Override
    public String visitXestexana(Xestexana xestexana) {

        int i = xesteSayiniHesabla(xestexana);
        return String.valueOf(i);    }

    @Override
    public String visitSeher(Seher seher) {
        int i = xesteSayiniHesabla(seher);
        return String.valueOf(i);    }

    @Override
    public String visitOlke(Olke olke) {
        int i = xesteSayiniHesabla(olke);
        return String.valueOf(i);
    }


    int xesteSayiniHesabla(Xestexana xestexana) {
      return XesteSayiniHesablaUtill.hastaSayiniHesabla(xestexana,EnumXestelik.COVID);
    }

    int xesteSayiniHesabla(Seher seher) {

        List<Xestexana> xestexanaList = seher.getXestexanaList();
        int xestesayisi = 0;

        for (Xestexana xestexana : xestexanaList) {
            int xesteSayi = xesteSayiniHesabla(xestexana);
            xestesayisi = xestesayisi + xesteSayi;

        }
        return xestesayisi;
    }

    int xesteSayiniHesabla(Olke olke) {
        List<Seher> seherList = olke.getSeherList();

        int xesteSayisi = 0;
        for (Seher seher : seherList) {
            int herXesteSayi = xesteSayiniHesabla(seher);
            xesteSayisi = xesteSayisi + herXesteSayi;
        }
        return xesteSayisi;

    }
}
