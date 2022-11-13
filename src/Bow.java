import java.util.Random;

public class Bow extends Weapon{
    private final Random r = new Random();

    public Bow(String name){
        this.name = name;
    }

    @Override
    void drawWeapon() {
        System.out.println(getName() + " has been drawn.");
    }

    @Override
    void attack() {
        System.out.println("Player shot the enemy with " + getName() + ", doing "
                + getAttackDamage()  + " ranged damage!");
    }

    @Override
    void withdrawWeapon() {
        System.out.println(getName() + " has been stored.");

    }

    public float getAttackDamage(){
        float min = 1;
        float max = 25;
        attackDamage = min + r.nextFloat() * (max - min);
        return attackDamage;
    }


}
