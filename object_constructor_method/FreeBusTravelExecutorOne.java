class FreeBusTravelExecutorOne{
    public static void main(String[] args){
        Adhaar adhaar = new Adhaar();

        adhaar.id = 1302;
        adhaar.holderName = "Gowda";

        FreeBusTravel freeBusTravel = new FreeBusTravel(adhaar);

        freeBusTravel.travelId = 2;
        freeBusTravel.schemeName = "GovernmentScheme";

        freeBusTravel.getFreeBusTravelInfo();
    }
}