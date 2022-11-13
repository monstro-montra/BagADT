public class Main {
    public static void main(String[] args) {

        //create a new Weapon
        WeaponBag<Weapon> weaponsBag = new WeaponBag<>(); //create a new weapon bag

        weaponsBag.isEmpty();

        weaponsBag.add(new Sword("Master Sword"));
        weaponsBag.add(new Staff("Ragnarok"));
        weaponsBag.add(new Bow("Meteor Bow"));

        System.out.println();

        weaponsBag.getWeapon("Master Sword").drawWeapon();
        weaponsBag.getWeapon("Master Sword").attack();
        weaponsBag.getWeapon("Master Sword").withdrawWeapon();

        System.out.println();

        weaponsBag.getWeapon("Ragnarok").drawWeapon();
        weaponsBag.getWeapon("Ragnarok").attack();
        weaponsBag.getWeapon("Ragnarok").withdrawWeapon();

        System.out.println();

        weaponsBag.getWeapon("Meteor Bow").drawWeapon();
        weaponsBag.getWeapon("Meteor Bow").attack();
        weaponsBag.getWeapon("Meteor Bow").withdrawWeapon();

        System.out.println();

        weaponsBag.discard("Master Sword");
        weaponsBag.discard("Ragnarok");
        weaponsBag.discard("Meteor Bow");
        weaponsBag.isEmpty();

    }
}