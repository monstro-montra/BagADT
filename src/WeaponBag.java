import java.util.ArrayList;

public class WeaponBag<T> implements Bag<T> {
    private final ArrayList<T> weapons; //array of weapons

    //constructor
    public WeaponBag(){
        this.weapons = new ArrayList<>();
    }

    //Bag methods
    @Override
    public void add(T weapon) {
        weapons.add(weapon);
        System.out.println("New weapon added! " + getWeapon(weapons.size() - 1).getName() + ".");
    }

    @Override
    public void discard(T weapon) {
        System.out.println("Discarded " + "'" + getWeapon(weapons.size() - 1).getName() + ".'");
        weapons.remove(weapon);
    }

    @Override
    public void sort() {

    }

    @Override
    public boolean isEmpty() {
        if (weapons.size() == 0){
            System.out.println("Empty bag!");
            return true;
        } else {
            System.out.println("Bag is not empty.");
            return false;
        }
    }

    //getters
    public Weapon getWeapon(int index){
        return (Weapon)weapons.get(index);
    }

}
