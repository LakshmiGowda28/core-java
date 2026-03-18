class SwiggyExecuter{
    public static void main(String[] args ){
        String itemName = "Samosa";
        int quantity = 2;
        double priceWithQuantity = Swiggy.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "FrenchFries";
        quantity = 3;
        priceWithQuantity = Swiggy.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "VegBurger";
        quantity = 4;
        priceWithQuantity = Swiggy.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "Popcorn";
        quantity = 5;
        priceWithQuantity = Swiggy.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "ABC";
        quantity = 2;
        priceWithQuantity = Swiggy.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);
    }
}