import java.util.Scanner;

public class InitState extends State{

    InitState(VendingMachine machine) {
        super(machine);
        //this.machine=machine;
    }


    @Override
    public void promptUser() {
        if(machine.getProductCount()==0)
        {
            System.out.println("Stock Out. Order cannot be placed");
            System.exit(0);
        }
        System.out.println("Do you want to buy a product? Enter y/n: ");
        Scanner sc=new Scanner(System.in);
        while(true) {
            String x=sc.nextLine();
            if(x.equalsIgnoreCase("y")){
                machine.changeState(new OrderingState(machine));
                break;
            }
            else if(x.equalsIgnoreCase("n")){
                System.out.println("Goodbye. See you soon.");
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid input. Please enter y/n");
            }
        }

    }
}
