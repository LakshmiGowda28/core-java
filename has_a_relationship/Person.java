class Person{

 int personId;
 String name;
 int age;
 String address;
 GovernmentIdentificationCard idCard;

 public void getPersonDetails(){

  System.out.println("Person Details");
  System.out.println("Person Id : " + personId);
  System.out.println("Name : " + name);
  System.out.println("Age : " + age);
  System.out.println("Address : " + address);

  idCard.getIdCardDetails();
 }
}