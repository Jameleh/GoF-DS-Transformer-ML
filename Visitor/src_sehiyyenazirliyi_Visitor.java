package sehiyyenazirliyi;

import sehiyyenazirliyi.Seher;
import sehiyyenazirliyi.Xestexana;

public interface Visitor  {

    String visitXestexana(Xestexana xestexana);
    String visitSeher(Seher seher);
    String visitOlke(Olke olke);

}
