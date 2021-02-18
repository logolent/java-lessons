package task4;

public class Consumer<T> implements Runnable {
  private MyQueue<T> myQueue;

  public Consumer(MyQueue<T> myQueue) {
    this.myQueue = myQueue;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      myQueue.get();
    }
  }
}
