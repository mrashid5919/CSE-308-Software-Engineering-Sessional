abstract class Car {
    protected String color;
    protected String country;
    protected String engine;
    protected String dtSystem;
    protected String model;

    abstract String getColor();

    abstract String manufacturingCountry();

    abstract String engines();

    abstract String driveTrainSystem();

    abstract String getModel();

    public void info()
    {
        System.out.println("Brand: "+getModel()+"\n");
        System.out.println("Color: "+getColor()+"\n");
        System.out.println("Manufacturing Country: "+manufacturingCountry()+"\n");
        System.out.println("Engine: "+engines()+"\n");
        System.out.println("Drive Train System: "+driveTrainSystem()+"\n");
    }
}
