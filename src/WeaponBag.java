import java.util.ArrayList;

public class WeaponBag<Object> implements Bag<Object> {
    private final ArrayList<Weapon> weapons; //array of weapons

    //constructor
    public WeaponBag(){
        this.weapons = new ArrayList<>();
    }

    //Bag methods

    @Override
    public void add(Object item) {
        weapons.add((Weapon) item);
        System.out.println("New weapon added of " + getWeapon(weapons.size()-1).getClass()
                + "! " + "'" + getWeapon(weapons.size() - 1 ).getName() + ".'");
    }

    @Override
    public void discard(String itemName) {
        for (int i = 0; i < weapons.size(); i++){
            if(weapons.get(i).getName().equals(itemName)) {
                System.out.println("Removed "+ weapons.get(i).getName() + ".");
                weapons.remove(i);
            }
        }
    }

    @Override
    public void sort() {

    }

    @Override
    public void isEmpty() {
        if (weapons.size() == 0){
            System.out.println("Empty bag!");
        } else {
            System.out.println("Bag is not empty.");
        }
    }

    //getters
    public Weapon getWeapon(String name){
        for (Weapon weapon : weapons) {
            if (weapon.getName().equals(name)) {
                return weapon;
            }
        }
        return null;
    }

    public Weapon getWeapon(int index){
        return weapons.get(index);
    }

}
