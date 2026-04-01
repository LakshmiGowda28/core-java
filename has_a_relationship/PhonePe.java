class PhonePe{

 int phonePeId;
 String userName;
 double walletBalance;
 String accountType;
 History history;

 public void getPhonePeDetails(){

  System.out.println("PhonePe Details");
  System.out.println("PhonePe Id : " + phonePeId);
  System.out.println("User Name : " + userName);
  System.out.println("Wallet Balance : " + walletBalance);
  System.out.println("Account Type : " + accountType);

  history.getHistoryDetails();
 }
}