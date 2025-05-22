package com.study.step3;

public class ArrayList <E> {
  static final int DEFAULT_SIZE = 5;

  Object[] arr;
  int size;

  public ArrayList() {
    this(0);
  }

  public ArrayList(int capacity) {
    if (capacity > DEFAULT_SIZE)
      arr = new Object[capacity];
    else 
      arr = new Object[DEFAULT_SIZE];
  }

  public Object[] toArray() {
    Object[] list = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      list[i] = this.arr[i];
    }
    return list;
  }

  public void add(E value) {
    if (this.size == arr.length) 
      increase();

    arr[this.size++] = value;
  }

  public int insert(int index, E value) {
    if (index < 0 || index >= size)
      return -1;

    if (this.size == arr.length) 
      increase();

    for (int i = size - 1; i >= index; i--)
      this.arr[i + 1] = this.arr[i];

    this.arr[index] = value;
    size++;

    return 0;
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= size)
      return null;

    return (E) this.arr[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, E value) {
    if (index < 0 || index >= size)
      return null;

    E old = (E) this.arr[index];
    this.arr[index] = value;
    return old;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    if (index < 0 || index >= size)
      return null;

    E old = (E) this.arr[index];

    for (int i = index; i < size - 1; i++) 
      this.arr[i] = this.arr[i+1];

    size--;

    return old;
  }

  public int size() {
    return this.size;
  }

  private void increase() {
    int originSize = arr.length;
    int newSize = originSize + (originSize >> 1);
    Object[] temp = new Object[newSize];
    for (int i = 0; i < this.arr.length; i++) {
      temp[i] = this.arr[i];
    }
    arr = temp;
  }

  public Iterator<E> iterator(){
    return new ArrayListIterator<E>(this);
  }

  //static nested class(스태틱 중첩 클래스)
  static class ArrayListIterator<E> implements Iterator<E> {
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
}
