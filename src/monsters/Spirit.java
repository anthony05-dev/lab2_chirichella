/*   * Project:
     * Purpose Details: Monster
     * Course: 242
     * Author: Anthony Chirichella
     * Date Developed: 2/5/26
     * Last Date Changed: 2/8/26
     * Rev: 3
 */

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
