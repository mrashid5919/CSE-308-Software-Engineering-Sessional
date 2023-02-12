public class Adapter implements Passenger{
    Imposter imposter;

    Adapter(Imposter imposter){
        this.imposter=imposter;
    }

    @Override
    public void work() {
        imposter.evilWork();
    }
}
