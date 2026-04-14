class FoodStreetExecuter{
	public static void main(String args[]){
	FoodStreet foodStreet = new FoodStreet();
	Stall stall = new Stall();

	foodStreet.stall = stall;  

	foodStreet.foodStreetId = 1;
	foodStreet.name = "VVpuram";

	stall.id = 601;
	stall.type = "Chaat";

	foodStreet.getFoodStreetInfo();
	}
}