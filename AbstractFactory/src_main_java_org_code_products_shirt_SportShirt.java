package org.code.products.shirt;

import org.code.products.Shirt;

public class SportShirt implements Shirt {

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deportiva -- ¿Tiene mangas largas? -> No");
        return false;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa deportiva -- ¿Tiene botones? -> No");
        return false;
    }
}
