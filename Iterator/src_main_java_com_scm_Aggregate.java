package com.scm;

public interface Aggregate<E> {
    Iterator<E> createIterator();
}
