package task5;

public class Fork {
  private boolean isTaken;

  public void take() {
    this.isTaken = true;
  }

  public void putBack() {
    this.isTaken = false;
  }

  public boolean isTaken() {
    return this.isTaken;
  }
}
