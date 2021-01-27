package task5.classes;

import task4.classes.Clothing;
import task5.ShopOperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ClothingShopItem {
  private final Clothing item;
  private final int id;

  ClothingShopItem(Clothing item, int id) {
    this.item = item;
    this.id = id;
  }

  public Clothing getItem() {
    return item;
  }

  public int getId() {
    return id;
  }
}

public class ClothingShop {
  private final ShoppingCart<Clothing> shoppingCart;
  private final Clothing[] shopItems;
  private final Map<String, ArrayList<ClothingShopItem>> shopCategoryToItemsMap;

  public ClothingShop(Clothing[] shopItems) {
    shoppingCart = new ShoppingCart<>();

    this.shopItems = shopItems;

    shopCategoryToItemsMap = new HashMap<>();
    for (int i = 0; i < shopItems.length; i++) {
      String key = shopItems[i].getClass().getSimpleName();
      ArrayList<ClothingShopItem> clothingArray = shopCategoryToItemsMap.get(key);

      if (clothingArray == null) {
        clothingArray = new ArrayList<>();
      }

      clothingArray.add(new ClothingShopItem(shopItems[i], i));

      shopCategoryToItemsMap.put(key, clothingArray);
    }
  }

  public void action(ShopOperations operation) {
    switch (operation) {
      case LOGIN: {
        String username = UserDialog.askString("Enter username:");
        String password = UserDialog.askString("Enter password:");
        login(username, password);
        break;
      }
      case SHOW_CATALOGS: {
        printCategories();
        break;
      }
      case SHOW_CATALOG_ITEMS: {
        String category = UserDialog.askString("Enter category:");
        printItemsByCategory(category);
        break;
      }
      case ADD_TO_CART: {
        int index = UserDialog.askInteger("Enter item id to add to cart:");
        if (index >= 0 && index < shopItems.length) {
          addToCart(index);
        }
        break;
      }
      case PURCHASE: {
        purchaseItems();
        break;
      }
    }
  }

  public void printCategories() {
    System.out.print("Catalog categories: ");
    for (String category : shopCategoryToItemsMap.keySet()) {
      System.out.print(category + " ");
    }
    System.out.println();
  }

  public void printItemsByCategory(String category) {
    ArrayList<ClothingShopItem> list = shopCategoryToItemsMap.get(category);
    if (list != null && list.size() != 0) {
      for (ClothingShopItem item : list) {
        printShopItemInfo(item);
      }
    } else {
      System.out.println("No categories found");
    }
  }

  public void addToCart(int index) {
    Clothing item = shopItems[index];
    shoppingCart.addItem(item);
    System.out.print("Added to cart: ");
    printShopItemInfo(new ClothingShopItem(item, index));
  }

  public boolean purchaseItems() {
    if (shoppingCart.getShoppingCart().size() == 0) {
      return false;
    }

    System.out.println("You just purchased items:");
    for (int i = 0; i < shoppingCart.getShoppingCart().size(); i++) {
      Clothing item = shoppingCart.getShoppingCart().get(i);
      printShopItemInfo(new ClothingShopItem(item, i));
    }

    shoppingCart.clear();

    return true;
  }

  public boolean login(String username, String password) {
    System.out.println("Login: " + username + ":" + password);
    return true;
  }

  public void printActions() {
    System.out.print("Actions: ");
    for (int i = 0; i < ShopOperations.values().length; i++) {
      String action = String.format("%s%d %s", i != 0 ? " | " : "", i, ShopOperations.values()[i]);
      System.out.print(action);
    }
    System.out.println();
  }

  public void printShopItemInfo(ClothingShopItem item) {
    String message = String.format("(%d) %s - size: %s (%d, %s), price: %.1f, color: %s",
        item.getId(),
        item.getItem().getClass().getSimpleName(),
        item.getItem().getSize(),
        item.getItem().getSize().getEuroSize(),
        item.getItem().getSize().getDescription(),
        item.getItem().getPrice(),
        item.getItem().getColor());
    System.out.println(message);
  }
}
