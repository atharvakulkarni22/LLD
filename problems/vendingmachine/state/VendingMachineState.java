package state;

import entity.Item;
import enums.Money;
import vendingpackage.VendingMachine;

public abstract class VendingMachineState {

    VendingMachine vendingMachine;

    VendingMachineState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract void selectItem(String code);
    public abstract void addMoney(Money money);
    public abstract void dispenseItem();
    public abstract  void refundAmount();
}
