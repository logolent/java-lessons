package task2;

class MyRunnable implements Runnable {
  public void run() {
    for (int i = 0; i < 100; i++) {
      if (i % 10 == 0) {
        System.out.println(Thread.currentThread().getName() + " " + i);

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}

public class Task2 {
  public static void main(String[] args) {
    MyRunnable myRunnable = new MyRunnable();

    Thread thread1 = new Thread(myRunnable);
    Thread thread2 = new Thread(myRunnable);
    Thread thread3 = new Thread(myRunnable);

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
