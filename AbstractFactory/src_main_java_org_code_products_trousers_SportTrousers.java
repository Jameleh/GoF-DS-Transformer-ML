package org.code.products.trousers;

import org.code.products.Trousers;

public class SportTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        System.out.println("Pantalones deportivos -- ¿Tienen botones? -> No");
        return false;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pantalones deportivos -- ¿Tipo de cierre? -> Sin cierre");
        return null;
    }
}
