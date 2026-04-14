class Ipl{
    int iplId;
    String season;

    Rcb rcb;

    Ipl(){}

    Ipl(Rcb rcb){
        this.rcb = rcb;
        System.out.println("Ipl constructor called");
    }

    public void createIpl(Rcb rcb){
        this.rcb = rcb;
        System.out.println("createIpl method called");
    }

    public void getIplInfo(){
        System.out.println("getIplInfo started");
        System.out.println("Ipl id is " + iplId);
        System.out.println("Ipl season is " + season);
        System.out.println("getIplInfo executed");
    }
}