import java.util.ArrayList;
import java.util.List;

public class Developer implements Component{

    private String name;
    private List<Component> Children;
    Developer(String name) {
        this.name=name;
        Children=new ArrayList<>();
    }

    @Override
    public void addChild(Component child){

    }

    @Override
    public void removeChild(Component child){

    }

    @Override
    public void clear(){

    }

    @Override
    public void show(){
        System.out.println("\t\t\t\t-"+this.name);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<Component> getChildren() {
        return Children;
    }

    @Override
    public String getProjectName()
    {
        return null;
    }
}
