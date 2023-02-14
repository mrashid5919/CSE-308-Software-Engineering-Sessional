public abstract class OS {
    protected String name;
    public void storage(){
        System.out.println("Functionality: store");
        System.out.println("Module: storage");
        System.out.println("Operating system: "+name);
        System.out.println();
    }
    public void Interface(){
        System.out.println("Functionality: interact");
        System.out.println("Module: interface");
        System.out.println("Operating system: "+name);
        System.out.println();
    }
    public void communication(){
        System.out.println("Functionality: communicate");
        System.out.println("Module: communication");
        System.out.println("Operating system: "+name);
        System.out.println();
    }
}
