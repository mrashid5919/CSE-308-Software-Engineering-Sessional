import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<Subject> StockList;
    private String name;

    public Observer(String name){
        this.name=name;
        StockList=new ArrayList<>();
    }

    public List<Subject> getStockList() {
        return StockList;
    }

    public void addStock(Subject stock) {
        StockList.add(stock);
        stock.attach(this);
    }

    public void removeStock(String name){
        for(Subject s:StockList){
            if(s.getName().equals(name)){
                s.detach(this.name);
                StockList.remove(s);
                break;
            }
        }
    }

    public String getName(){
        return name;
    }

    public void update(){
        System.out.println("Update received by "+name);
    }
}
