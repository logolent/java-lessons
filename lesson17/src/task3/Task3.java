package task3;

class MyThread extends Thread {
  private StringBuilder sb;

  public MyThread(StringBuilder sb) {
    this.sb = sb;
  }

  @Override
  public void run() {
    synchronized (StringBuilder.class) {
      for (int i = 0; i < 100; i++) {
        System.out.println(Thread.currentThread().getName() + " " + sb.charAt(0));
      }

      sb.setCharAt(0, (char) (sb.charAt(0) + 1));
    }
  }
}

public class Task3 {
  public static void main(String[] args) {
    MyThread myThread = new MyThread(new StringBuilder("a"));

    Thread thread1 = new Thread(myThread);
    Thread thread2 = new Thread(myThread);
    Thread thread3 = new Thread(myThread);

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
