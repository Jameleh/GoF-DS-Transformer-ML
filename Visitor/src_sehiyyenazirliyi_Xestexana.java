package sehiyyenazirliyi;

import sehiyyenazirliyi.Xeste;

import java.util.ArrayList;
import java.util.List;

public class Xestexana {
  private   String adi;
   private List<Xeste> xesteList;

    public Xestexana(String adi) {
        this.adi = adi;
        xesteList=new ArrayList<>();
    }
    public  String accept(Visitor visitor){
        return visitor.visitXestexana(this);
    }
    public void xesteElaveEt(Xeste xeste){
        xesteList.add(xeste);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Xeste> getXesteList() {
        return xesteList;
    }

    public void setXesteList(List<Xeste> xesteList) {
        this.xesteList = xesteList;
    }
}
