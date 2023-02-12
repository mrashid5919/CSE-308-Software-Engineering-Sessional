public abstract class CondimentDecorator implements Coffee{
    protected Coffee coffee;

    public CondimentDecorator(Coffee coffee)
    {
        this.coffee=coffee;
    }

    @Override
    public int getCost()
    {
        return coffee.getCost();
    }
}
