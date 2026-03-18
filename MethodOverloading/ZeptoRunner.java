class ZeptoRunner{
    public static void main(String[] args ){
        String itemName="Milk";
        double price = Zepto.search(itemName);
        System.out.println("the price of "+ itemName + " is "+price);

        itemName = "Apple";
        price = Zepto.search(itemName);
        System.out.println("the price of "+ itemName + " is "+price);

        itemName = "Shampoo";
        price = Zepto.search(itemName);
        System.out.println("the price of "+ itemName + " is "+price);

        itemName = "Maggi";
        price = Zepto.search(itemName);
        System.out.println("the price of "+ itemName + " is "+price);

        itemName = "XYZ";
        price = Zepto.search(itemName);
        System.out.println("the price of "+ itemName + " is "+price);
    }
}