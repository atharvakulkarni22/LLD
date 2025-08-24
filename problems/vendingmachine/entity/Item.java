package entity;

public class Item {
    private final int price;
    private final String code;
    private final String name;

    public Item(int price, String code, String name) {
        this.price = price;
        this.code = code;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
