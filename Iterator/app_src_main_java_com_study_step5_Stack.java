package com.study.step5;

public class Stack <E> {

  public static final int DEFAULT_SIZE = 5;

  Object[] list;
  int size;

  public Stack() {
    list = new Object[DEFAULT_SIZE];
  }

  public void push(E value) {
    if (size == list.length) {
      Object[] arr = new Object[list.length + (list.length >> 1)];
      for (int i = 0; i < list.length; i++) {
        arr[i] = list[i];
      }
      list = arr;
    }

    list[size++] = value;
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    if (size == 0)
      return null;

    return (E) list[--size];
  }

  public boolean empty() {
    return size == 0;
  }

  public int size() {
    return this.size;
  }

  //---------------------------------------------
  public Iterator<E> iterator(){

    class StackIterator <T> implements Iterator {

      int index=0;

      @Override
      public boolean hasNext() {
        //return index < list.size();
        return !Stack.this.empty();
      }

      // Stack은 get이라는 메서드가 없다.
      @Override
      public T next() {
        return (T) Stack.this.pop();
      }
    }

    return new StackIterator<E>();
  }

}

