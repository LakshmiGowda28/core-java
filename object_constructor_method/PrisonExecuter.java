class PrisonExecuter{
	public static void main(String args[]){
	Prison prison = new Prison();
	Criminal criminal = new Criminal();

	prison.criminal = criminal;  

	prison.prisonId = 1;
	prison.name = "CentralJail";

	criminal.id = 1101;
	criminal.name = "Raju";

	prison.getPrisonInfo();
	}
}