class AdityaBirlaGroup{

 int groupId;
 String chairmanName;
 String headquarters;
 int numberOfCompanies;
 RCB rcb;

 public void getGroupDetails(){

  System.out.println("Aditya Birla Group Details");
  System.out.println("Group Id : " + groupId);
  System.out.println("Chairman : " + chairmanName);
  System.out.println("Headquarters : " + headquarters);
  System.out.println("Number Of Companies : " + numberOfCompanies);

  rcb.getRcbDetails();
 }
}