class ZeptoExecuter{
    public static void main(String[] args ){
        String itemName = "Milk";
        int quantity = 2;
        double priceWithQuantity  = Zepto.search(itemName, quantity);
        System.out.println("the price of "+ itemName + " for " + quantity  +" is "+priceWithQuantity);

        itemName = "Rice";
        quantity = 3;
        priceWithQuantity  = Zepto.search(itemName, quantity);
        System.out.println("the price of "+ itemName + " for " + quantity  +" is "+priceWithQuantity);

        itemName = "Chocolate";
        quantity = 5;
        priceWithQuantity  = Zepto.search(itemName, quantity);
        System.out.println("the price of "+ itemName + " for " + quantity  +" is "+priceWithQuantity);

        itemName = "Soap";
        quantity = 4;
        priceWithQuantity  = Zepto.search(itemName, quantity);
        System.out.println("the price of "+ itemName + " for " + quantity  +" is "+priceWithQuantity);

        itemName = "ABC";
        quantity = 2;
        priceWithQuantity  = Zepto.search(itemName, quantity);
        System.out.println("the price of "+ itemName + " for " + quantity  +" is "+priceWithQuantity);
    }
}