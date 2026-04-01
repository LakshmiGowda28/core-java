class CartExecutor{

 public static void main(String[] args){

  Cart c1=new Cart();
  Order o1=new Order();

  c1.cartId=1;
  c1.customerName="Lakshmi";
  c1.totalItems=2;
  c1.totalPrice=1500;
  c1.order=o1;
  o1.orderId=101;
  o1.productName="Shoes";
  o1.quantity=1;
  o1.price=1500;
  o1.isDelivered=true;
  c1.getCartDetails();

  Cart c2=new Cart();
  Order o2=new Order();

  c2.cartId=2;
  c2.customerName="Ravi";
  c2.totalItems=3;
  c2.totalPrice=2000;
  c2.order=o2;
  o2.orderId=102;
  o2.productName="Watch";
  o2.quantity=1;
  o2.price=2000;
  o2.isDelivered=false;

  c2.getCartDetails();

  Cart c3=new Cart();
  Order o3=new Order();

  c3.cartId=3;
  c3.customerName="Sneha";
  c3.totalItems=1;
  c3.totalPrice=800;
  c3.order=o3;
  o3.orderId=103;
  o3.productName="Bag";
  o3.quantity=1;
  o3.price=800;
  o3.isDelivered=true;
  c3.getCartDetails();

  Cart c4=new Cart();
  Order o4=new Order();

  c4.cartId=4;
  c4.customerName="Kiran";
  c4.totalItems=4;
  c4.totalPrice=3500;
  c4.order=o4;
  o4.orderId=104;
  o4.productName="Headphones";
  o4.quantity=1;
  o4.price=3500;
  o4.isDelivered=true;
  c4.getCartDetails();

  Cart c5=new Cart();
  Order o5=new Order();

  c5.cartId=5;
  c5.customerName="Divya";
  c5.totalItems=2;
  c5.totalPrice=1200;
  c5.order=o5;
  o5.orderId=105;
  o5.productName="Dress";
  o5.quantity=1;
  o5.price=1200;
  o5.isDelivered=false;
  c5.getCartDetails();

  Cart c6=new Cart();
  Order o6=new Order();

  c6.cartId=6;
  c6.customerName="Arjun";
  c6.totalItems=5;
  c6.totalPrice=5000;
  c6.order=o6;
  o6.orderId=106;
  o6.productName="Laptop Bag";
  o6.quantity=1;
  o6.price=5000;
  o6.isDelivered=true;
  c6.getCartDetails();

  Cart c7=new Cart();
  Order o7=new Order();

  c7.cartId=7;
  c7.customerName="Megha";
  c7.totalItems=2;
  c7.totalPrice=900;
  c7.order=o7;
  o7.orderId=107;
  o7.productName="Sandals";
  o7.quantity=1;
  o7.price=900;
  o7.isDelivered=true;

  c7.getCartDetails();

  Cart c8=new Cart();
  Order o8=new Order();

  c8.cartId=8;
  c8.customerName="Rahul";
  c8.totalItems=3;
  c8.totalPrice=2500;
  c8.order=o8;
  o8.orderId=108;
  o8.productName="Keyboard";
  o8.quantity=1;
  o8.price=2500;
  o8.isDelivered=false;
  c8.getCartDetails();

  Cart c9=new Cart();
  Order o9=new Order();

  c9.cartId=9;
  c9.customerName="Ananya";
  c9.totalItems=1;
  c9.totalPrice=600;
  c9.order=o9;
  o9.orderId=109;
  o9.productName="Book";
  o9.quantity=1;
  o9.price=600;
  o9.isDelivered=true;
  c9.getCartDetails();

  Cart c10=new Cart();
  Order o10=new Order();

  c10.cartId=10;
  c10.customerName="Vikram";
  c10.totalItems=2;
  c10.totalPrice=1800;
  c10.order=o10;
  o10.orderId=110;
  o10.productName="Shirt";
  o10.quantity=1;
  o10.price=1800;
  o10.isDelivered=true;

  c10.getCartDetails();

  Cart c11=new Cart();
  Order o11=new Order();

  c11.cartId=11;
  c11.customerName="Swathi";
  c11.totalItems=4;
  c11.totalPrice=4200;
  c11.order=o11;
  o11.orderId=111;
  o11.productName="Mixer";
  o11.quantity=1;
  o11.price=4200;
  o11.isDelivered=false;
  c11.getCartDetails();

  Cart c12=new Cart();
  Order o12=new Order();

  c12.cartId=12;
  c12.customerName="Harish";
  c12.totalItems=2;
  c12.totalPrice=1600;
  c12.order=o12;
  o12.orderId=112;
  o12.productName="Tshirt";
  o12.quantity=1;
  o12.price=1600;
  o12.isDelivered=true;
  c12.getCartDetails();

  Cart c13=new Cart();
  Order o13=new Order();

  c13.cartId=13;
  c13.customerName="Deepak";
  c13.totalItems=3;
  c13.totalPrice=2100;
  c13.order=o13;
  o13.orderId=113;
  o13.productName="Jeans";
  o13.quantity=1;
  o13.price=2100;
  o13.isDelivered=true;
  c13.getCartDetails();

  Cart c14=new Cart();
  Order o14=new Order();

  c14.cartId=14;
  c14.customerName="Kavya";
  c14.totalItems=2;
  c14.totalPrice=1400;
  c14.order=o14;
  o14.orderId=114;
  o14.productName="Handbag";
  o14.quantity=1;
  o14.price=1400;
  o14.isDelivered=false;

  c14.getCartDetails();

  Cart c15=new Cart();
  Order o15=new Order();

  c15.cartId=15;
  c15.customerName="Ajay";
  c15.totalItems=1;
  c15.totalPrice=700;
  c15.order=o15;
  o15.orderId=115;
  o15.productName="Bottle";
  o15.quantity=1;
  o15.price=700;
  o15.isDelivered=true;
  c15.getCartDetails();

  Cart c16=new Cart();
  Order o16=new Order();

  c16.cartId=16;
  c16.customerName="Neha";
  c16.totalItems=2;
  c16.totalPrice=2400;
  c16.order=o16;
  o16.orderId=116;
  o16.productName="Watch";
  o16.quantity=1;
  o16.price=2400;
  o16.isDelivered=true;
  c16.getCartDetails();

  Cart c17=new Cart();
  Order o17=new Order();

  c17.cartId=17;
  c17.customerName="Manoj";
  c17.totalItems=5;
  c17.totalPrice=5200;
  c17.order=o17;
  o17.orderId=117;
  o17.productName="Speaker";
  o17.quantity=1;
  o17.price=5200;
  o17.isDelivered=false;
  c17.getCartDetails();

  Cart c18=new Cart();
  Order o18=new Order();

  c18.cartId=18;
  c18.customerName="Priya";
  c18.totalItems=2;
  c18.totalPrice=1300;
  c18.order=o18;
  o18.orderId=118;
  o18.productName="Slippers";
  o18.quantity=1;
  o18.price=1300;
  o18.isDelivered=true;
  c18.getCartDetails();

  Cart c19=new Cart();
  Order o19=new Order();

  c19.cartId=19;
  c19.customerName="Rohit";
  c19.totalItems=3;
  c19.totalPrice=2700;
  c19.order=o19;
  o19.orderId=119;
  o19.productName="Keyboard";
  o19.quantity=1;
  o19.price=2700;
  o19.isDelivered=true;
  c19.getCartDetails();

  Cart c20=new Cart();
  Order o20=new Order();

  c20.cartId=20;
  c20.customerName="Asha";
  c20.totalItems=1;
  c20.totalPrice=900;
  c20.order=o20;
  o20.orderId=120;
  o20.productName="Notebook";
  o20.quantity=1;
  o20.price=900;
  o20.isDelivered=true;
  c20.getCartDetails();

 }
}