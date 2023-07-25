/**
 * This is an abstract parent class Ninja which creates the blueprints for its subclasses.
 * @author aakrishtaa
 * @version 11.0
 */

public abstract class Ninja implements Comparable<Ninja> {

    private String name;
    private int health;
    private int attack;

/**
     * return methods.
     * @return name
     */

    public String getName() {
        return name;
    }

/**
     * return methods.
     * @return health
     */

    public int getHealth() {
        return health;
    }

/**
     * return methods.
     * @return attack
     */

    public int getAttack() {
        return attack;
    }

/**
     * the instance of ninja.
     * @param name takes in the name and assigns it to the instance
     * @param health takes in the health of the ninja and assigns it to the instance
     * @param attack takes in the attack of the ninja and assigns it to the instance
     */

    public Ninja(String name, int health, int attack) {
        this.name = (name == null || name.isEmpty()) ? "Naruto Uzumaki" : name.trim();
        this.health = (health > 0) ? health : 1;
        this.attack = (attack >= 2) ? attack : 2;
    }

/**
     * checks if a ninja has less than 0 health.
     * @return health
     */

    public boolean hasFainted() {
        return health <= 0;
    }

/**
     * return methods.
     * @param damage takes in int damage
     * checks if health = 0
     */

    public void getAttacked(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

/**
     * attack the current ninja taken in.
     * @param other of type Ninja
     */

    public void attackNinja(Ninja other) {
        other.getAttacked(attack);
    }

/**
     * return toString.
     * @return string representation of ninja
     */

    @Override
    public String toString() {
        return name + "/" + attack + "/" + health;
    }

/**
     * compare methods.
     * @param other of type Ninja
     * @return Wrapperclass method to compare
     */

    @Override
    public int compareTo(Ninja other) {
        if (other == null) {
            return 1;
        }
        int thisPower = health + attack;
        int otherPower = other.health + other.attack;
        return Integer.compare(thisPower, otherPower);
    }
}
