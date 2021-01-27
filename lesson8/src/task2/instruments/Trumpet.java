package task2.instruments;

import task2.interfaces.Instrument;

public class Trumpet implements Instrument {
  private double diameter;

  public Trumpet(double diameter) {
    this.diameter = diameter;
  }

  @Override
  public void play() {
    System.out.println("Plays: Trumpet with diameter - " + diameter);
  }
}
