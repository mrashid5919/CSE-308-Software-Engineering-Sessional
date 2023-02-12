import java.util.List;

public interface Component {
    public void show();

    void addChild(Component child);
    void removeChild(Component child);

    void clear();

    public String getName();

    public List<Component> getChildren();

    public String getProjectName();
}
