class DoorDashExecuter{

    public static void main(String[] args ){

        String itemName = "Sushi";
        int quantity = 2;
        double price = DoorDash.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "Ramen";
        quantity = 3;
        price = DoorDash.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "Steak";
        quantity = 2;
        price = DoorDash.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "Falafel";
        quantity = 4;
        price = DoorDash.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);

        itemName = "ABC";
        quantity = 2;
        price = DoorDash.search(itemName, quantity);
        System.out.println("the price of " + itemName + " for " + quantity + " is " + price);
    }
}