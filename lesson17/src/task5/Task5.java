package task5;

public class Task5 {
  private static final int COUNT = 5;

  public static void main(String[] args) {
    Fork[] forks = new Fork[COUNT];
    for (int i = 0; i < COUNT; i++) {
      forks[i] = new Fork();
    }

    Philosopher[] philosophers = new Philosopher[COUNT];
    Thread[] threads = new Thread[COUNT];
    for (int i = 0; i < COUNT; i++) {
      int leftForkIndex = i;
      int rightForkIndex = i == 4 ? 0 : i + 1;

      philosophers[i] = new Philosopher(forks[leftForkIndex], forks[rightForkIndex]);
      threads[i] = new Thread(philosophers[i], "Philosopher " + (i + 1));
      threads[i].start();
    }
  }
}
