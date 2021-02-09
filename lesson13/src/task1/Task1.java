package task1;

import java.util.ArrayList;
import java.util.Arrays;
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

public class Task1 {
  public static void main(String[] args) {
    List<HeavyBox> heavyBoxArrayList = new ArrayList<>(List.of(new HeavyBox[] {
        new HeavyBox(15), new HeavyBox(30), new HeavyBox(40),
    }));
    print(heavyBoxArrayList);

    System.out.println();

    heavyBoxArrayList.get(0).setWeight(1.0);
    heavyBoxArrayList.remove(heavyBoxArrayList.size() - 1);
    print(heavyBoxArrayList);

    System.out.println();

    System.out.println("1: " + Arrays.toString(heavyBoxArrayList.toArray()));

    HeavyBox[] array = new HeavyBox[heavyBoxArrayList.size()];
    heavyBoxArrayList.toArray(array);
    System.out.println("2: " + Arrays.toString(array));

    HeavyBox[] array2 = heavyBoxArrayList.toArray(new HeavyBox[0]);
    array2[0].setWeight(23);
    System.out.println("3: " + Arrays.toString(array2));

    heavyBoxArrayList.clear();
  }

  private static void print(List<HeavyBox> list) {
    for (HeavyBox box : list) {
      System.out.println(box);
    }
  }
}
