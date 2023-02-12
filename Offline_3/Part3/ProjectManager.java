import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Component{
    private List<Component> children;
    private String projectName;
    private String name;

    ProjectManager(String name,String projectName) {
        this.name=name;
        this.projectName=projectName;
        children=new ArrayList<>();
    }

    @Override
    public void addChild(Component child){
        this.children.add(child);
    }

    @Override
    public void removeChild(Component child){
        this.children.remove(child);
    }

    @Override
    public void clear(){
        this.children.clear();
    }

    public int getChildCount(){
        return children.size();
    }

    @Override
    public void show(){
        System.out.println("\t\t- "+name+" "+"("+projectName+")");
        for(Component e:children){
            e.show();
        }
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }

    @Override
    public String getProjectName()
    {
        return projectName;
    }

    @Override
    public String toString(){
        String s="Name: "+name+"\n"+"Role: Project Manager\nCurrent Project: "+projectName+"\n"+"Number of Supervisees: "+getChildCount()+"\n";
        return s;
    }
}
