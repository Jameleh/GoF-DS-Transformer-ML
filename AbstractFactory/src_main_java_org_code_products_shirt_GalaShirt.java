package org.code.products.shirt;

import org.code.products.Shirt;

public class GalaShirt implements Shirt {

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa de gala -- ¿Tiene mangas largas? -> Sí");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa de gala -- ¿Tiene botones? -> Sí");
        return true;
    }
}
