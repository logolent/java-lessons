package task2.instruments;

import task2.interfaces.Instrument;

public class Guitar implements Instrument {
  private int numberOfStrings;

  public Guitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void play() {
    System.out.println("Plays: Guitar with number of strings - " + numberOfStrings);
  }
}
