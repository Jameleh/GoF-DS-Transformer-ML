package com.study.step4;

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
    return new QueueIterator<E>();
  }


  // static nested class (스태틱 중첩 클래스)
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

}
