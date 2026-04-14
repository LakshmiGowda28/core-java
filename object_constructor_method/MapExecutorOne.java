class MapExecutorOne{
    public static void main(String[] args){
        Location location = new Location();

        location.id = 302;
        location.place = "Mumbai";

        Map map = new Map(location);

        map.mapId = 2;
        map.name = "WorldMap";

        map.getMapInfo();
    }
}