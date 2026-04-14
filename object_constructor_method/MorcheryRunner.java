class MorcheryRunner{
	public static void main(String args[]){
	Morchery morchery = new Morchery();
	DeadBody deadBody = new DeadBody();

	deadBody.id = 1403;
	deadBody.type = "Postmortem";

	morchery.createMorchery(deadBody);  
	
	morchery.morcheryId = 3;
	morchery.name = "DistrictMorchery";

	morchery.getMorcheryInfo();
	}
}