public class DairyCream extends CondimentDecorator{
    public DairyCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost()
    {
        int x= coffee.getCost();
        System.out.println("Dairy Cream - 40 taka");
        return x+40;
    }
}
