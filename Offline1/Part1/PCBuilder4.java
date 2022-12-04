public class PCBuilder4 extends PCBuilder{

    public PCBuilder4()
    {
        this.pc=new PC();
    }

    @Override
    public void buildProcessor() {
        pc.setProcessor("AMD Ryzen 7 5700X",28000);
    }

    @Override
    public void buildEquipment() {
        pc.setEquipment(" ",0);
    }
}
