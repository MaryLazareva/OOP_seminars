package lesson_4;

public class Main {
    public static void main(String[] args) {
        
        VendingMachine<Chips> vendingMachineForChips = new VendingMachine<>();
        VendingMachine<Chocolate> vendingMachineForChocolate = new VendingMachine<>();
        VendingMachine<Cola> vendingMachineForCola = new VendingMachine<>();

        vendingMachineForChips.addProducts(new Chips(200, "с луком"));
        vendingMachineForChocolate.addProducts(new Chocolate(250, "с орехами"));
        vendingMachineForCola.addProducts(new Cola(200));

        System.out.println(vendingMachineForChips.getProducts().get(0).toString());
        System.out.println(vendingMachineForChocolate.getProducts().get(0).toString());
        System.out.println(vendingMachineForCola.getProducts().get(0).toString());

    }
    
}
