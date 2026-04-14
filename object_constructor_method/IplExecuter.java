class IplExecuter{
	public static void main(String args[]){
	Ipl ipl = new Ipl();
	Rcb rcb = new Rcb();

	ipl.rcb = rcb;  

	ipl.iplId = 1;
	ipl.season = "2024";

	rcb.id = 1501;
	rcb.captain = "Faf";

	ipl.getIplInfo();
	}
}