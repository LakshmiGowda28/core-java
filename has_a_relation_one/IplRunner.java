class IplRunner{
    public static void main(String[] args){

    Ipl ipl = new Ipl();
    ipl.sponsor = "TATA";
    ipl.totalTeams = 10;

    Rcb rcb = new Rcb();
    ipl.rcb = rcb;

    rcb.captain = "Rajath Patidar";
    rcb.homeGround = "Chinnaswamy";

    ipl.getIplDetails();
    }
}