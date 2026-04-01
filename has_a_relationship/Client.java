class Client{

 int clientId;
 String clientName;
 String projectName;
 int projectDuration;
 boolean isInternational;

 public void getClientDetails(){

  System.out.println("Client Details");
  System.out.println("Client Id : " + clientId);
  System.out.println("Client Name : " + clientName);
  System.out.println("Project Name : " + projectName);
  System.out.println("Project Duration : " + projectDuration);
  System.out.println("International : " + isInternational);
  System.out.println("-------------------------");

 }
}