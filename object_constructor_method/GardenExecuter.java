class GardenExecuter{
	public static void main(String args[]){
	Garden garden = new Garden();
	Flower flower = new Flower();

	garden.flower = flower;  

	garden.gardenId = 1;
	garden.name = "Lalbagh";

	flower.id = 401;
	flower.type = "Rose";

	garden.getGardenInfo();
	}
}