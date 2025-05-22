package org.code.prototype;

public interface Iprototype<T extends Iprototype> extends Cloneable {

    // Clonacion simple
    T clone();

    // Clonacion profunda
    T deepClone();

}
