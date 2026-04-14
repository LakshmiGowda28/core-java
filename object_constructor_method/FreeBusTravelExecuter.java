class FreeBusTravelExecuter{
	public static void main(String args[]){
	FreeBusTravel freeBusTravel = new FreeBusTravel();
	Adhaar adhaar = new Adhaar();

	freeBusTravel.adhaar = adhaar;  

	freeBusTravel.travelId = 1;
	freeBusTravel.schemeName = "Shakti";

	adhaar.id = 1301;
	adhaar.holderName = "Lakshmi";

	freeBusTravel.getFreeBusTravelInfo();
	}
}