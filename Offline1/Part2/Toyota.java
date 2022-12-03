public class Toyota extends Car{

    @Override
    public String getColor() {
        color="Red";
        return color;
    }

    @Override
    public String manufacturingCountry() {
        country="Japan";
        return country;
    }

    @Override
    public String engines() {
        engine="Hydrogen Fuel Cells";
        return engine;
    }

    @Override
    public String driveTrainSystem() {
        dtSystem="Rear wheels";
        return dtSystem;
    }

    @Override
    public String getModel()
    {
        model="Toyota";
        return model;
    }
}
