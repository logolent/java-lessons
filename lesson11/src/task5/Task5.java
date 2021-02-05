package task5;

public class Task5 {
  public static void main(String[] args) {
    Food food = new Food();
    food.prepare(new Cookable() {
      @Override
      public void cook(String str) {
        System.out.println(str);
      }
    }, "cook food");
  }
}
