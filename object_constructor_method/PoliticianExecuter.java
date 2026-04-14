class PoliticianExecuter{
	public static void main(String args[]){
	Politician politician = new Politician();
	Voter voter = new Voter();

	politician.voter = voter;  

	politician.politicianId = 1;
	politician.name = "Ramesh";

	voter.id = 901;
	voter.name = "Suresh";

	politician.getPoliticianInfo();
	}
}