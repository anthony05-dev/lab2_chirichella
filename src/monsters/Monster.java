package monsters;

public class Monster {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monster(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    private String name;

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    private Species species;

}
