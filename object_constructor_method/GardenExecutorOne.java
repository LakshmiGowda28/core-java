class GardenExecutorOne{
    public static void main(String[] args){
        Flower flower = new Flower();

        flower.id = 402;
        flower.type = "Lily";

        Garden garden = new Garden(flower);

        garden.gardenId = 2;
        garden.name = "CubbonPark";

        garden.getGardenInfo();
    }
}