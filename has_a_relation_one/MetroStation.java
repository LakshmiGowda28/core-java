class MetroStation{
    String stationName;
    String city;
    Platform platform;

    public void getMetroDetails(){
        System.out.println("Station name is " + stationName);
        System.out.println("City is " + city);
        platform.getPlatformDetails();
    }
}