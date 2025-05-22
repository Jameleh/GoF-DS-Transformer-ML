package com.sn.mane;

/**
 * ConcreteBuilder class, constructs and assembles parts of the Product by
 * implementing the Builder interface
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    @Override
    public Builder createProduct() {
        this.product = new Product();
        return this;
    }

    @Override
    public Builder buildPart1(String part1) {
        product.setPart1(part1);
        return this;
    }

    @Override
    public Builder buildPart2(String part2) {
        product.setPart2(part2);
        return this;
    }

    public Product getResult() {
        return product;
    }
}
