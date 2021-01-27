package task5.classes;

import java.util.ArrayList;

public class ShoppingCart<T> {
  private final ArrayList<T> shoppingCart = new ArrayList<>();

  public void addItem(T item) {
    shoppingCart.add(item);
  }

  public T removeItem(int index) {
    return shoppingCart.remove(index);
  }

  public void clear() {
    shoppingCart.clear();
  }

  public ArrayList<T> getShoppingCart() {
    return shoppingCart;
  }
}
