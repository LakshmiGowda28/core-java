class PetShop {

    String accessories[] = new String[16];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;

        if (index < accessories.length) {
            if (accessory != null) {
                accessories[index++] = accessory;
                isAdded = true;
            } else {
                System.out.println("Invalid accessory");
            }
        } else {
            System.out.println("Accessories list is full....");
        }

        return isAdded;
    }

    public void getAccessories() {
        System.out.println("PetShop Accessories List:");

        for (String accessory : accessories) {
            System.out.println(accessory);
        }
    }
}