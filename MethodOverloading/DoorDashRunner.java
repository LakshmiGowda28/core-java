class DoorDashRunner{
    public static void main(String[] args ){
        String itemName = "Sushi";
        double price = DoorDash.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "Tacos";
        price = DoorDash.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "Lasagna";
        price = DoorDash.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "PadThai";
        price = DoorDash.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = DoorDash.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}