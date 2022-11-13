import java.util.Random;

public class Sword extends Weapon{
    private final Random r = new Random();

    public Sword(){

    }

    @Override
    public void drawWeapon() {
        System.out.println("Sword has been drawn.");

    }

    @Override
    public void attack() {
        System.out.println("Player attacked with " + getAttackDamage() + " damage!");
    }

    @Override
    public void withdrawWeapon() {
        System.out.println("Sword has been sheathed.");
    }

    public float getAttackDamage(){
        float min = 1;
        float max = 10;
        attackDamage = min + r.nextFloat() * (max - min);
        return attackDamage;
    }
}
