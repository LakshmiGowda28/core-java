class MagicPinExecuter{
    public static void main(String[] args ){
        String itemName = "PavBhaji";
        int quantity = 2;
        double price = MagicPin.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "VadaPav";
        quantity = 3;
        price = MagicPin.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "KathiRoll";
        quantity = 4;
        price = MagicPin.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "Lassi";
        quantity = 5;
        price = MagicPin.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ABC";
        quantity = 2;
        price = MagicPin.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);
    }
}