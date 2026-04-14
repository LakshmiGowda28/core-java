class IplExecutorOne{
    public static void main(String[] args){
        Rcb rcb = new Rcb();

        rcb.id = 1502;
        rcb.captain = "Virat";

        Ipl ipl = new Ipl(rcb);

        ipl.iplId = 2;
        ipl.season = "2025";

        ipl.getIplInfo();
    }
}