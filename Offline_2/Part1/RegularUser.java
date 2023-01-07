import java.util.Scanner;

public class RegularUser extends Observer{
    public RegularUser(ABCServer abcServer,String name){
        super(abcServer,name);
    }

    @Override
    public void update() {
        if(getAbcServer()==null){
            return;
        }

        int prev=getAbcServer().getPrev();
        int curr=getAbcServer().getCurr();

        System.out.println(this+" notified");

        Scanner sc=new Scanner(System.in);
        if(prev==0 && curr==1){
            while(true){
                System.out.println("What do you want to do? Enter 1/2");
                System.out.println("1. Continue using limited functionality from ABC server");
                System.out.println("2. Use service from DEF server with $20/hr payment");

                String x=sc.nextLine();
                if(x.equals("1")){
                    setCurr(1);
                    break;
                }
                else if(x.equals("2")){
                    setCurr(2);
                    break;
                }
                else{
                    System.out.println("Invalid input. Please try again");
                }
            }
        }
        else if(prev==0 && curr==2){
            while(true){
                System.out.println("Would you like to use service from DEF server with $20/hr payment? Enter y/n");
                String x=sc.nextLine();
                if(x.equalsIgnoreCase("y")){
                    setCurr(2);
                    break;
                }
                else if(x.equalsIgnoreCase("n")){
                    setCurr(3);
                    break;
                }
                else{
                    System.out.println("Invalid input. Please try again");
                }
            }
        }
        else if(prev==1 && curr==2){
            if(getCurr()==1){
                while(true){
                    System.out.println("Would you like to use service from DEF server with $20/hr payment? Enter y/n");
                    String x=sc.nextLine();
                    if(x.equalsIgnoreCase("y")){
                        setCurr(2);
                        break;
                    }
                    else if(x.equalsIgnoreCase("n")){
                        setCurr(3);
                        break;
                    }
                    else{
                        System.out.println("Invalid input. Please try again");
                    }
                }
            }

        }
        else if((prev==1 || prev==2) && curr==0){
            if(getCurr()==2){
                System.out.println("Total bill $x for using DEF server sent");
            }

            setCurr(0);
        }
        else if(prev==2 && curr==1){
            if(getCurr()==3){
                while(true){
                    System.out.println("What do you want to do? Enter 1/2");
                    System.out.println("1. Continue using limited functionality from ABC server");
                    System.out.println("2. Use service from DEF server with $20/hr payment");

                    String x=sc.nextLine();
                    if(x.equals("1")){
                        setCurr(1);
                        break;
                    }
                    else if(x.equals("2")){
                        setCurr(2);
                        break;
                    }
                    else{
                        System.out.println("Invalid input. Please try again");
                    }
                }
            }
        }

        if(getCurr()==0){
            System.out.println("Fully using ABC server");
        }
        else if(getCurr()==1){
            System.out.println("Using limited functionality from ABC server");
        }
        else if(getCurr()==2){
            System.out.println("Data copied to DEF server, currently using DEF server");
        }
        else if(getCurr()==3){
            System.out.println("No service currently, wait for later notifications");
        }
    }

    @Override
    public String toString(){
        return getName()+"(Regular user)";
    }
}
