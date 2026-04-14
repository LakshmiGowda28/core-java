class FreeBusTravelRunner{
	public static void main(String args[]){
	FreeBusTravel freeBusTravel = new FreeBusTravel();
	Adhaar adhaar = new Adhaar();

	adhaar.id = 1303;
	adhaar.holderName = "User";

	freeBusTravel.createFreeBusTravel(adhaar);  
	
	freeBusTravel.travelId = 3;
	freeBusTravel.schemeName = "FreePass";

	freeBusTravel.getFreeBusTravelInfo();
	}
}