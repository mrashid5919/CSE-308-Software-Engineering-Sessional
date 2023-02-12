public class BlackCoffee implements Coffee{
    BlackCoffee()
    {
        System.out.println("Coffee Mug - 100 taka");
        System.out.println("Water - 0 taka");
        System.out.println("Grinded Coffee Beans - 30 taka");
    }
    @Override
    public int getCost() {

        return 130;
    }
}
