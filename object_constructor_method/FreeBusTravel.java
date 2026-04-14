class FreeBusTravel{
    int travelId;
    String schemeName;

    Adhaar adhaar;

    FreeBusTravel(){}

    FreeBusTravel(Adhaar adhaar){
        this.adhaar = adhaar;
        System.out.println("FreeBusTravel constructor called");
    }

    public void createFreeBusTravel(Adhaar adhaar){
        this.adhaar = adhaar;
        System.out.println("createFreeBusTravel method called");
    }

    public void getFreeBusTravelInfo(){
        System.out.println("getFreeBusTravelInfo started");
        System.out.println("Travel id is " + travelId);
        System.out.println("Scheme name is " + schemeName);
        System.out.println("getFreeBusTravelInfo executed");
    }
}