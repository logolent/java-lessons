package task4;

public class MyQueue<T> {
  private T value;
  boolean valueSet = false;

  public synchronized T get() {
    while (!valueSet) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("get: " + value + " (" + Thread.currentThread().getName() + ")");

    valueSet = false;
    notifyAll();
    return value;
  }

  public synchronized void put(T value) {
    while (valueSet) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("put: " + value);

    valueSet = true;
    this.value = value;
    notifyAll();
  }
}
