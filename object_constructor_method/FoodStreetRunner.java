class FoodStreetRunner{
	public static void main(String args[]){
	FoodStreet foodStreet = new FoodStreet();
	Stall stall = new Stall();

	stall.id = 603;
	stall.type = "Dosa";

	foodStreet.createFoodStreet(stall);  
	
	foodStreet.foodStreetId = 3;
	foodStreet.name = "BTM";

	foodStreet.getFoodStreetInfo();
	}
}