import java.util.ArrayList;
import java.util.List;

public class Burger {
    private int BunCount;
    private int PattyCount;
    private int CheeseCount;
    private int BBQSauceCount;
    private int SaladCount;
    private int cost;
    //private int additionalCost;
    private List<Integer> individualCost=new ArrayList<>();
    private List<String> itemName=new ArrayList<>();

    public Burger()
    {
        this.cost=120;
        this.BunCount=2;
        this.PattyCount=1;
    }

    public void addPatty(String name,int cost)
    {
        this.PattyCount++;
        this.cost+=cost;
        itemName.add(name);
        individualCost.add(cost);
    }

    public void addCheese(String name,int cost)
    {
        this.CheeseCount++;
        this.cost+=cost;
        itemName.add(name);
        individualCost.add(cost);
    }

    public void addBBQSauce(String name,int cost)
    {
        this.BBQSauceCount++;
        this.cost+=cost;
        itemName.add(name);
        individualCost.add(cost);
    }

    public void addSalad(String name,int cost)
    {
        this.SaladCount++;
        this.cost+=cost;
        itemName.add(name);
        individualCost.add(cost);
    }

    public int getCost() {
        return cost;
    }

    public void info()
    {
        System.out.println("Base Elements");
        System.out.println("2 Buns 2x20 = 40 taka");
        System.out.println("1 Patty = 80 taka");

        System.out.println("Additional ELements");
        for(int i=0;i<itemName.size();i++)
        {
            if(individualCost.get(i)!=0)
            {
                System.out.println(itemName.get(i)+"-> "+individualCost.get(i)+" BDT");
            }
        }
        System.out.println("Total cost of this Burger: "+cost);
        System.out.println();
    }
}
