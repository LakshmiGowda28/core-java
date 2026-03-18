class GrabRunner{
    public static void main(String[] args ){
        String itemName = "SushiRoll";
        double price = Grab.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "PadSeeEw";
        price = Grab.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "KimchiFriedRice";
        price = Grab.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "BubbleTea";
        price = Grab.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = Grab.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}