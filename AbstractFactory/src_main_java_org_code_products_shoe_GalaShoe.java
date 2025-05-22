package org.code.products.shoe;

import org.code.products.Shoe;

public class GalaShoe implements Shoe {

    @Override
    public boolean isElegantShoe() {
        System.out.println("Zapatos de gala -- ¿Son zapatos elegantes? -> Sí");
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos de gala -- ¿Son para correr? -> No");
        return false;
    }
}
