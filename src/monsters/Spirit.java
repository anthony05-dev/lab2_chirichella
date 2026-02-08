package monsters;

public class Spirit extends Monster{

    public Spirit(String name, Species species, Behavior behavior) {
        super(name, species, behavior);
        setSpecialPower("Re-Animation Jutsu");
    }

    @Override
    public void specialPowers(){
        System.out.println(getName() + " Uses the undead " + getSpecialPower());
    }
}
