package state;

import enums.Money;
import vendingpackage.VendingMachine;

public class DispenseItemState extends VendingMachineState {
    DispenseItemState(VendingMachine vendingMachine) {
        super(vendingMachine);

    }

    @Override
    public void selectItem(String code) {

    }

    @Override
    public void addMoney(Money money) {

    }

    @Override
    public void dispenseItem() {
        vendingMachine.getInventory().reduceItem(vendingMachine.getSelectedItem());
        System.out.println("Dispensed item " + vendingMachine.getSelectedItem().getName());
        vendingMachine.addBalance(-vendingMachine.getSelectedItem().getPrice());
        if (vendingMachine.getBalance() > 0) {
            System.out.println("Refunding amount " + vendingMachine.getBalance());
        }
        vendingMachine.reset();
    }

    @Override
    public void refundAmount() {

    }
}
