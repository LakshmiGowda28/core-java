class GrabExecuter{
    public static void main(String[] args ){
        String itemName = "SushiRoll";
        int quantity = 2;
        double price = Grab.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ThaiFriedRice";
        quantity = 3;
        price = Grab.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "KungPaoChicken";
        quantity = 4;
        price = Grab.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "BubbleTea";
        quantity = 5;
        price = Grab.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ABC";
        quantity = 2;
        price = Grab.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);
    }
}