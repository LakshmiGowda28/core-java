class Fan{

 int fanId;
 String brand;
 double price;
 int speedLevel;
 Capacitor capacitor;

 public void getFanDetails(){
  System.out.println("Fan Details");
  System.out.println("Fan Id : " + fanId);
  System.out.println("Brand : " + brand);
  System.out.println("Price : " + price);
  System.out.println("Speed Level : " + speedLevel);

  capacitor.getCapacitorDetails();
 }
}