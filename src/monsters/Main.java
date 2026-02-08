/*     * Project:
       * Purpose Details: Monster
       * Course: 242
       * Author: Anthony Chirichella
       * Date Developed: 2/5/26
       * Last Date Changed: 2/8/26
       * Rev: 3
 */




package monsters;

import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args){
        Monster m1 = new Water("Cthulhu", Species.SERPENT, Behavior.AGGRESSIVE);
        Monster m2 = new Undead("Frankenstien", Species.GHOUL, Behavior.NUTERAL);
        Monster m3 = new Fire("Napalm Zombie", Species.ZOMBIE, Behavior.AGGRESSIVE);
        Monster m4 = new Fire("Fafnir", Species.DRAGON, Behavior.NUTERAL);
        Monster m5 = new Spirit("Casper", Species.GHOST, Behavior.PASSIVE);

        System.out.println("Monster 1 - " + m1.getName() + ": Type - " + m1.getSpecies() + " " +  m1.getBehavior());
        m1.specialPowers();
        System.out.println("Monster 2 - " + m2.getName() + ": Type - " + m2.getSpecies() + " " +  m2.getBehavior());
        m2.specialPowers();
        System.out.println("Monster 3 - " + m3.getName() + ": Type - " + m3.getSpecies() + " " + m3.getBehavior());
        m3.specialPowers();
        System.out.println("Monster 4 - " + m4.getName() + ": Type - " + m4.getSpecies() + " " +  m4.getBehavior());
        m4.specialPowers();



    }

}
