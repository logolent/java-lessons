package task6;

import java.util.function.Consumer;

class HeavyBox {
  private final double weight;

  HeavyBox(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }
}

public class Task6 {
  public static void main(String[] args) {
    Consumer<HeavyBox> loadBox = box -> System.out.println("Отгрузили ящик с весом " + box.getWeight());
    Consumer<HeavyBox> shipBox = box -> System.out.println("Отправляем ящик с весом " + box.getWeight());

    HeavyBox box = new HeavyBox(10);
    loadBox.andThen(shipBox).accept(box);
  }
}
