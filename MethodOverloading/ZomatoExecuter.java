class ZomatoExecuter{
    public static void main(String[] args ){
        String itemName = "Biryani";
        int quantity = 2;
        double priceWithQuantity = Zomato.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "Noodles";
        quantity = 3;
        priceWithQuantity = Zomato.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "ChickenCurry";
        quantity = 4;
        priceWithQuantity = Zomato.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "Idli";
        quantity = 5;
        priceWithQuantity = Zomato.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);

        itemName = "ABC";
        quantity = 2;
        priceWithQuantity = Zomato.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + priceWithQuantity);
    }
}