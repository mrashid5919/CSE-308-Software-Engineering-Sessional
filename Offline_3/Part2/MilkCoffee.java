public class MilkCoffee implements Coffee{
    MilkCoffee(){
        System.out.println("Coffee Mug - 100 taka");
        System.out.println("Grinded Coffee Beans - 30 taka");
        System.out.println("Milk - 50 taka");
    }
    @Override
    public int getCost() {
        return 180;
    }
}
