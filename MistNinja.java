/**
 * This is a concrete child class MistNinja which creates object for Ninja.
 * @author aakrishtaa
 * @version 11.0
 */

public class MistNinja extends Ninja {
    private int hitChance;

/**
     * the instance takes four params.
     * @param name takes in the dino name and assigns it to the instance
     * @param health takes in the height of the dino and assigns it to the instance
     * @param attack takes in the width of the dino and assigns it to the instance
     * @param hitChance takes in hitchange of ninja and checks if valid
     */

    public MistNinja(String name, int health, int attack, int hitChance) {
        super(name, health, attack);
        if (hitChance < 5 || hitChance > 15) {
            this.hitChance = 12;
        } else {
            this.hitChance = hitChance;
        }
    }

/**
     * the instance takes in no args.
     */

    public MistNinja() {
        super("Naruto Uzumaki", 7, 8);
        hitChance = 12;
    }

/**
     * return methods.
     * @return hitchance
     */

    public int getHitChance() {
        return hitChance;
    }
/**
     * checks valid input for hitchance and adds one.
     */

    public void getConfused() {
        if (hitChance >= 5 && hitChance < 15) {
            hitChance += 1;
        }
    }
/**
     * takes in damage amount and inflicts it on Ninja.
     * @param damage the amount of health that is reduced
     */

    @Override
    public void getAttacked(int damage) {
        if (damage % hitChance == 0) {
            damage = 0;
            super.getAttacked(damage);
        } else {
            super.getAttacked(damage);
        }
    }

/**
     * return string.
     * @return string version of mist ninja
     */

    @Override
    public String toString() {
        return "Mist Ninja: " + super.toString() + "/" + hitChance;
    }
}
