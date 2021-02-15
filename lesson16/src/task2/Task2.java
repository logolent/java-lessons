package task2;

public class Task2 {
  public static void main(String[] args) {
    Shop<Product> shop = new Shop<>();

    shop.addToCart(new Product("product 1"));
    shop.addToCart(new Product("product 2"));
    shop.addToCart(new Product("product 3"));

    System.out.println("before: " + shop.getShoppingCart());

    shop.serializeCart("./shopping-cart");
    ShoppingCart<Product> shoppingCart = shop.deserializeCart("./shopping-cart");
    System.out.println("after: " + shoppingCart);
  }
}
