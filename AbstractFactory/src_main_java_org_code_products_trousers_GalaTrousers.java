package org.code.products.trousers;

import org.code.products.Trousers;

public class GalaTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        System.out.println("pantalones de gala -- ¿Tienen botones? -> Sí");
        return false;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones de gala -- ¿Tipo de cierre? -> Cierre - Cremayera");
        return "Cierre - Cremayera";
    }
}
