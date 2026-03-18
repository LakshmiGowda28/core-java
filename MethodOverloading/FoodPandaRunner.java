class FoodPandaRunner{
    public static void main(String[] args ){
        String itemName = "ChocolateCake";
        double price = FoodPanda.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "GulabJamun";
        price = FoodPanda.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "ChocoLavaCake";
        price = FoodPanda.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "Waffle";
        price = FoodPanda.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = FoodPanda.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}