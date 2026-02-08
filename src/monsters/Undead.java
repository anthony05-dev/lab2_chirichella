package monsters;

public class Undead extends Monster{

    public Undead(String name, Species species, Behavior behavior) {
        super(name, species, behavior);
        setSpecialPower("Panzer Boss");

    }

    @Override
    public void specialPowers(){
        System.out.println(getName() + " Spawns a " + getSpecialPower());
    }
}
