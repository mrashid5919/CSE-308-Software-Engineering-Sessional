public class Client {
    public static void main(String[] args) {
        OS windoors=new Windoors();
        OS linus=new Linus();
        Device nb=new Notebook(windoors,"Notebook Computer");
        Device phone=new Smartphone(linus,"Smartphone");
        nb.store();
        nb.interact();
        nb.communicate();

        phone.store();
        phone.interact();
        phone.communicate();

        nb.setOs(linus);
        nb.store();
        nb.interact();
        nb.communicate();
    }
}
