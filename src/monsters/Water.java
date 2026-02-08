package monsters;

public class Water extends Monster{

    public Water(String name, Species species, Behavior behavior) {
        super(name, species, behavior);
        setSpecialPower("Hidden Mist Justu");
    }



    @Override
    public void specialPowers(){
        System.out.println(getName() + " Uses water style for " + getSpecialPower());
    }
}

