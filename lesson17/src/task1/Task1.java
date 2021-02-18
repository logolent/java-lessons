package task1;

class NewThread extends Thread {
  public void run(char c) {
    for (int i = 0; i < 100; i++) {
      System.out.println(c);
    }
  }
}

public class Task1 {
  public static void main(String[] args) {
    NewThread newThread = new NewThread();
    newThread.run('a');
  }
}
