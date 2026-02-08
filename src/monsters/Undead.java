package monsters;

public class Undead extends Monster{

    public Undead(String name, Species species, Behavior behavior) {
        super(name, species, behavior);
    }

    @Override
    public void specialPowers(){
        System.out.println("Panzer Spawn");
    }
}
