package vendingpackage;

import entity.Inventory;
import entity.Item;
import enums.Money;
import state.IdleState;
import state.VendingMachineState;

public class VendingMachine {
    private static VendingMachine vendingMachine;
    private final Inventory inventory;
    private VendingMachineState vendingMachineState;
    private String selectedItem;
    private double balance;
    private VendingMachine() {
        vendingMachineState = new IdleState(this);
        inventory = new Inventory();
        balance = 0;
    }

    public static VendingMachine getInstance() {
        if (vendingMachine == null) {
            return vendingMachine = new VendingMachine();
        }
        return vendingMachine;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void addItem(Item item, int quantity) {
        inventory.addItem(item, quantity);
    }

    public void setState(VendingMachineState state) {
        vendingMachineState = state;
    }

    public void selectItem(String code) {
        vendingMachineState.selectItem(code);
    }

    public void insertMoney(Money money) {
        vendingMachineState.addMoney(money);
    }

    public void dispense() {
        vendingMachineState.dispenseItem();
    }

    public void setSelectedItem(String code) {
        selectedItem = code;
    }

    public Item getSelectedItem() {
        Item item = inventory.getItem(selectedItem);
        if (item != null) {
            return item;
        }
        return null;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void reset() {
        selectedItem = null;
        balance = 0;
        setState(new IdleState(vendingMachine));
    }


}
