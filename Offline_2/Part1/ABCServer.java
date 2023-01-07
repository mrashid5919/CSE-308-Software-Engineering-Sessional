import java.util.ArrayList;
import java.util.List;

public class ABCServer implements Subject{
    private int prev;
    private int curr;
    private List<Observer> observerList;

    public ABCServer(){
        observerList=new ArrayList<>();
        curr=0;
    }

    public void setCurr(int curr){
        prev=this.curr;
        this.curr=curr;

        notifyAllObservers();
    }

    public int getPrev(){
        return prev;
    }

    public int getCurr(){
        return curr;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public boolean detach(String name) {
        for(Observer o:observerList){
            if(o.getName().equalsIgnoreCase(name)){
                observerList.remove(o);
                return true;
            }
        }
        return false;
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o:observerList){
            o.update();
        }
    }
}
