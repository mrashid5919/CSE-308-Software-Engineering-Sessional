import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int cost=0;
        System.out.println("Welcome to Coffeer Tong");
        while(true){
            System.out.println("Do you want to order? y/n");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            if(s.equalsIgnoreCase("y")){
                System.out.println("What do you want to order?");
                System.out.println("1. Americano");
                System.out.println("2. Espresso");
                System.out.println("3. Cappuccino");
                System.out.println("4. Mocha");
                String order=sc.nextLine();
                Coffee x;
                if(order.equalsIgnoreCase("Americano") || order.equalsIgnoreCase("1")){
                    x=new Coffee_Beans(new BlackCoffee());
                    int curr=x.getCost();
                    System.out.println("Cost: "+curr+" taka");
                    cost+= curr;
                }
                else if(order.equalsIgnoreCase("Espresso") || order.equalsIgnoreCase("2")){
                    x=new DairyCream(new BlackCoffee());
                    int curr=x.getCost();
                    System.out.println("Cost: "+curr+" taka");
                    cost+= curr;
                }
                else if(order.equalsIgnoreCase("Cappuccino") || order.equalsIgnoreCase("3")){
                    x=new CinnamonPowder(new MilkCoffee());
                    int curr=x.getCost();
                    System.out.println("Cost: "+curr+" taka");
                    cost+= curr;
                }
                else if(order.equalsIgnoreCase("Mocha") || order.equalsIgnoreCase("4")){
                    x=new ChocolateSauce(new MilkCoffee());
                    int curr=x.getCost();
                    System.out.println("Cost: "+curr+" taka");
                    cost+= curr;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            else if(s.equalsIgnoreCase("n")){
                System.out.println("Your total bill: "+cost+" taka");
                System.out.println("Thank you for your purchase. See you soon!");
                break;
            }
            else{
                System.out.println("Invalid input");
            }
        }
        //System.out.println();
    }
}
