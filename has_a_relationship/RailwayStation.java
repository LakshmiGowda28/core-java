class RailwayStation{

 int stationId;
 String stationName;
 String location;
 int numberOfTrains;
 Platform platform;

 public void getStationDetails(){

  System.out.println("Railway Station Details");
  System.out.println("Station Id : " + stationId);
  System.out.println("Station Name : " + stationName);
  System.out.println("Location : " + location);
  System.out.println("Number Of Trains : " + numberOfTrains);

  platform.getPlatformDetails();
 }
}