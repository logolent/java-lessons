package task6;

import task6.classes.Cat;

public class Task6 {
  public static void main(String[] args) {
    String string = "Cat";
    Cat cat = new Cat();
    Double number = 15.0;
    GenericClass<String, Cat, Double> genericClass = new GenericClass<>(string, cat, number);
    genericClass.printClassNames();
  }
}
