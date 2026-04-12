class PoliceStationExecutor{

  public static void main(String[] args){

    PoliceStation ref = new PoliceStation();

    boolean added = ref.addCase("Theft");
    System.out.println(added);

    added = ref.addCase("Robbery");
    System.out.println(added);

    added = ref.addCase("Fraud");
    System.out.println(added);

    added = ref.addCase("Cyber Crime");
    System.out.println(added);

    added = ref.addCase("Kidnapping");
    System.out.println(added);

    added = ref.addCase("Murder");
    System.out.println(added);

    added = ref.addCase("Assault");
    System.out.println(added);

    added = ref.addCase("Domestic Violence");
    System.out.println(added);

    added = ref.addCase("Drug Trafficking");
    System.out.println(added);

    added = ref.addCase("Smuggling");
    System.out.println(added);

    added = ref.addCase("Illegal Gambling");
    System.out.println(added);

    added = ref.addCase("Identity Theft");
    System.out.println(added);

    added = ref.addCase("Harassment");
    System.out.println(added);

    added = ref.addCase("Trespassing");
    System.out.println(added);

    added = ref.addCase("Hit and Run");
    System.out.println(added);

    added = ref.addCase("Vandalism");
    System.out.println(added);

    ref.getCases();
  }
}