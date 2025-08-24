import entity.Item;
import enums.Money;
import vendingpackage.VendingMachine;

public class VendingMachineDemo {

    public static void main (String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        vendingMachine.addItem(new Item(1, "11", "bar"), 2);
        vendingMachine.addItem(new Item(2, "12", "chips"), 2);

        vendingMachine.selectItem("11");
        vendingMachine.insertMoney(Money.DOLLAR);

        vendingMachine.selectItem("12");
        vendingMachine.insertMoney(Money.DOLLAR);
        vendingMachine.insertMoney(Money.QUARTER);
        vendingMachine.insertMoney(Money.DOLLAR);
    }
}
