package monsters;

public abstract class Monster {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monster(String name, Species species, Behavior behavior) {
        this.name = name;
        this.species = species;
        this.behavior = behavior;
    }

    private String name;

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    private Species species;

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    private Behavior behavior;

    public abstract void specialPowers();
}
