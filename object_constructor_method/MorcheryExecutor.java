class MorcheryExecutor{
    public static void main(String[] args){
        DeadBody deadBody = new DeadBody();

        deadBody.id = 1402;
        deadBody.type = "Identified";

        Morchery morchery = new Morchery(deadBody);

        morchery.morcheryId = 2;
        morchery.name = "GovtMorchery";

        morchery.getMorcheryInfo();
    }
}