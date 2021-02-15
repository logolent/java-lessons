package task2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T> implements Serializable {
  private List<T> items;

  public ShoppingCart(List<T> items) {
    this.items = items;
  }

  public ShoppingCart() {
    items = new ArrayList<T>();
  }

  public List<T> getItems() {
    return items;
  }

  public boolean addItem(T item) {
    return this.items.add(item);
  }

  public void clear() {
    this.items.clear();
  }

  @Override
  public String toString() {
    return "ShoppingCart{" + "items=" + items + '}';
  }
}
