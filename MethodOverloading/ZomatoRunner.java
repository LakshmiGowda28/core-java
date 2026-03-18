class ZomatoRunner{
    public static void main(String[] args ){
        String itemName = "Biryani";
        double price = Zomato.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "FriedRice";
        price = Zomato.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "PaneerButterMasala";
        price = Zomato.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "MasalaDosa";
        price = Zomato.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = Zomato.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}