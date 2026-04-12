class Military {

    String weaponNames[] = new String[21];
    int index;

    public boolean addWeapon(String weapon) {

        boolean isAdded = false;

        if (index < weaponNames.length) {

            if (weapon != null && !weapon.isEmpty()) {
                weaponNames[index++] = weapon;
                isAdded = true;
            } else {
                System.out.println(weapon + " is not valid");
            }

        } else {
            System.out.println("Weapon list is full....");
        }

        return isAdded;
    }

    public void getWeapons() {

        System.out.println("Military Weapon List:");

        for (String weapon : weaponNames) {
            System.out.println(weapon);
        }
    }

    public String getWeaponByName(String weaponName) {

        String name = null;

        for (String weapon : weaponNames) {
            if (weapon == weaponName) {
                name = weapon;
                break;
            }
        }

        if (name == null) {
            System.out.println("Weapon is not found");
        }

        return name;
    }

    public boolean updateWeapon(String existingWeapon, String updatedWeapon) {

        boolean isUpdated = false;

        for (int i = 0; i < weaponNames.length; i++) {

            if (weaponNames[i] == existingWeapon) {
                weaponNames[i] = updatedWeapon;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingWeapon + " is not found");
        }

        return isUpdated;
    }
	
public boolean deleteWeapon(String weaponName) {

    boolean isDeleted = false;

    for (int i = 0; i < weaponNames.length; i++) {

        if (weaponNames[i] == weaponName) {
            weaponNames[i] = null;
            isDeleted = true;
            break;
        }
    }

    if (isDeleted == false) {
        System.out.println(weaponName + " is not found");
    }

    return isDeleted;
}	
}