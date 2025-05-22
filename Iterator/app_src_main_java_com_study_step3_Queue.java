package com.study.step3;

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

  @Override
  public Iterator<E> iterator() {
    return new QueueIterator<E>(this);
  }


  // static nested class (스태틱 중첩 클래스)
  static class QueueIterator <E> extends LinkedList<E> implements Iterator{

    Queue<E> list;
    int index = 0;

    //생성자
    public QueueIterator(Queue<E> list){
      this.list = list;
    }

    @Override
    public boolean hasNext() {
      return index < list.size();
      //return !list.empty();
    }
    @Override
    public E next() {
      return list.get(index++);
      //return list.poll();
    }

  }

}
