class MetroRunner{
    public static void main(String[] args){

        MetroStation metro = new MetroStation();
        metro.stationName = "Majestic";
        metro.city = "Bangalore";

        Platform p = new Platform();
        metro.platform = p;

        p.platformNo = 2;
        p.direction = "North";

        metro.getMetroDetails();
    }
}