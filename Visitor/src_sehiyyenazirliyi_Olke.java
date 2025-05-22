package sehiyyenazirliyi;

import sehiyyenazirliyi.Seher;

import java.util.ArrayList;
import java.util.List;

public class Olke {
    private String ad;
    private List<Seher> seherList;

    public Olke(String ad) {
        this.ad = ad;
        seherList=new ArrayList<>();
    }

    public void OlkeElaveEt(Seher seher){
        seherList.add(seher);
    }

    public  String accept(Visitor visitor){
       return visitor.visitOlke(this);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Seher> getSeherList() {
        return seherList;
    }

    public void setSeherList(List<Seher> seherList) {
        this.seherList = seherList;
    }
}
