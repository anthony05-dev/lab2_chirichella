/*   * Project:
     * Purpose Details: Monster
     * Course: 242
     * Author: Anthony Chirichella
     * Date Developed: 2/5/26
     * Last Date Changed: 2/8/26
     * Rev: 3
 */


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

