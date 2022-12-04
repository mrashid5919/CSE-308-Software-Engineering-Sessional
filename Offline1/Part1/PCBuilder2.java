public class PCBuilder2 extends PCBuilder{

    public PCBuilder2()
    {
        this.pc=new PC();
    }

    @Override
    public void buildProcessor() {
        pc.setProcessor("Intel Core i7",37000);
    }

    @Override
    public void buildEquipment() {
        pc.setEquipment("Liquid Cooler",17000);
    }
}