package task3;

import task2.Product;
import task2.ShoppingCart;

import java.util.Arrays;

public class Task3 {
  public static void main(String[] args) {
    ShoppingCart<Product> shoppingCart = new ShoppingCart<>();
    printMetaInfo(shoppingCart);
  }

  private static <T> void printMetaInfo(T classObject) {
    System.out.println(classObject.getClass().toGenericString());
    System.out.println("Extends " + classObject.getClass().getSuperclass().getName());
    System.out.println("Implements " + Arrays.toString(classObject.getClass().getInterfaces()));
    System.out.println("Constructors " + Arrays.toString(classObject.getClass().getDeclaredConstructors()));
    System.out.println("Fields " + Arrays.toString(classObject.getClass().getDeclaredFields()));
    System.out.println("Methods " + Arrays.toString(classObject.getClass().getDeclaredMethods()));
  }
}
