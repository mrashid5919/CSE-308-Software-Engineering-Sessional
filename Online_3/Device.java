public abstract class Device {
    protected OS os;
    private String name;

    Device(OS os,String name){
        this.os=os;
        this.name=name;
    }

    public void store(){
        System.out.println(name);
        os.storage();
    }

    public void interact(){
        System.out.println(name);
        os.Interface();
    }

    public void communicate(){
        System.out.println(name);
        os.communication();
    }

    public void setOs(OS os){
        this.os=os;
    }
}
