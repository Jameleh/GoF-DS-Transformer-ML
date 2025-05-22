package com.sn.mane;


/**
 * Builder, declares interface for creating parts of a Product object
 *
 */
public abstract class Builder {

    public abstract Builder createProduct();

    public abstract Builder buildPart1(String part1);

    public abstract Builder buildPart2(String part2);
}
