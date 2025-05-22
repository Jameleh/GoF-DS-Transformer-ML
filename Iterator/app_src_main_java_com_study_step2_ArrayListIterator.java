package com.study.step2;

public class ArrayListIterator<E> implements Iterator<E> {
  static final int DEFAULT_SIZE = 5;

  ArrayList<E> list;
  int index = 0;

  //생성자
  public ArrayListIterator(ArrayList<E> list) {
    this.list = list;
  }

  //조회할 게시글 수가 없으면 false출력
  @Override
  public boolean hasNext() {
    return index < list.size();
  }

  //목록에서 데이터를 하나씩 꺼냄.
  @Override
  public E next() {
    return list.get(index++);
  }


}
