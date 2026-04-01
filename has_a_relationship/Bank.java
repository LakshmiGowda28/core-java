class Bank{

 int bankId;
 String bankName;
 String branch;
 double balance;
 AccountHolder accountHolder;

 public void getBankDetails(){

  System.out.println("Bank Details");
  System.out.println("Bank Id : " + bankId);
  System.out.println("Bank Name : " + bankName);
  System.out.println("Branch : " + branch);
  System.out.println("Balance : " + balance);

  accountHolder.getAccountHolderDetails();
 }
}