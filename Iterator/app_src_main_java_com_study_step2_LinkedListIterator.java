package com.study.step2;

public class LinkedListIterator <E> implements Iterator<E> {

  LinkedList<E> list;
  int index = 0;


  //생성자
  public LinkedListIterator(LinkedList<E> list) {
    this.list = list;
  }

  //조회할 게시글 수가 없으면 false출력
  @Override
  public boolean hasNext() {
    return index < list.size();
  }

  //목록에서 데이터를 하나씩 꺼냄.s
  @Override
  public E next() {
    return list.get(index++);
  }


}