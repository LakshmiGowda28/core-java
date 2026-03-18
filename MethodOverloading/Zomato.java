class Zomato{
    public static double search(String itemName){
        double price = 0.0;
        if(itemName=="Biryani"){
            price = 180.0;
            return price;
        }
        else if(itemName=="FriedRice"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Noodles"){
            price = 130.0;
            return price;
        }
        else if(itemName=="PaneerButterMasala"){
            price = 200.0;
            return price;
        }
        else if(itemName=="DalTadka"){
            price = 140.0;
            return price;
        }
        else if(itemName=="VegMeals"){
            price = 150.0;
            return price;
        }
        else if(itemName=="ChickenMeals"){
            price = 220.0;
            return price;
        }
        else if(itemName=="Roti"){
            price = 20.0;
            return price;
        }
        else if(itemName=="Naan"){
            price = 30.0;
            return price;
        }
        else if(itemName=="Paratha"){
            price = 40.0;
            return price;
        }
        else if(itemName=="Pulao"){
            price = 110.0;
            return price;
        }
        else if(itemName=="CurdRice"){
            price = 90.0;
            return price;
        }
        else if(itemName=="SambarRice"){
            price = 100.0;
            return price;
        }
        else if(itemName=="LemonRice"){
            price = 90.0;
            return price;
        }
        else if(itemName=="TomatoRice"){
            price = 95.0;
            return price;
        }
        else if(itemName=="JeeraRice"){
            price = 120.0;
            return price;
        }
        else if(itemName=="ButterChicken"){
            price = 250.0;
            return price;
        }
        else if(itemName=="ChickenCurry"){
            price = 220.0;
            return price;
        }
        else if(itemName=="MuttonCurry"){
            price = 300.0;
            return price;
        }
        else if(itemName=="FishFry"){
            price = 200.0;
            return price;
        }
        else if(itemName=="VegCurry"){
            price = 150.0;
            return price;
        }
        else if(itemName=="KadaiPaneer"){
            price = 210.0;
            return price;
        }
        else if(itemName=="PalakPaneer"){
            price = 190.0;
            return price;
        }
        else if(itemName=="AlooGobi"){
            price = 140.0;
            return price;
        }
        else if(itemName=="Chole"){
            price = 160.0;
            return price;
        }
        else if(itemName=="Rajma"){
            price = 150.0;
            return price;
        }
        else if(itemName=="VegFry"){
            price = 120.0;
            return price;
        }
        else if(itemName=="ChickenFry"){
            price = 220.0;
            return price;
        }
        else if(itemName=="EggCurry"){
            price = 160.0;
            return price;
        }
        else if(itemName=="Omelette"){
            price = 60.0;
            return price;
        }
        else if(itemName=="MasalaDosa"){
            price = 80.0;
            return price;
        }
        else if(itemName=="PlainDosa"){
            price = 50.0;
            return price;
        }
        else if(itemName=="Idli"){
            price = 40.0;
            return price;
        }
        else if(itemName=="Vada"){
            price = 30.0;
            return price;
        }
        else if(itemName=="Upma"){
            price = 50.0;
            return price;
        }
        else if(itemName=="Pongal"){
            price = 70.0;
            return price;
        }
        else if(itemName=="KesariBath"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Poori"){
            price = 80.0;
            return price;
        }
        else if(itemName=="Chapati"){
            price = 20.0;
            return price;
        }
        else if(itemName=="VegRoll"){
            price = 90.0;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }


    public static double search(String itemName , int quantity){

        double price = 0.0;

        if(itemName=="Biryani"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="FriedRice"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="Noodles"){
            price = 130.0 * quantity;
            return price;
        }
        else if(itemName=="PaneerButterMasala"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName=="DalTadka"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="VegMeals"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenMeals"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="Roti"){
            price = 20.0 * quantity;
            return price;
        }
        else if(itemName=="Naan"){
            price = 30.0 * quantity;
            return price;
        }
        else if(itemName=="Paratha"){
            price = 40.0 * quantity;
            return price;
        }
        else if(itemName=="Pulao"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName=="CurdRice"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="SambarRice"){
            price = 100.0 * quantity;
            return price;
        }
        else if(itemName=="LemonRice"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="TomatoRice"){
            price = 95.0 * quantity;
            return price;
        }
        else if(itemName=="JeeraRice"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="ButterChicken"){
            price = 250.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenCurry"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="MuttonCurry"){
            price = 300.0 * quantity;
            return price;
        }
        else if(itemName=="FishFry"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName=="VegCurry"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="KadaiPaneer"){
            price = 210.0 * quantity;
            return price;
        }
        else if(itemName=="PalakPaneer"){
            price = 190.0 * quantity;
            return price;
        }
        else if(itemName=="AlooGobi"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="Chole"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName=="Rajma"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="VegFry"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenFry"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="EggCurry"){
            price = 160.0 * quantity;
            return price;
        }
        else if(itemName=="Omelette"){
            price = 60.0 * quantity;
            return price;
        }
        else if(itemName=="MasalaDosa"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName=="PlainDosa"){
            price = 50.0 * quantity;
            return price;
        }
        else if(itemName=="Idli"){
            price = 40.0 * quantity;
            return price;
        }
        else if(itemName=="Vada"){
            price = 30.0 * quantity;
            return price;
        }
        else if(itemName=="Upma"){
            price = 50.0 * quantity;
            return price;
        }
        else if(itemName=="Pongal"){
            price = 70.0 * quantity;
            return price;
        }
        else if(itemName=="KesariBath"){
            price = 60.0 * quantity;
            return price;
        }
        else if(itemName=="Poori"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName=="Chapati"){
            price = 20.0 * quantity;
            return price;
        }
        else if(itemName=="VegRoll"){
            price = 90.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}