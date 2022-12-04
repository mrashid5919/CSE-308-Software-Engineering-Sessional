public class PCBuilder3 extends PCBuilder{

    public PCBuilder3()
    {
        this.pc=new PC();
    }

    @Override
    public void buildProcessor() {
        pc.setProcessor("Intel Core i9",65000);
    }

    @Override
    public void buildEquipment() {
        pc.setEquipment("DVD Drive",6000);
    }
}
