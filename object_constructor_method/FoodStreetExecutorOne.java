class FoodStreetExecutorOne{
    public static void main(String[] args){
        Stall stall = new Stall();

        stall.id = 602;
        stall.type = "Juice";

        FoodStreet foodStreet = new FoodStreet(stall);

        foodStreet.foodStreetId = 2;
        foodStreet.name = "Indiranagar";

        foodStreet.getFoodStreetInfo();
    }
}