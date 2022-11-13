import java.util.Random;

public class Staff extends Weapon{
    private float magicDamage;
    private final Random r = new Random();

    public Staff(String name){
        this.name = name;
    }

    @Override
    void drawWeapon() {
        System.out.println(getName() + " has been drawn.");
    }

    @Override
    void attack() {
        System.out.println("Player cast a spell using " + getName() + ", doing " + getMagicDamage()  + " damage to the enemy!");

    }

    @Override
    void withdrawWeapon() {
        System.out.println(getName() + " has been put away.");
    }

    //getters
    public float getMagicDamage(){
        float min = 5;
        float max = 50;
        magicDamage = min + r.nextFloat() * (max - min);
        return magicDamage;
    }
}
