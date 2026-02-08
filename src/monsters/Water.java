package monsters;

public class Water extends Monster{

    public Water(String name, Species species, Behavior behavior) {
        super(name, species, behavior);
    }



    @Override
    public void specialPowers(){
        System.out.println("Hidden Mist Jutsu");
    }
}

