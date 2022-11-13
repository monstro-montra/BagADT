import java.util.ArrayList;

public class WeaponBag<T> implements Bag<T> {
    private int numWeapons;
    private ArrayList<T> weapons; //array of weapons

    //constructor
    public WeaponBag(){
        this.weapons = (ArrayList<T>) new ArrayList<Object>();
    }

    //Bag methods
    @Override
    public void add(T weapon) {
        weapons.add(weapon);
    }

    @Override
    public void discard(T weapon) {
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
        return (Weapon) weapons.get(index);
    }

}
