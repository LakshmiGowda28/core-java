class Order{

 int orderId;
 String productName;
 int quantity;
 double price;
 boolean isDelivered;

 public void getOrderDetails(){

  System.out.println("Order Details");
  System.out.println("Order Id : " + orderId);
  System.out.println("Product Name : " + productName);
  System.out.println("Quantity : " + quantity);
  System.out.println("Price : " + price);
  System.out.println("Delivered : " + isDelivered);
  System.out.println("-------------------------");

 }
}