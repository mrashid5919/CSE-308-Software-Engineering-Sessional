public class Builder {
    private Burger burger;

    Builder()
    {
        this.burger=new Burger();
    }

    public void buildPatty(){
        burger.addPatty("Patty",80);
    }

    public void buildCheese(){
        burger.addCheese("Cheese",30);
    }

    public void buildBBQSauce(){
        burger.addBBQSauce("BBQ Sauce",20);
    }

    public void buildSalad(){
        burger.addSalad("Salad",10);
    }

    public Burger getBurger()
    {
        return this.burger;
    }
}
