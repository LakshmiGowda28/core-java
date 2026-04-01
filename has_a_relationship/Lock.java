class Lock{

 int lockId;
 String brand;
 String lockType;
 int securityLevel;
 boolean isDigital;

 public void getLockDetails(){

  System.out.println("Lock Details");
  System.out.println("Lock Id : " + lockId);
  System.out.println("Brand : " + brand);
  System.out.println("Type : " + lockType);
  System.out.println("Security Level : " + securityLevel);
  System.out.println("Digital : " + isDigital);
  System.out.println("--------------------------");

 }
}