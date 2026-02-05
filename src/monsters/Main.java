package monsters;

import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args){
        Monster m1 = new Water("Cthulhu", Species.SERPENT);
        Monster m2 = new Undead("Frankenstien", Species.GHOUL);
        Monster m3 = new Fire("Napalm Zombie", Species.ZOMBIE);
        Monster m4 = new Fire("Fafnir", Species.DRAGON);
        Monster m5 = new Spirit("Casper", Species.GHOST);

        System.out.println("Monster 1 - " + m1.getName() + ": Type - " + m1.getSpecies());
        System.out.println("Monster 2 - " + m2.getName() + ": Type - " + m2.getSpecies());
        System.out.println("Monster 3 - " + m3.getName() + ": Type - " + m3.getSpecies());
        System.out.println("Monster 4 - " + m4.getName() + ": Type - " + m4.getSpecies());


    }

}
