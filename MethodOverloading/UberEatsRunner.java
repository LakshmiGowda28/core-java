class UberEatsRunner{
    public static void main(String[] args ){
        String itemName = "ZingerBurger";
        double price = UberEats.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "ChickenWrap";
        price = UberEats.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "LoadedFries";
        price = UberEats.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "CheeseSticks";
        price = UberEats.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = UberEats.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}