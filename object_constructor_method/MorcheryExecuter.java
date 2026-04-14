class MorcheryExecuter{
	public static void main(String args[]){
	Morchery morchery = new Morchery();
	DeadBody deadBody = new DeadBody();

	morchery.deadBody = deadBody;  

	morchery.morcheryId = 1;
	morchery.name = "CityMorchery";

	deadBody.id = 1401;
	deadBody.type = "Unknown";

	morchery.getMorcheryInfo();
	}
}