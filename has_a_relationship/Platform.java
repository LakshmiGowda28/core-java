class Platform{

 int platformId;
 int platformNumber;
 int capacity;
 String type;
 boolean isActive;

 public void getPlatformDetails(){

  System.out.println("Platform Details");
  System.out.println("Platform Id : " + platformId);
  System.out.println("Platform Number : " + platformNumber);
  System.out.println("Capacity : " + capacity);
  System.out.println("Type : " + type);
  System.out.println("Active : " + isActive);
  System.out.println("----------------------");

 }
}