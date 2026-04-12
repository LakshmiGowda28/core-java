class StateElectionExecutor{

  public static void main(String[] args){

    StateElection s = new StateElection();

    boolean added = s.addParty("BJP");
    System.out.println(added);

    added = s.addParty("Congress");
    System.out.println(added);

    added = s.addParty("JDS");
    System.out.println(added);

    added = s.addParty("AAP");
    System.out.println(added);

    added = s.addParty("BSP");
    System.out.println(added);

    added = s.addParty("CPI");
    System.out.println(added);

    added = s.addParty("CPI");
    System.out.println(added);

    s.getParties();
	
String party = s.getPartyByName("BJP");
System.out.println("Party name is available");

s.updateParty("Congress", "INC");
System.out.println("Party name is updated");

s.deleteParty("AAP");
System.out.println("Party name is deleted");	

s.getParties();
  }
}