public class CinnamonPowder extends CondimentDecorator{
    public CinnamonPowder(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost()
    {
        int x= coffee.getCost();
        System.out.println("Cinnamon Powder - 50 taka");
        return x+50;
    }
}
