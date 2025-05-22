package org.code.products.shoe;

import org.code.products.Shoe;

public class SportShoe implements Shoe {

    @Override
    public boolean isElegantShoe() {
        System.out.println("Zapatos deportivos -- ¿Son zapatos elegantes? -> No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos deportivos -- ¿Son zapatos para correr? -> Sí");
        return true;
    }
}
