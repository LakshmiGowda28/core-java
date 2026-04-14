class Map{
    int mapId;
    String name;

    Location location;

    Map(){}

    Map(Location location){
        this.location = location;
        System.out.println("Map constructor called");
    }

    public void createMap(Location location){
        this.location = location;
        System.out.println("createMap method called");
    }

    public void getMapInfo(){
        System.out.println("getMapInfo started");
        System.out.println("Map id is " + mapId);
        System.out.println("Map name is " + name);
        System.out.println("getMapInfo executed");
    }
}