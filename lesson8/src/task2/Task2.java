package task2;

import task2.instruments.Drum;
import task2.instruments.Guitar;
import task2.instruments.Trumpet;
import task2.interfaces.Instrument;

public class Task2 {
  public static void main(String[] args) {
    Instrument[] instruments = {
        new Guitar(12), new Drum(new double[] { 12.0, 9.0 }), new Trumpet(20.0)
    };

    for (Instrument instrument : instruments) {
      instrument.play();
    }
  }
}
