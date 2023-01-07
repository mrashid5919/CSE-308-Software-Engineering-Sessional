public abstract class Observer {
    private ABCServer abcServer;
    private int currState;
    private String name;

    public Observer(ABCServer abcServer,String name){
        this.abcServer=abcServer;
        this.abcServer.attach(this);

        this.name=name;
        currState=0;
    }

    public ABCServer getAbcServer() {
        return abcServer;
    }

    public void setAbcServer(ABCServer abcServer) {
        this.abcServer = abcServer;
    }

    public int getCurr() {
        return currState;
    }

    public void setCurr(int curr) {
        this.currState = curr;
    }

    public String getName() {
        return name;
    }

    //public abstract void notifyObserver();
    public abstract void update();
}
