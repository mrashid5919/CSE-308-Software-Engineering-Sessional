public class VendingMachine {
    private State curState;
    private double price;
    private int productCount;

    public VendingMachine(){
        this.curState=new InitState(this);
        productCount=5;
        price=50.0;
    }

    public void changeState(State state)
    {
        this.curState=state;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public double getPrice() {
        return price;
    }

    public void promptUser(){
        curState.promptUser();
    }
}
