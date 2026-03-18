class UberEats{
    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="ZingerBurger"){
            price = 180.0;
            return price;
        }
        else if(itemName=="DoubleCheeseBurger"){
            price = 220.0;
            return price;
        }
        else if(itemName=="ChickenPopcorn"){
            price = 150.0;
            return price;
        }
        else if(itemName=="PeriPeriFries"){
            price = 120.0;
            return price;
        }
        else if(itemName=="LoadedFries"){
            price = 160.0;
            return price;
        }
        else if(itemName=="ChickenNuggets"){
            price = 170.0;
            return price;
        }
        else if(itemName=="CheeseNuggets"){
            price = 150.0;
            return price;
        }
        else if(itemName=="ChickenWrap"){
            price = 140.0;
            return price;
        }
        else if(itemName=="PaneerWrap"){
            price = 130.0;
            return price;
        }
        else if(itemName=="VegWrap"){
            price = 110.0;
            return price;
        }
        else if(itemName=="HotDogRoll"){
            price = 160.0;
            return price;
        }
        else if(itemName=="ChickenHotDog"){
            price = 180.0;
            return price;
        }
        else if(itemName=="CheeseHotDog"){
            price = 170.0;
            return price;
        }
        else if(itemName=="MiniBurger"){
            price = 100.0;
            return price;
        }
        else if(itemName=="VegSlider"){
            price = 90.0;
            return price;
        }
        else if(itemName=="ChickenSlider"){
            price = 110.0;
            return price;
        }
        else if(itemName=="BBQChickenBurger"){
            price = 210.0;
            return price;
        }
        else if(itemName=="SpicyChickenBurger"){
            price = 200.0;
            return price;
        }
        else if(itemName=="CrispyChickenBurger"){
            price = 190.0;
            return price;
        }
        else if(itemName=="VeggieDelightBurger"){
            price = 120.0;
            return price;
        }
        else if(itemName=="CheeseBurstBurger"){
            price = 230.0;
            return price;
        }
        else if(itemName=="ChickenCheeseWrap"){
            price = 160.0;
            return price;
        }
        else if(itemName=="PaneerCheeseWrap"){
            price = 150.0;
            return price;
        }
        else if(itemName=="LoadedNachoFries"){
            price = 170.0;
            return price;
        }
        else if(itemName=="CrispyVegBurger"){
            price = 130.0;
            return price;
        }
        else if(itemName=="GrilledChickenWrap"){
            price = 180.0;
            return price;
        }
        else if(itemName=="SmokyBBQWrap"){
            price = 175.0;
            return price;
        }
        else if(itemName=="ChickenTenders"){
            price = 190.0;
            return price;
        }
        else if(itemName=="CheeseSticks"){
            price = 160.0;
            return price;
        }
        else if(itemName=="GarlicChickenBites"){
            price = 200.0;
            return price;
        }
        else if(itemName=="CrispyFishBurger"){
            price = 210.0;
            return price;
        }
        else if(itemName=="FishFingerMeal"){
            price = 220.0;
            return price;
        }
        else if(itemName=="VegHotDog"){
            price = 140.0;
            return price;
        }
        else if(itemName=="ChickenLoadedFries"){
            price = 200.0;
            return price;
        }
        else if(itemName=="SpicyPaneerBurger"){
            price = 150.0;
            return price;
        }
        else if(itemName=="CornCheeseBalls"){
            price = 130.0;
            return price;
        }
        else if(itemName=="VegCheeseBalls"){
            price = 120.0;
            return price;
        }
        else if(itemName=="ChickenCheeseBalls"){
            price = 180.0;
            return price;
        }
        else if(itemName=="LoadedChickenBurger"){
            price = 240.0;
            return price;
        }
        else if(itemName=="MegaVegBurger"){
            price = 200.0;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }


    public static double search(String itemName , int quantity){

        double price = 0.0;

        if(itemName=="ZingerBurger"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="DoubleCheeseBurger"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenPopcorn"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="PeriPeriFries"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="LoadedFries"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenNuggets"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName=="CheeseNuggets"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenWrap"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="PaneerWrap"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName=="VegWrap"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName=="HotDogRoll"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenHotDog"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="CheeseHotDog"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName=="MiniBurger"){
            price = 100.0 * quantity;
            return price;
        }
        else if(itemName=="VegSlider"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenSlider"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName=="BBQChickenBurger"){
            price = 210.0 * quantity;
            return price;
        }
        else if(itemName=="SpicyChickenBurger"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName=="CrispyChickenBurger"){
            price = 190.0 * quantity;
            return price;
        }
        else if(itemName=="VeggieDelightBurger"){
            price = 120.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}