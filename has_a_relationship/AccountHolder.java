class AccountHolder{

 int holderId;
 String name;
 int age;
 String accountType;
 boolean isActive;

 public void getAccountHolderDetails(){

  System.out.println("Account Holder Details");
  System.out.println("Holder Id : " + holderId);
  System.out.println("Name : " + name);
  System.out.println("Age : " + age);
  System.out.println("Account Type : " + accountType);
  System.out.println("Active : " + isActive);
  System.out.println("-----------------------");

 }
}