class Property{

 int propertyId;
 String type;
 double price;
 int areaSqft;
 boolean isAvailable;

 public void getPropertyDetails(){

  System.out.println("Property Details");
  System.out.println("Property Id : " + propertyId);
  System.out.println("Type : " + type);
  System.out.println("Price : " + price);
  System.out.println("Area Sqft : " + areaSqft);
  System.out.println("Available : " + isAvailable);
  System.out.println("----------------------");

 }
}