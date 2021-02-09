package task5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task5 {
  public static void main(String[] args) {
    Product[] products = {
        new Product("Toy 1", 50.0),
        new Product("Toy 2", 100.0),
        new Product("Toy 3", 150.0),
        new Product("Toy 4", 200.0),
        new Product("Toy 5", 250.0),
    };

    HashMap<String, Product> productHashMap = new HashMap<>();

    for (Product product : products) {
      productHashMap.put(product.getName(), product);
    }

    printEntrySet(productHashMap);
    printKeySet(productHashMap);
    printValues(productHashMap);
  }

  private static void printEntrySet(HashMap<String, Product> map) {
    System.out.println("Entry Set:");
    Set<Map.Entry<String, Product>> entrySet = map.entrySet();

    entrySet.forEach(System.out::println);
    System.out.println();
  }

  private static void printKeySet(HashMap<String, Product> map) {
    System.out.println("Key Set:");
    Set<String> keySet = map.keySet();

    for (String element : keySet) {
      System.out.println(element);
    }
    System.out.println();
  }

  private static void printValues(HashMap<String, Product> map) {
    System.out.println("Values:");
    Collection<Product> values = map.values();

    Iterator<Product> iterator = values.iterator();
    while (iterator.hasNext()) {
      var element = iterator.next();
      System.out.println(element);
    }
    System.out.println();
  }
}
