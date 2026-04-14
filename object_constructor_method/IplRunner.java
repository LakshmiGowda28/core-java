class IplRunner{
	public static void main(String args[]){
	Ipl ipl = new Ipl();
	Rcb rcb = new Rcb();

	rcb.id = 1503;
	rcb.captain = "Rajat";

	ipl.createIpl(rcb);  
	
	ipl.iplId = 3;
	ipl.season = "2026";

	ipl.getIplInfo();
	}
}