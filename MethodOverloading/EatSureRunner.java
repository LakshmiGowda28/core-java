class EatSureRunner{
    public static void main(String[] args ){
        String itemName = "QuinoaSalad";
        double price = EatSure.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "AvocadoToast";
        price = EatSure.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "ProteinShake";
        price = EatSure.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "RagiDosa";
        price = EatSure.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);

        itemName = "XYZ";
        price = EatSure.search(itemName);
        System.out.println("the price of " + itemName + " is " + price);
    }
}