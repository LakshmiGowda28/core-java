class MilitaryRunner {

    public static void main(String[] args) {

        Military m = new Military();

        boolean added = m.addWeapon("Rifle");
        System.out.println(added);

        added = m.addWeapon("Pistol");
        System.out.println(added);

        added = m.addWeapon("Machine Gun");
        System.out.println(added);

        added = m.addWeapon("Sniper");
        System.out.println(added);

        added = m.addWeapon("Grenade");
        System.out.println(added);

        added = m.addWeapon("Rocket Launcher");
        System.out.println(added);

        added = m.addWeapon("Tank");
        System.out.println(added);

        added = m.addWeapon("Missile");
        System.out.println(added);
		
		added = m.addWeapon("Revolver");
        System.out.println(added);

        added = m.addWeapon("Assault Rifle");
        System.out.println(added);

        added = m.addWeapon("Mortar");
        System.out.println(added);

        added = m.addWeapon("Sword");
        System.out.println(added);

        added = m.addWeapon("Artillery Gun");
        System.out.println(added);

        added = m.addWeapon("Drone");
        System.out.println(added);

        added = m.addWeapon("Torpedo");
        System.out.println(added);
		
		added = m.addWeapon("Flamethrower");
        System.out.println(added);

        added = m.addWeapon("Bazooka");
        System.out.println(added);

        added = m.addWeapon("Submachine Gun");
        System.out.println(added);

        added = m.addWeapon("Torpedo");
        System.out.println(added);

m.getWeapons();
		
String weapon = m.getWeaponByName("Gun");
System.out.println("Weapon name is available");

m.updateWeapon("Rifle", "Sniper Rifle");
System.out.println("Weapon name is updated");

m.deleteWeapon("Gun");
System.out.println("Deleted successfully");

m.getWeapons();		
    }
}