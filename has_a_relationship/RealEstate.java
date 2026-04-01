class RealEstate{

 int realEstateId;
 String companyName;
 String location;
 int totalProjects;
 Property property;

 public void getRealEstateDetails(){

  System.out.println("RealEstate Details");
  System.out.println("RealEstate Id : " + realEstateId);
  System.out.println("Company Name : " + companyName);
  System.out.println("Location : " + location);
  System.out.println("Total Projects : " + totalProjects);

  property.getPropertyDetails();
 }
}