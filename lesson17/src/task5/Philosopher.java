package task5;

public class Philosopher implements Runnable {
  private final Fork leftFork;
  private final Fork rightFork;

  public Philosopher(Fork leftFork, Fork rightFork) {
    this.leftFork = leftFork;
    this.rightFork = rightFork;
  }

  @Override
  public void run() {
    while (true) {
      if (leftFork.isTaken() || rightFork.isTaken()) {
        think();
      }

      synchronized (leftFork) {
        leftFork.take();

        synchronized (rightFork) {
          rightFork.take();
          eat();
          try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          leftFork.putBack();
          rightFork.putBack();
        }
      }

      System.out.println();
    }
  }

  private void eat() {
    System.out.println(Thread.currentThread().getName() + " eating");
  }

  private void think() {
    System.out.println(Thread.currentThread().getName() + " thinking");
  }
}
