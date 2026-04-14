class MapExecuter{
	public static void main(String args[]){
	Map map = new Map();
	Location location = new Location();

	map.location = location;  

	map.mapId = 1;
	map.name = "IndiaMap";

	location.id = 301;
	location.place = "Delhi";

	map.getMapInfo();
	}
}