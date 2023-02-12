public class ChocolateSauce extends CondimentDecorator{
    public ChocolateSauce(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost()
    {
        int x= coffee.getCost();
        System.out.println("Chocolate Sauce - 60 taka");
        return x+60;
    }
}
