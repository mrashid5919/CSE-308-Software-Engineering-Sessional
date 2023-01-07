import java.util.Scanner;

public class PremiumUser extends Observer{
    public PremiumUser(ABCServer abcServer,String name){
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

        if(prev!=1 && curr==1){
            //fully functional to partially functional
            while(true){
                System.out.println("What do you want to do? Enter 1/2");
                System.out.println("1. Use service from two servers (partially from the server of ABC and partially from the server of DEF)");
                System.out.println("2. Use service from one server (DEF)");
                String x=sc.nextLine();
                if(x.equals("1")){
                    setCurr(1); //use from two servers
                    break;
                }
                else if(x.equals("2")){
                    setCurr(2);//Use from DEF only
                    break;
                }
                else{
                    System.out.println("Invalid input");
                }
            }
        }
        else if(prev!=2 && curr==2){
            //fully/partially functional to fully down
            setCurr(2);
        }
        else if(prev!=0 && curr==0){
            //partially/fully down to fully functional
            setCurr(0);
        }

        if(getCurr()==0){
            System.out.println("Using service from ABC sever");
        }
        else if(getCurr()==1){
            System.out.println("Using service from both ABC and DEF servers");
        }
        else if(getCurr()==2){
            System.out.println("Using service from DEF server");
        }
    }

    @Override
    public String toString(){
        return getName()+"(Premium User)";
    }
}
