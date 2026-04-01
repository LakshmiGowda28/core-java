class Cart{

 int cartId;
 String customerName;
 int totalItems;
 double totalPrice;
 Order order;

 public void getCartDetails(){

  System.out.println("Cart Details");
  System.out.println("Cart Id : " + cartId);
  System.out.println("Customer Name : " + customerName);
  System.out.println("Total Items : " + totalItems);
  System.out.println("Total Price : " + totalPrice);

  order.getOrderDetails();
 }
}