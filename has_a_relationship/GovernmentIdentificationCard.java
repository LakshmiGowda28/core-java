class GovernmentIdentificationCard{

 int cardId;
 String idType;
 String idNumber;
 String nationality;
 boolean isValid;

 public void getIdCardDetails(){

  System.out.println("Government ID Details");
  System.out.println("Card Id : " + cardId);
  System.out.println("ID Type : " + idType);
  System.out.println("ID Number : " + idNumber);
  System.out.println("Nationality : " + nationality);
  System.out.println("Valid : " + isValid);
  System.out.println("------------------------");

 }
}