class MapRunner{
	public static void main(String args[]){
	Map map = new Map();
	Location location = new Location();

	location.id = 303;
	location.place = "Bangalore";

	map.createMap(location);  
	
	map.mapId = 3;
	map.name = "CityMap";

	map.getMapInfo();
	}
}