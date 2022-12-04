import java.util.Scanner;

public class Director {
    private PCBuilder pcBuilder;

    public Director(PCBuilder pcBuilder)
    {
        this.pcBuilder=pcBuilder;
    }

    public PC getPC()
    {
        return this.pcBuilder.getPC();
    }

    public void construct()
    {
        this.pcBuilder.buildProcessor();
        this.pcBuilder.buildEquipment();
        while(true)
        {
            System.out.println("What do you want to do? 1/2/3");
            System.out.println("1. Add RAM");
            System.out.println("2. Add Graphics Card");
            System.out.println("3. None");
            Scanner sc=new Scanner(System.in);
            String x=sc.nextLine();
            if(x.equals("1"))
                this.pcBuilder.buildRam();
            else if(x.equals("2"))
                this.pcBuilder.buildGraphics();
            else if(x.equals("3"))
                break;
            else if(x.equals("O"))
            {
                System.out.println("Currently an order is ongoing");
                System.out.println("Do you want to add anything to this order? y/n");
                x= sc.nextLine();
                if(x.equals("y"))
                    continue;

            }
            else
                System.out.println("Invalid input");
        }
    }
}
