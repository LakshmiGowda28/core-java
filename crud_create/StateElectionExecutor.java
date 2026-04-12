class StateElectionExecutor{

  public static void main(String[] args){

    StateElection ref = new StateElection();

    boolean added = ref.addParty("BJP");
    System.out.println(added);

    added = ref.addParty("Congress");
    System.out.println(added);

    added = ref.addParty("JDS");
    System.out.println(added);

    added = ref.addParty("AAP");
    System.out.println(added);

    added = ref.addParty("BSP");
    System.out.println(added);

    added = ref.addParty("CPI");
    System.out.println(added);

    added = ref.addParty("CPI");
    System.out.println(added);

    ref.getParties();
  }
}