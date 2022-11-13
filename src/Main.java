public class Main {
    public static void main(String[] args) {

        WeaponBag weaponsBag = new WeaponBag();

        weaponsBag.add(new Sword("Master Sword"));

        weaponsBag.getWeapon(0).drawWeapon();

        weaponsBag.getWeapon(0).drawWeapon();


        weaponsBag.isEmpty();
    }
}