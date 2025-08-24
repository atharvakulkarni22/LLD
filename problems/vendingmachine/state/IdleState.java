package state;

import entity.Item;
import enums.Money;
import vendingpackage.VendingMachine;

public class IdleState extends VendingMachineState {

    public IdleState (VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    @Override
    public void selectItem(String code) {
        if (vendingMachine.getInventory().isAvailable(code)) {
            System.out.println("Selected item");
        } else {
            System.out.println("Selected not available");
            return;
        }
        vendingMachine.setSelectedItem(code);
        vendingMachine.setState(new AddMoneyState(vendingMachine));
    }

    @Override
    public void addMoney(Money money) {
        System.out.println("Select item first");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Select item first");
    }

    @Override
    public void refundAmount() {
        System.out.println("Select item first");
    }
}
