class History{

 int historyId;
 String transactionType;
 double amount;
 String date;
 boolean isSuccessful;

 public void getHistoryDetails(){

  System.out.println("History Details");
  System.out.println("History Id : " + historyId);
  System.out.println("Transaction Type : " + transactionType);
  System.out.println("Amount : " + amount);
  System.out.println("Date : " + date);
  System.out.println("Successful : " + isSuccessful);
  System.out.println("---------------------");

 }
}