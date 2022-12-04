import java.util.ArrayList;
import java.util.List;

public class PC {
    private String processor;
    private String equipment;
    private List<String> ram;
    private List<String> graphicsCard;
    private int cost;
    private int additionalCost;
    private List<Integer> individualCost;
    private List<String> itemName;

    public PC()
    {
        this.cost=70000;
        ram=new ArrayList<>();
        graphicsCard=new ArrayList<>();
        individualCost=new ArrayList<>();
        itemName=new ArrayList<>();
    }

    public void setProcessor(String processor,int cost) {
        this.processor = processor;
        this.itemName.add(processor);
        individualCost.add(cost);
        this.cost+=cost;
    }

    public void setEquipment(String equipment,int cost) {
        this.equipment = equipment;
        this.itemName.add(equipment);
        individualCost.add(cost);
        this.cost+=cost;
    }

    public void setRam(String ram,int cost) {
        this.ram.add(ram);
        this.itemName.add(ram);
        individualCost.add(cost);
        this.cost+=cost;
        this.additionalCost+=cost;
    }

    public void setGraphicsCard(String graphicsCard,int cost) {
        this.graphicsCard.add(graphicsCard);
        this.itemName.add(graphicsCard);
        individualCost.add(cost);
        this.cost+=cost;
        this.additionalCost+=cost;
    }

    public int getCost() {
        return cost;
    }

    public void info()
    {
        for(int i=0;i<itemName.size();i++)
        {
            if(individualCost.get(i)!=0)
            {
                System.out.println(itemName.get(i)+"-> "+individualCost.get(i)+" BDT");
            }
        }
        System.out.println("Total cost of this PC: "+cost);
        System.out.println();
    }
}
