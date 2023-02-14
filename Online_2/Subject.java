import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private int price;
    private String name;
    private List<Observer> observerList;

    public Subject(String name,int price){
        this.name=name;
        this.price=price;
        observerList=new ArrayList<>();
    }

    public void setPrice(int price){
        this.price=price;
        notifyAllObservers();
    }

    public String getName()
    {
        return name;
    }

    public void attach(Observer observer){
        System.out.println(name+" added to "+this.name);
        observerList.add(observer);
    }
    public boolean detach(String name){
        for(Observer o:observerList){
            if(o.getName().equalsIgnoreCase(name)){
                System.out.println(name+" discarded from "+this.name);
                observerList.remove(o);
                return true;
            }
        }
        return false;
    }
    public void notifyAllObservers(){

        for(Observer o:observerList){
            o.update();
        }
    }
}
