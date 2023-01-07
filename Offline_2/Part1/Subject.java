public interface Subject {
    void attach(Observer observer);
    boolean detach(String name);
    void notifyAllObservers();
}
