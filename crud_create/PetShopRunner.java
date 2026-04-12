class PetShopRunner {

public static void main(String[] args) {

PetShop p = new PetShop();

boolean added = p.addAccessory("Dog Collar");
System.out.println(added);

added = p.addAccessory("Leash");
System.out.println(added);

added = p.addAccessory("Pet Bed");
System.out.println(added);

added = p.addAccessory("Food Bowl");
System.out.println(added);

added = p.addAccessory("Water Bottle");
System.out.println(added);

        added = p.addAccessory("Pet Shampoo");
        System.out.println(added);

        added = p.addAccessory("Pet Toys");
        System.out.println(added);

        added = p.addAccessory("Cat Litter Box");
        System.out.println(added);

        added = p.addAccessory("Scratch Post");
        System.out.println(added);

        added = p.addAccessory("Bird Cage");
        System.out.println(added);

        added = p.addAccessory("Fish Tank");
        System.out.println(added);

        added = p.addAccessory("Pet Brush");
        System.out.println(added);

        added = p.addAccessory("Nail Clipper");
        System.out.println(added);

        added = p.addAccessory("Pet Carrier");
        System.out.println(added);

        added = p.addAccessory("Training Pads");
        System.out.println(added);

        added = p.addAccessory("Chew Toys");
        System.out.println(added);

        p.getAccessories();
    }
}