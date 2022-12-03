public class CarFactory{
    public Car getCar(String continent)
    {
        if(continent==null)
            return null;
        if(continent.equalsIgnoreCase("Asia"))
            return new Toyota();
        else if(continent.equalsIgnoreCase("Europe"))
            return new BMW();
        else if(continent.equalsIgnoreCase("United States"))
            return new Tesla();
        return null;
    }
}
