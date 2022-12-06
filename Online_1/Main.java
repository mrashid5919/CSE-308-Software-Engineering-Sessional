import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Do you want to get a burger? y/n");
            Scanner sc=new Scanner(System.in);
            String x=sc.nextLine();
            if(x.equals("n"))
            {
                break;
            }
            else if(x.equals("y"))
            {
                Director director=new Director();
                director.Construct();
                director.getBurger().info();
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
    }
}
