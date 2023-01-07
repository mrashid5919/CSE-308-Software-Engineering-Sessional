import java.util.Scanner;

public class Main {
    public static String getState(int state){
        if(state==0){
            return "Operational";
        }
        else if(state==1){
            return "Partially Down";
        }
        else{
            return "Fully Down";
        }
    }

    public static void main(String[] args) {
        ABCServer abcServer=new ABCServer();

        PremiumUser user1=new PremiumUser(abcServer,"User1");
        RegularUser user2=new RegularUser(abcServer,"User2");

        Scanner sc=new Scanner(System.in);
        while(true){
            int flag=0;
            System.out.println("Current state: "+getState(abcServer.getCurr()));
            while(true) {
                System.out.println("Do you want to change the server state? y/n");
                String x=sc.nextLine();
                if(x.equalsIgnoreCase("y")){
                    while(true){
                        System.out.println("Which state do you want? 1/2/3");
                        System.out.println("1. Operational");
                        System.out.println("2. Partially down");
                        System.out.println("3. Fully down");

                        String y=sc.nextLine();
                        if(y.equals("1") || y.equals("2") || y.equals("3")){
                            if(Integer.parseInt(y)== abcServer.getCurr()+1){
                                System.out.println("Same state chosen");
                            }
                            else{
                                System.out.println(getState(abcServer.getCurr())+"-->"+getState(Integer.parseInt(y)-1));
                                abcServer.setCurr(Integer.parseInt(y)-1);
                                System.out.println();
                            }
                                break;
                        }
                        else
                        {
                            System.out.println("Invalid input. Please try again");

                        }
                    }

                    break;
                }
                else if(x.equalsIgnoreCase("n")){
                    flag=1;
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please try again.");
                }
            }
            if(flag==1){
                System.out.println("Server is shutting down...");
                break;
            }
        }
    }
}
