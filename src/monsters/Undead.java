/*   * Project:
     * Purpose Details: Monster
     * Course: 242
     * Author: Anthony Chirichella
     * Date Developed: 2/5/26
     * Last Date Changed: 2/8/26
     * Rev: 3
 */




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
