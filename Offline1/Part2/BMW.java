public class BMW extends Car{

    @Override
    public String getColor() {
        color="Black";
        return color;
    }

    @Override
    public String manufacturingCountry() {
        country="Germany";
        return country;
    }

    @Override
    public String engines() {
        engine="Electric Engines";
        return engine;
    }

    @Override
    public String driveTrainSystem() {
        dtSystem="Rear Wheels";
        return dtSystem;
    }

    @Override
    public String getModel()
    {
        model="BMW";
        return model;
    }
}