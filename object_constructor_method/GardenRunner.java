class GardenRunner{
	public static void main(String args[]){
	Garden garden = new Garden();
	Flower flower = new Flower();

	flower.id = 403;
	flower.type = "Lotus";

	garden.createGarden(flower);  
	
	garden.gardenId = 3;
	garden.name = "BotanicalGarden";

	garden.getGardenInfo();
	}
}