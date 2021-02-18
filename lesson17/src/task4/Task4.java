package task4;

public class Task4 {
  public static void main(String[] args) {
    MyQueue<Integer> queue = new MyQueue<>();

    Consumer<Integer> consumer = new Consumer<>(queue);
    Consumer<Integer> consumer2 = new Consumer<>(queue);
    IntegerProducer producer = new IntegerProducer(queue);

    Thread consumerThread = new Thread(consumer);
    consumerThread.setName("Consumer 1");
    Thread consumerThread2 = new Thread(consumer2);
    consumerThread2.setName("Consumer 2");

    Thread producerThread = new Thread(producer);

    consumerThread.start();
    consumerThread2.start();
    producerThread.start();
  }
}
