class PoliticianExecutorOne{
    public static void main(String[] args){
        Voter voter = new Voter();

        voter.id = 902;
        voter.name = "Mahesh";

        Politician politician = new Politician(voter);

        politician.politicianId = 2;
        politician.name = "Rajesh";

        politician.getPoliticianInfo();
    }
}