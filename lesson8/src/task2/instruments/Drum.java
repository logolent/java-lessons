package task2.instruments;

import task2.interfaces.Instrument;

public class Drum implements Instrument {
  private double[] size;

  public Drum(double[] size) {
    this.size = size;
  }

  @Override
  public void play() {
    System.out.println("Plays: Drum with size - " + size[0] + " x " + size[1]);
  }
}
