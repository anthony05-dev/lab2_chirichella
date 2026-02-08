package monsters;

public class Spirit extends Monster{

    public Spirit(String name, Species species, Behavior behavior) {
        super(name, species, behavior);
    }

    @Override
    public void specialPowers(){
        System.out.println(" ");
    }
}
