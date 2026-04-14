class PrisonRunner{
	public static void main(String args[]){
	Prison prison = new Prison();
	Criminal criminal = new Criminal();

	criminal.id = 1103;
	criminal.name = "Arun";

	prison.createPrison(criminal);  
	
	prison.prisonId = 3;
	prison.name = "DistrictJail";

	prison.getPrisonInfo();
	}
}