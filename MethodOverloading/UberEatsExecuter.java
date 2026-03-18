class UberEatsExecuter{
    public static void main(String[] args ){
        String itemName = "ZingerBurger";
        int quantity = 2;
        double price = UberEats.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ChickenPopcorn";
        quantity = 3;
        price = UberEats.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ChickenWrap";
        quantity = 4;
        price = UberEats.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "MiniBurger";
        quantity = 5;
        price = UberEats.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ABC";
        quantity = 2;
        price = UberEats.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);
    }
}