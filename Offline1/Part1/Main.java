import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Enter 'O' to open an order or enter 'E' to exit");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            if(!(s.equals("O") || (s.equals("E"))))
                System.out.println("Invalid input");
            else
            {
                if(s.equals("E"))
                    break;
                else
                {
                    int flag=0;
                    List<PC> curOrder=new ArrayList<>();
                    int total=0;
                    while (true)
                    {
                        System.out.println("What kind of PC do you want? Enter 1/2");
                        System.out.println("1. Gaming PC");
                        System.out.println("2. Regular PC");
                        String t=sc.nextLine();
                        if(t.equals("O"))
                            System.out.println("An order is running currently");
                        else if(t.equals("E"))
                            System.out.println("Please order at least one PC");
                        else if(t.equals("1"))
                        {
                            PCBuilder pc4=new PCBuilder4();
                            Director director=new Director(pc4);
                            director.construct();
                            System.out.println("Do you want to order another PC? Press y for yes, E for no");
                            while (true)
                            {
                                String x=sc.nextLine();
                                if(x.equals("y"))
                                {
                                    curOrder.add(director.getPC());
                                    break;
                                }
                                else if(x.equals("E"))
                                {
                                    curOrder.add(director.getPC());
                                    int c=1;
                                    for(PC i:curOrder){
                                        System.out.println("PC "+c);
                                        System.out.println("Basic Components-> 70000 BDT");
                                        c++;
                                        i.info();
                                        total+=i.getCost();
                                        System.out.println();
                                    }
                                    System.out.println("Total: "+total+" BDT");
                                    flag=1;
                                    break;
                                }
                                else
                                    System.out.println("Invalid input");
                            }
                            if(flag==1)
                                break;
                        }
                        else if(t.equals("2"))
                        {
                            System.out.println("Which processor do you want? Enter 1/2/3");
                            System.out.println("1. Intel Core i5");
                            System.out.println("2. Intel Core i7");
                            System.out.println("3. Intel Core i9");
                            t=sc.nextLine();
                            while(true)
                            {
                                if(t.equals("1"))
                                {
                                    PCBuilder pc1=new PCBuilder1();
                                    Director director=new Director(pc1);
                                    director.construct();
                                    System.out.println("Do you want to order another PC? Press y for yes, E for no");
                                    while (true)
                                    {
                                        String x=sc.nextLine();
                                        if(x.equals("y"))
                                        {
                                            curOrder.add(director.getPC());
                                            break;
                                        }
                                        else if(x.equals("E"))
                                        {
                                            curOrder.add(director.getPC());
                                            flag=1;
                                            break;
                                        }
                                        else
                                            System.out.println("Invalid input");
                                    }
                                    break;
                                }
                                else if(t.equals("2"))
                                {
                                    PCBuilder pc2=new PCBuilder2();
                                    Director director=new Director(pc2);
                                    director.construct();
                                    System.out.println("Do you want to order another PC? Press y for yes, E for no");
                                    while (true)
                                    {

                                        String x=sc.nextLine();
                                        if(x.equals("y"))
                                        {
                                            curOrder.add(director.getPC());
                                            break;
                                        }
                                        else if(x.equals("E"))
                                        {
                                            curOrder.add(director.getPC());
                                            flag=1;
                                            break;
                                        }
                                        else
                                            System.out.println("Invalid input");
                                    }
                                    break;
                                }
                                else if(t.equals("3"))
                                {
                                    PCBuilder pc3=new PCBuilder3();
                                    Director director=new Director(pc3);
                                    director.construct();
                                    System.out.println("Do you want to order another PC? Press y for yes, E for no");
                                    while (true)
                                    {
                                        String x=sc.nextLine();
                                        if(x.equals("y"))
                                        {
                                            curOrder.add(director.getPC());
                                            break;
                                        }
                                        else if(x.equals("E"))
                                        {
                                            curOrder.add(director.getPC());
                                            flag=1;
                                            break;
                                        }
                                        else
                                            System.out.println("Invalid input");
                                    }
                                    break;
                                }
                                else
                                {
                                    System.out.println("Invalid input. Please try again");
                                }

                            }
                            if(flag==1) {
                                int c=1;
                                for(PC i:curOrder){
                                    System.out.println("PC "+c);
                                    System.out.println("Basic Components-> 70000 BDT");
                                    c++;
                                    i.info();
                                    total+=i.getCost();
                                    System.out.println();
                                }
                                System.out.println("Total: "+total+" BDT");
                                break;
                            }
                        }
                        else
                            System.out.println("Invalid input");
                    }
                    }
                }
            }
        }
    }
