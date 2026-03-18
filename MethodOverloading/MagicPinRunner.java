class MagicPinRunner{
    public static void main(String[] args ){
        String itemName = "PavBhaji";
        double price = MagicPin.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "VadaPav";
        price = MagicPin.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "CholeBhature";
        price = MagicPin.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "MomosStreet";
        price = MagicPin.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = MagicPin.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}