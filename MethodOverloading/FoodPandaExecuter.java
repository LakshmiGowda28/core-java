class FoodPandaExecuter{
    public static void main(String[] args ){
        String itemName = "ChocolateCake";
        int quantity = 2;
        double price = FoodPanda.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "Cupcake";
        quantity = 3;
        price = FoodPanda.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "IceCreamSundae";
        quantity = 4;
        price = FoodPanda.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "Donut";
        quantity = 5;
        price = FoodPanda.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ABC";
        quantity = 2;
        price = FoodPanda.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);
    }
}