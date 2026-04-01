class Sim{

 int simId;
 String provider;
 String networkType;
 long phoneNumber;
 boolean isActive;

 public void getSimDetails(){

  System.out.println("Sim Details");
  System.out.println("Sim Id : " + simId);
  System.out.println("Provider : " + provider);
  System.out.println("Network Type : " + networkType);
  System.out.println("Phone Number : " + phoneNumber);
  System.out.println("Active : " + isActive);
  System.out.println("--------------------");
 }
}