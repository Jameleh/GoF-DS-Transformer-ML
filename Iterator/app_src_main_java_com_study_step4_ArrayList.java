package com.study.step4;

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

  //------------------------------------------------------------------------------
  public Iterator<E> iterator(){
    // 생성자를 호출할 때 바깥 클래스의 인스턴스 주소를 넘겨주지 않아도
    // 컴파일러가 넘겨주는 코드로 자동 변환한다.
    return new ArrayListIterator<E>();

    //위 코드는 컴파일러 될때 다음과 같이 바뀐다.
    //return new ArrayListIterator<E>(this);
  }


  //static nested class(스태틱 중첩 클래스)
  class ArrayListIterator<T> implements Iterator<T> {

    // 논스택 중첩 클래스인 경우 바깥 클래스의 인스턴스 주소를 받을 필드가 자동추가 된다.
    // 따라서 다음과 같이 개발자가 직접 추가 할 필요가 없다.
    // ArrayList<E> (this)가 자동 생성된다.

    int index = 0;

    // 논스태틱 중첩 클래스인 경우 바깥 클래스의 인스턴스 주소를 받는 파라미터가
    // 생성자가 자동으로 추가된다.
    // 개발자가 추가할 필요가 없다.
    // public ArrayListIterator(ArrayList<E> (this){
    //  this.list=list;

    @Override
    public boolean hasNext() {
      // 컴파일러가 자동으로 추가한,
      // 바깥 클래서의 인스턴스 주소를 담고 있는 변수를 사용하려면 다음과 같이 지정하라
      //    바깥클래스명.this.size();
      return index < ArrayList.this.size();
    }

    @SuppressWarnings("unchecked")
    @Override
    public T next() {
      // 컴파일러가 추가한 바깥 클래스의 인스턴스 주소를 사용하고 싶다면
      // ArrayList.this 라고 지정하면 된다.
      // ArrayList.get() 메서드의 리턴 타입이 E 이다.
      // E가 가르키는 타입 정보는 다음과 같이 결국 ArrayListIterator를 만들 때 넘겨진다.
      //    new ArrayListIterator();
      // 따라서 ArrayListIternator 내부에서 사용하는 T가 곧 ArrayList의 E와 같다.
      // 결론! 다음과 같이 형변환 할 수 있다.
      return (T) ArrayList.this.get(index++);
    }
  }
}
