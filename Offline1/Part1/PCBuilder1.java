public class PCBuilder1 extends PCBuilder{

    public PCBuilder1()
    {
        this.pc=new PC();
    }

    @Override
    public void buildProcessor() {
        pc.setProcessor("Intel Core i5",20000);
    }

    @Override
    public void buildEquipment() {
        pc.setEquipment("CPU Cooler",36000);
    }
}
