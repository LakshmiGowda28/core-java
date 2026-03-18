class EatSure{
    public static double search(String itemName){
        double price = 0.0;
        if(itemName=="QuinoaSalad"){
            price = 220.0;
            return price;
        }
        else if(itemName=="GreekYogurtBowl"){
            price = 180.0;
            return price;
        }
        else if(itemName=="AvocadoToast"){
            price = 200.0;
            return price;
        }
        else if(itemName=="FruitBowl"){
            price = 150.0;
            return price;
        }
        else if(itemName=="OatsPorridge"){
            price = 140.0;
            return price;
        }
        else if(itemName=="ChiaPudding"){
            price = 170.0;
            return price;
        }
        else if(itemName=="SmoothieBowl"){
            price = 190.0;
            return price;
        }
        else if(itemName=="ProteinShake"){
            price = 210.0;
            return price;
        }
        else if(itemName=="GreenSmoothie"){
            price = 180.0;
            return price;
        }
        else if(itemName=="DetoxJuice"){
            price = 160.0;
            return price;
        }
        else if(itemName=="SproutsSalad"){
            price = 140.0;
            return price;
        }
        else if(itemName=="KetoSalad"){
            price = 230.0;
            return price;
        }
        else if(itemName=="GrilledChickenSalad"){
            price = 260.0;
            return price;
        }
        else if(itemName=="TofuSalad"){
            price = 200.0;
            return price;
        }
        else if(itemName=="PaneerSaladHealthy"){
            price = 210.0;
            return price;
        }
        else if(itemName=="BrownRiceMeal"){
            price = 190.0;
            return price;
        }
        else if(itemName=="MilletKhichdi"){
            price = 170.0;
            return price;
        }
        else if(itemName=="VegSteamedMomos"){
            price = 150.0;
            return price;
        }
        else if(itemName=="ChickenSteamedMomos"){
            price = 180.0;
            return price;
        }
        else if(itemName=="BoiledEggs"){
            price = 100.0;
            return price;
        }
        else if(itemName=="EggWhiteOmelette"){
            price = 130.0;
            return price;
        }
        else if(itemName=="GrilledFishHealthy"){
            price = 300.0;
            return price;
        }
        else if(itemName=="SteamedBroccoli"){
            price = 120.0;
            return price;
        }
        else if(itemName=="SauteedVeggies"){
            price = 140.0;
            return price;
        }
        else if(itemName=="LowCarbWrap"){
            price = 160.0;
            return price;
        }
        else if(itemName=="WholeWheatSandwich"){
            price = 150.0;
            return price;
        }
        else if(itemName=="PeanutButterToast"){
            price = 130.0;
            return price;
        }
        else if(itemName=="AlmondMilkShake"){
            price = 180.0;
            return price;
        }
        else if(itemName=="CoconutWaterFresh"){
            price = 90.0;
            return price;
        }
        else if(itemName=="HerbalTea"){
            price = 100.0;
            return price;
        }
        else if(itemName=="LemonHoneyWater"){
            price = 80.0;
            return price;
        }
        else if(itemName=="CarrotBeetJuice"){
            price = 140.0;
            return price;
        }
        else if(itemName=="SpinachSoup"){
            price = 150.0;
            return price;
        }
        else if(itemName=="TomatoSoupHealthy"){
            price = 140.0;
            return price;
        }
        else if(itemName=="ClearVegSoup"){
            price = 130.0;
            return price;
        }
        else if(itemName=="ChickenClearSoup"){
            price = 160.0;
            return price;
        }
        else if(itemName=="QuinoaUpma"){
            price = 170.0;
            return price;
        }
        else if(itemName=="RagiDosa"){
            price = 150.0;
            return price;
        }
        else if(itemName=="MultigrainRotiMeal"){
            price = 180.0;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }


    public static double search(String itemName , int quantity){

        double price = 0.0;

        if(itemName=="QuinoaSalad"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="GreekYogurtBowl"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="AvocadoToast"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName=="FruitBowl"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="OatsPorridge"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="ChiaPudding"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName=="SmoothieBowl"){
            price = 190.0 * quantity;
            return price;
        }
        else if(itemName=="ProteinShake"){
            price = 210.0 * quantity;
            return price;
        }
        else if(itemName=="GreenSmoothie"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="DetoxJuice"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName=="SproutsSalad"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="KetoSalad"){
            price = 230.0 * quantity;
            return price;
        }
        else if(itemName=="GrilledChickenSalad"){
            price = 260.0 * quantity;
            return price;
        }
        else if(itemName=="TofuSalad"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName=="PaneerSaladHealthy"){
            price = 210.0 * quantity;
            return price;
        }
        else if(itemName=="BrownRiceMeal"){
            price = 190.0 * quantity;
            return price;
        }
        else if(itemName=="MilletKhichdi"){
            price = 170.0 * quantity;
            return price;
        }
        else if(itemName=="VegSteamedMomos"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenSteamedMomos"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="BoiledEggs"){
            price = 100.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}