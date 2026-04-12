class IndianTestTeamRunner {

    public static void main(String[] args) {

        IndianTestTeam team = new IndianTestTeam();

        boolean added = team.addPlayer("Rohit Sharma");
        System.out.println(added);

        added = team.addPlayer("Virat Kohli");
        System.out.println(added);

        added = team.addPlayer("KL Rahul");
        System.out.println(added);

        added = team.addPlayer("Jadeja");
        System.out.println(added);
		
		added = team.addPlayer("M S Dhoni");
        System.out.println(added);

        added = team.addPlayer("Hardik pandya");
        System.out.println(added);

        added = team.addPlayer("Shivam Dube");
        System.out.println(added);
		
		added = team.addPlayer("Rishab Pant");
        System.out.println(added);

        added = team.addPlayer("Shubman Gill");
        System.out.println(added);

        added = team.addPlayer("SuryaKumar Yadav");
        System.out.println(added);
		
		added = team.addPlayer("Raina");
        System.out.println(added);

        team.getPlayers();
    }
}