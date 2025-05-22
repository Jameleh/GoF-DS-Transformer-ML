package com.study.step2;

public class QueueIterator <E> extends LinkedList<E> implements Iterator{

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
