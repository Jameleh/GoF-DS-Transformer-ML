package com.study.step3;

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

  public Iterator<E> iterator(){
    return new StackIterator<E>(this);
  }


  //static nested class(스태틱 중첩 클래스)
  static class StackIterator <E> implements Iterator {

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
}

