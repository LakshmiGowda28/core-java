class FoodStreet{
    int foodStreetId;
    String name;

    Stall stall;

    FoodStreet(){}

    FoodStreet(Stall stall){
        this.stall = stall;
        System.out.println("FoodStreet constructor called");
    }

    public void createFoodStreet(Stall stall){
        this.stall = stall;
        System.out.println("createFoodStreet method called");
    }

    public void getFoodStreetInfo(){
        System.out.println("getFoodStreetInfo started");
        System.out.println("FoodStreet id is " + foodStreetId);
        System.out.println("FoodStreet name is " + name);
        System.out.println("getFoodStreetInfo executed");
    }
}