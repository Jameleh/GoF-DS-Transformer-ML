package com.study.step2;

public class StackIterator <E> implements Iterator {

  Stack<E> list;
  int index=0;

  public StackIterator(Stack<E> list) {
    this.list = list;
  }

  @Override
  public boolean hasNext() {
    //return index < list.size();
    return !list.empty();
  }

  // Stack은 get이라는 메서드가 없다.
  @Override
  public E next() {
    return list.pop();
  }
}