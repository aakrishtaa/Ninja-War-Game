/**
 * This is a concrete child class MistNinja which creates object for Ninja.
 * @author aakrishtaa
 * @version 11.0
 */

public class StoneNinja extends Ninja {
    private boolean ninjaArmor;
/**
     * the instance takes four params.
     * @param name takes in the dino name and assigns it to the instance
     * @param health takes in the height of the dino and assigns it to the instance
     * @param attack takes in the width of the dino and assigns it to the instance
     * @param ninjaArmor takes in if armour on ninja exists or not
     */

    public StoneNinja(String name, int health, int attack, boolean ninjaArmor) {
        super(name, health, attack);
        this.ninjaArmor = ninjaArmor;
    }

/**
     * the instance takes no args.
     */

    public StoneNinja() {
        this("Naruto Uzumaki", 8, 10, true);
    }

/**
     * edits the already existing method.
     * changes ninjaArmor
     */
    public void breakArmor() {
        ninjaArmor = false;
    }
/**
     * return methods.
     * @return ninjaArmor
     */

    public boolean hasNinjaArmor() {
        return ninjaArmor;
    }
/**
     * method to get attack.
     * @param damage the amount of damage inflicted
     */
    @Override
    public void getAttacked(int damage) {
        if (ninjaArmor) {
            if (damage > 20) {
                super.getAttacked(damage - 20);
                breakArmor();
            } else {
                breakArmor();
            }
        } else {
            super.getAttacked(damage);
        }
    }
/**
     * returns the tostring method for this class.
     * @return string form
     */

    @Override
    public String toString() {
        return "Stone Ninja: " + super.toString() + "/" + ninjaArmor;
    }

}
