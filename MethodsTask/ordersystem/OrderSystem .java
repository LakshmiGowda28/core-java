class OrderSystem {
    static void takeOrder() {
        System.out.println("Order placed by customer");
        InventoryCheck.validate();
    }
}