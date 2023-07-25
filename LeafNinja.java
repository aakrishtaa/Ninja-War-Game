/**
 * This is a concrete child class MistNinja which creates object for Ninja.
 * @author aakrishtaa
 * @version 11.0
 */

public class LeafNinja extends Ninja {
    private int poisonAmount;
/**
     * the instance takes four params.
     * @param name takes in the dino name and assigns it to the instance
     * @param health takes in the height of the dino and assigns it to the instance
     * @param attack takes in the width of the dino and assigns it to the instance
     * @param poisonAmount takes in number of poison damage and checks validity
     */
    public LeafNinja(String name, int health, int attack, int poisonAmount) {
        super(name, health, attack);
        if (poisonAmount > 0) {
            this.poisonAmount = poisonAmount;
        } else {
            this.poisonAmount = 5;
        }
    }

/**
     * the instance takes no args.
     */
    public LeafNinja() {
        super("Naruto Uzumaki", 5, 9);
        this.poisonAmount = 10;
    }

/**
     * method for poison attack.
     * @param otherNinja who takes the poison attack
     */
    public void poisonAttack(Ninja otherNinja) {
        if (this.poisonAmount <= 0) {
            return;
        }
        this.poisonAmount -= 1;
        if (otherNinja instanceof StoneNinja) {
            StoneNinja otherStoneNinja = (StoneNinja) otherNinja;
            if (otherStoneNinja.hasNinjaArmor()) {
                otherStoneNinja.breakArmor();
            }
        } else if (otherNinja instanceof MistNinja) {
            MistNinja otherMistNinja = (MistNinja) otherNinja;
            otherMistNinja.getConfused();

        } else if (otherNinja instanceof LeafNinja) {
            LeafNinja otherLeafNinja = (LeafNinja) otherNinja;
            int sum1 = this.getAttack() + this.getHealth();
            int sum2 = otherLeafNinja.getAttack() + otherLeafNinja.getHealth();
            if (sum1 > sum2) {
                otherLeafNinja.poisonAmount += 2;
            } else if (sum1 < sum2) {
                this.poisonAmount += 2;
            }
        }
    }

/**
     * the attack ninja method.
     * @param otherNinja to attack
     */

    @Override
    public void attackNinja(Ninja otherNinja) {
        poisonAttack(otherNinja);
        if (this.poisonAmount > 0) {
            otherNinja.getAttacked(this.getAttack());
        } else {
            otherNinja.getAttacked(this.getAttack() / 2);
        }
    }
/**
     * returns the tostring method for this class.
     * @return string form
     */
    @Override
    public String toString() {
        return "Leaf Ninja: " + super.toString() + "/" + poisonAmount;
    }

/**
     * return methods.
     * @return poison Amount
     */
    public int getPoisonAmount() {
        return this.poisonAmount;
    }
}
