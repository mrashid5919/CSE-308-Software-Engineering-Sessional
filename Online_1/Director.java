import java.util.Scanner;

public class Director {
    private Builder builder;

    public Director()
    {
        this.builder=new Builder();
    }

    public Burger getBurger() {
        return this.builder.getBurger();
    }

    public void Construct()
    {
        while(true)
        {
            System.out.println("What do you want to do? 1/2/3/4/5");
            System.out.println("1. Add Patty");
            System.out.println("2. Add Cheese");
            System.out.println("3. Add BBQ Sauce");
            System.out.println("4. Add Salad");
            System.out.println("5. None");
            Scanner sc=new Scanner(System.in);
            String x=sc.nextLine();
            if(x.equals("1"))
                this.builder.buildPatty();
            else if(x.equals("2"))
                this.builder.buildCheese();
            else if(x.equals("3"))
                this.builder.buildBBQSauce();
            else if(x.equals("4"))
                this.builder.buildSalad();
            else if(x.equals("5"))
                break;
            else
                System.out.println("Invalid input");
        }
    }
}
