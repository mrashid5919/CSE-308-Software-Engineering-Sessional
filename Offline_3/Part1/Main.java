public class Main {
    public static void main(String[] args) {
        System.out.println("Let's meet the passengers.");
        Passenger crewMate=new Crewmate();
        Imposter imposter=new Imposter();
        Passenger adaptedImposter=new Adapter(imposter);
        crewMate.work();
        adaptedImposter.work();
    }
}
