class Military {

    String weaponNames[] = new String[21];
    int index;

    public boolean addWeapon(String weapon) {
        boolean isAdded = false;

        if (index < weaponNames.length) {
            if (weapon != null) {
                weaponNames[index++] = weapon;
                isAdded = true;
            } else {
                System.out.println("Invalid weapon name");
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
}