package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class HeavyBox {
  private double weight;

  HeavyBox(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "HeavyBox{" + "weight=" + weight + '}';
  }
}

public class Task4 {
  public static void main(String[] args) {
    ArrayList<HeavyBox> heavyBoxArrayList = new ArrayList<>(List.of(new HeavyBox[] {
        new HeavyBox(200), new HeavyBox(300), new HeavyBox(400), new HeavyBox(500),
    }));

    ArrayList<HeavyBox> heaviestBoxes = new ArrayList<>();
    findHeaviestBoxes(heavyBoxArrayList, heaviestBoxes);

    System.out.println(Arrays.toString(heaviestBoxes.toArray()));
  }

  private static void findHeaviestBoxes(ArrayList<HeavyBox> arrayList, ArrayList<HeavyBox> newArray) {
    Iterator<HeavyBox> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      HeavyBox box = iterator.next();
      if (box.getWeight() > 300.0) {
        newArray.add(box);
      }
    }
  }
}
