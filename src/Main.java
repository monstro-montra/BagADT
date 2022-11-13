public class Main {
    public static void main(String[] args) {

        WeaponBag weaponsBag = new WeaponBag();



        weaponsBag.add(new Sword());

        weaponsBag.getWeapon(0).attack();

        weaponsBag.isEmpty();
    }
}