package task6;

import task6.classes.Animal;

import java.io.Serializable;

public class GenericClass<T extends Comparable, V extends Animal & Serializable, K extends Number> {
  private T t;
  private V v;
  private K k;

  GenericClass(T t, V v, K k) {
    this.t = t;
    this.v = v;
    this.k = k;
  }

  public T getT() {
    return t;
  }

  public K getK() {
    return k;
  }

  public V getV() {
    return v;
  }

  public void printClassNames() {
    System.out.println("t: " + t.getClass().getSimpleName());
    System.out.println("v: " + v.getClass().getSimpleName());
    System.out.println("k: " + k.getClass().getSimpleName());
  }
}
