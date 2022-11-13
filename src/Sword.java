import java.util.Random;

public class Sword extends Weapon{
    private final Random r = new Random();

    public Sword(String name){
        this.name = name;
    }

    @Override
    public void drawWeapon() {
        System.out.println(getName() + " has been drawn.");
    }

    @Override
    public void attack() {
        System.out.println("Player attacked the enemy with " + getName() + ", doing " +
                getAttackDamage()  + " damage!");
    }

    @Override
    public void withdrawWeapon() {
        System.out.println(getName() + " has been sheathed.");
    }


    public float getAttackDamage(){
        float min = 1;
        float max = 40;
        attackDamage = min + r.nextFloat() * (max - min);
        return attackDamage;
    }
}
