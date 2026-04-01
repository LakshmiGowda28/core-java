class Remote{

 int remoteId;
 String brand;
 String type;
 int batteryLevel;
 boolean isWorking;
 
 public void getRemoteDetails(){
	 System.out.println("Remote Details are");
	 System.out.println("Remote Id :" + remoteId);
	 System.out.println("Brand :" + brand);
	 System.out.println("Type :" + type);
	 System.out.println("Battery Level :" + batteryLevel);
	 System.out.println("Working :" + isWorking);
	 System.out.println("End of Remote Details");
	 System.out.println("-------------------");
 }
}