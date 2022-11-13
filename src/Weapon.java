
public abstract class Weapon {
    float attackDamage;
    float magicDamage;
    String name;


    abstract void drawWeapon();
    abstract void attack();
    abstract void withdrawWeapon();

    public String getName(){
        return this.name;
    }

}
