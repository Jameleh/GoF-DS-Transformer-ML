package org.example;

public interface Aggregate<E> {
    Iterator<E> createIterator();
}
