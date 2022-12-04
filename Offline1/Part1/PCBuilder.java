import java.util.Scanner;

abstract class PCBuilder {
    protected PC pc;
    abstract void buildProcessor();
    abstract void buildEquipment();

    public void buildRam() {
        Scanner sc=new Scanner(System.in);
        while(true)
        {

                System.out.println("Which ram do you want? Enter 1 or 2");
                System.out.println("1. 8 GB DDR4 RAM, 2666 MHz");
                System.out.println("2. 8 GB DDR4 RAM, 3200 MHz");
                String x=sc.nextLine();
                    if(x.equals("1"))
                    {
                        pc.setRam("8 GB DDR4 RAM, 2666 MHz",2620);
                        break;
                    }
                    else if(x.equals("2"))
                    {
                        pc.setRam("8 GB DDR4 RAM, 3200 MHz",2950);
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid input. Please enter 1 or 2");
                    }
        }
    }
    public void buildGraphics()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
                System.out.println("Which graphics card do you want? Enter 1 or 2");
                System.out.println("1. 2 GB Graphics Card");
                System.out.println("2. 4 GB Graphics Card");
                String x=sc.nextLine();
                if(x.equals("1"))
                    {
                        pc.setGraphicsCard("2 GB Graphics Card",6500);
                        break;
                    }
                    else if(x.equals("2"))
                    {
                        pc.setGraphicsCard("4 GB Graphics Card",7600);
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid input. Please enter 1 or 2");
                    }
                }
            }

    public PC getPC() {
        return this.pc;
    }
}
