public class Tesla extends Car{

    @Override
    public String getColor() {
        color="White";
        return color;
    }

    @Override
    public String manufacturingCountry() {
        country="US";
        return country;
    }

    @Override
    public String engines() {
        engine="Electric Engines";
        return engine;
    }

    @Override
    public String driveTrainSystem() {
        dtSystem="All wheels";
        return dtSystem;
    }

    @Override
    public String getModel()
    {
        model="Tesla";
        return model;
    }
}