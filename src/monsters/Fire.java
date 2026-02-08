package monsters;

public class Fire extends Monster{

    public Fire(String name, Species species, Behavior behavior) {
        super(name, species, behavior);
        setSpecialPower("FireBall Jutsu");
    }

    @Override
    public void specialPowers(){
        System.out.println(getName() + " Uses " + getSpecialPower());
    }
}
