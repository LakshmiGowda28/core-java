class PoliticianRunner{
	public static void main(String args[]){
	Politician politician = new Politician();
	Voter voter = new Voter();

	voter.id = 903;
	voter.name = "Ganesh";

	politician.createPolitician(voter);  
	
	politician.politicianId = 3;
	politician.name = "Lokesh";

	politician.getPoliticianInfo();
	}
}