class Mobile{

 int mobileId;
 String brand;
 double price;
 String model;
 Sim sim;

 public void getMobileDetails(){

  System.out.println("Mobile Details");
  System.out.println("Mobile Id : " + mobileId);
  System.out.println("Brand : " + brand);
  System.out.println("Price : " + price);
  System.out.println("Model : " + model);

  sim.getSimDetails();
 }
}