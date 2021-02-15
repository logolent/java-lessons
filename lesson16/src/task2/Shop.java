package task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Shop<T> {
  private ShoppingCart<T> shoppingCart;

  public Shop(ShoppingCart<T> shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public Shop() {
    this.shoppingCart = new ShoppingCart<>();
  }

  private void buyCartItems() {
    System.out.println("Buy items");
    this.shoppingCart.clear();
  }

  public boolean addToCart(T item) {
    return this.shoppingCart.addItem(item);
  }

  public void serializeCart(String filePath) {
    // @formatter:off
    try(
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos)
    ) {
      // @formatter:on
      oos.writeObject(this.shoppingCart);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public ShoppingCart<T> deserializeCart(String filePath) {
    ShoppingCart<T> shoppingCart = null;

    // @formatter:off
    try(
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis)
    ) {
      // @formatter:off
      shoppingCart = (ShoppingCart<T>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

    return shoppingCart;
  }

  public ShoppingCart<T> getShoppingCart() {
    return shoppingCart;
  }
}
