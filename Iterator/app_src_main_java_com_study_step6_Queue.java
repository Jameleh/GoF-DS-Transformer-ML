package com.study.step6;

public class Queue <E> extends LinkedList<E> {

  public void offer(E value) {
    this.add(value);
  }

  public E poll() {
    return this.remove(0);
  }

  public boolean empty() {
    return this.size == 0;
  }

  // -----------------------------------------------------------

  @Override
  public Iterator<E> iterator() {

    return new Iterator<>() {

      int index = 0;

      @Override
      public boolean hasNext() {
        return index < Queue.this.size();
        //return !list.empty();
      }
      @Override
      public E next() {
        return Queue.this.poll();
      }
    };

  }

}
