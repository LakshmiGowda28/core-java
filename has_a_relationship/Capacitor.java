class Capacitor{

 int capacitorId;
 String brand;
 double voltage;
 String type;
 boolean isWorking;

 public void getCapacitorDetails(){
  System.out.println("Capacitor Details");
  System.out.println("Capacitor Id : " + capacitorId);
  System.out.println("Brand : " + brand);
  System.out.println("Voltage : " + voltage);
  System.out.println("Type : " + type);
  System.out.println("Working : " + isWorking);
  System.out.println("---------------------");
 }
}