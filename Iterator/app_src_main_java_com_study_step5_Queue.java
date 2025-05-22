package com.study.step5;

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

    class QueueIterator <T> extends LinkedList<T> implements Iterator{

      int index = 0;

      @Override
      public boolean hasNext() {
        return index < Queue.this.size();
        //return !list.empty();
      }
      @Override
      public T next() {
        return (T) Queue.this.poll();
        //return list.poll();
      }

    }

    return new QueueIterator<E>();
  }

}
