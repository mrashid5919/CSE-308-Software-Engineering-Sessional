abstract class State {
    protected VendingMachine machine;
    State(VendingMachine machine){
        this.machine=machine;
    }
    public abstract void promptUser();
}
