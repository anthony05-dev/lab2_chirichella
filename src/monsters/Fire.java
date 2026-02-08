/*     * Project:
       * Purpose Details: Monster
       * Course: 242
       * Author: Anthony Chirichella
       * Date Developed: 2/5/26
       * Last Date Changed: 2/8/26
       * Rev: 3
 */


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
