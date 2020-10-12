package pract_16;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    boolean remove(Item item);
    int removall(String itemName);
    int removall(Item item);
    int numOfOrders();
    Object[] getArray();
    int costTotal();
    String[] itemsNames();
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(Item item);
    Item[] getItems();
    Item[] sortedItemsByCostDesc();


}