public class Coffee_Beans extends CondimentDecorator{

    public Coffee_Beans(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost()
    {
        int x= coffee.getCost();
        System.out.println("Extra Coffee Beans - 30 taka");
        return x+30;
    }
}
