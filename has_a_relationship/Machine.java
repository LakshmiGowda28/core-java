class Machine{

 int machineId;
 String machineName;
 String machineType;
 double power;
 boolean isWorking;

 public void getMachineDetails(){

  System.out.println("Machine Details");
  System.out.println("Machine Id : " + machineId);
  System.out.println("Machine Name : " + machineName);
  System.out.println("Machine Type : " + machineType);
  System.out.println("Power : " + power);
  System.out.println("Working : " + isWorking);
  System.out.println("-----------------------");

 }
}