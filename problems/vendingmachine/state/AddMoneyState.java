package state;

import entity.Item;
import enums.Money;
import vendingpackage.VendingMachine;

public class AddMoneyState extends VendingMachineState {

    AddMoneyState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }
    @Override
    public void selectItem(String code) {
        System.out.println("Item already selected. Enter money!!");
    }

    @Override
    public void addMoney(Money money) {
        vendingMachine.addBalance(money.getValue());
        Item item = vendingMachine.getSelectedItem();
        if (vendingMachine.getBalance() >= item.getPrice()) {
            System.out.println("Money received");
            vendingMachine.setState(new DispenseItemState(vendingMachine));
            vendingMachine.dispense();
        }
    }

    @Override
    public void dispenseItem() {

    }

    @Override
    public void refundAmount() {

    }
}
