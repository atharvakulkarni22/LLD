package entity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
    private final Map<Item, Integer> stock = new ConcurrentHashMap<>();
    private final Map<String, Item> items = new ConcurrentHashMap<>();

    public void addItem(Item item, int quantity) {
        stock.put(item, quantity);
        items.put(item.getCode(), item);
    }

    public boolean isAvailable(String code) {
        Item item = items.get(code);
        return  (stock.containsKey(item) && (stock.get(item) > 0));
    }

    public void reduceItem (Item item) {
        stock.put(item, stock.get(item) - 1);
    }

    public Item getItem (String code) {
        if (items.containsKey(code)) {
            return items.get(code);
        }
        return null;
    }


}
