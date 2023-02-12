import java.util.ArrayList;
import java.util.List;

public class Company implements Component{

    private List<Component> Children;
    private String companyName;

    Company(String name) {
        Children=new ArrayList<>();
        companyName=name;
    }

    @Override
    public void addChild(Component child){
        this.Children.add(child);
    }

    @Override
    public void removeChild(Component child){
        this.Children.remove(child);
    }

    @Override
    public void clear(){
        this.Children.clear();
    }

    @Override
    public void show() {
        System.out.println("-\t"+companyName);
        for(Component child: Children){
            child.show();
        }
    }

    @Override
    public String getName(){
        return companyName;
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
