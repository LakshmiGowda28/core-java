class OlympicExecutor{

  public static void main(String[] args){

    Olympic ref = new Olympic();

    boolean added = ref.addSport("Athletics");
    System.out.println(added);

    added = ref.addSport("Swimming");
    System.out.println(added);

    added = ref.addSport("Gymnastics");
    System.out.println(added);

    added = ref.addSport("Boxing");
    System.out.println(added);

    added = ref.addSport("Wrestling");
    System.out.println(added);

    added = ref.addSport("Badminton");
    System.out.println(added);

    added = ref.addSport("Tennis");
    System.out.println(added);

    added = ref.addSport("Hockey");
    System.out.println(added);

    added = ref.addSport("Archery");
    System.out.println(added);

    added = ref.addSport("Weightlifting");
    System.out.println(added);

    added = ref.addSport("Cycling");
    System.out.println(added);

    ref.getSports();
  }
}