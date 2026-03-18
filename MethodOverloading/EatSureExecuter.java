class EatSureExecuter{
    public static void main(String[] args ){
        String itemName = "QuinoaSalad";
        int quantity = 2;
        double price = EatSure.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "FruitBowl";
        quantity = 3;
        price = EatSure.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ProteinShake";
        quantity = 4;
        price = EatSure.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "BoiledEggs";
        quantity = 5;
        price = EatSure.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ABC";
        quantity = 2;
        price = EatSure.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);
    }
}