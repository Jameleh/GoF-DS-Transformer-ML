package sehiyyenazirliyi;

import sehiyyenazirliyi.Xestexana;

import java.util.ArrayList;
import java.util.List;

public class Seher {
    private   String adi;
    private List<Xestexana> xestexanaList;

    public Seher(String adi) {
        this.adi = adi;
        xestexanaList=new ArrayList<>();
    }

    public  void  xestexanaElaveEt(Xestexana xestexana){
        xestexanaList.add(xestexana);
    }
    public  String accept(Visitor visitor){
        return visitor.visitSeher(this);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Xestexana> getXestexanaList() {
        return xestexanaList;
    }

    public void setXestexanaList(List<Xestexana> xestexanaList) {
        this.xestexanaList = xestexanaList;
    }
}
