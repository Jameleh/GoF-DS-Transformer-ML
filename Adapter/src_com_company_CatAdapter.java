package com.company;

public class CatAdapter implements Dog {

  Cat cat;

  public CatAdapter(Cat cat) {
    this.cat = cat;
  }

  public void vov() {
    cat.miaw();
  }

  public void play() {

    for(int i=0; i < 5; i++){
     cat.Scratches();
    }
  }


}
