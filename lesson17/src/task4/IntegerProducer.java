package task4;

public class IntegerProducer implements Runnable {
  private MyQueue<Integer> myQueue;

  public IntegerProducer(MyQueue<Integer> myQueue) {
    this.myQueue = myQueue;
  }

  @Override
  public void run() {
    for (int i = 0; ; i++) {
      myQueue.put(i);
    }
  }
}
