import java.util.Scanner;

public class OrderingState extends State{
    OrderingState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void promptUser() {
        double require= machine.getPrice();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Required money: "+require);
            System.out.println("Enter amount: ");
            String x=sc.nextLine();
            double y;
            try{
                y=Double.parseDouble(x);
            }catch (Exception e){
                System.out.println("Invalid input. Enter valid amount");
                continue;
            }
            if(y==require){
                machine.changeState(new BuySuccessState(machine));
                break;
            }
            else if(y<require){
                require=require-y;
            }
            else
            {
                System.out.println("Change returned: "+(y-require));
                machine.changeState(new BuySuccessState(machine));
                break;
            }
        }
    }
}
