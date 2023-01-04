public class BuySuccessState extends State{
    BuySuccessState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void promptUser() {
        System.out.println("One product purchased successfully");
        machine.setProductCount(machine.getProductCount()-1);
        machine.changeState(new InitState(machine));
    }
}
