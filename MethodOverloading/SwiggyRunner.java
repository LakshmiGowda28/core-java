class SwiggyRunner{
    public static void main(String[] args ){
        String itemName = "Samosa";
        double price = Swiggy.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "VegBurger";
        price = Swiggy.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "CheeseMaggi";
        price = Swiggy.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "Nachos";
        price = Swiggy.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = Swiggy.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}