class FoodPanda{
    public static double search(String itemName){
        double price = 0.0;
        if(itemName=="ChocolateCake"){
            price = 250.0;
            return price;
        }
        else if(itemName=="VanillaCake"){
            price = 220.0;
            return price;
        }
        else if(itemName=="RedVelvetCake"){
            price = 300.0;
            return price;
        }
        else if(itemName=="BlackForestCake"){
            price = 280.0;
            return price;
        }
        else if(itemName=="ButterscotchCake"){
            price = 260.0;
            return price;
        }
        else if(itemName=="Cupcake"){
            price = 80.0;
            return price;
        }
        else if(itemName=="ChocolateBrownie"){
            price = 120.0;
            return price;
        }
        else if(itemName=="FudgeBrownie"){
            price = 140.0;
            return price;
        }
        else if(itemName=="IceCreamSundae"){
            price = 180.0;
            return price;
        }
        else if(itemName=="ChocolateIceCream"){
            price = 100.0;
            return price;
        }
        else if(itemName=="VanillaIceCream"){
            price = 90.0;
            return price;
        }
        else if(itemName=="StrawberryIceCream"){
            price = 110.0;
            return price;
        }
        else if(itemName=="MangoIceCream"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Kulfi"){
            price = 70.0;
            return price;
        }
        else if(itemName=="Falooda"){
            price = 150.0;
            return price;
        }
        else if(itemName=="GulabJamun"){
            price = 80.0;
            return price;
        }
        else if(itemName=="Rasgulla"){
            price = 75.0;
            return price;
        }
        else if(itemName=="Rasmalai"){
            price = 100.0;
            return price;
        }
        else if(itemName=="Jalebi"){
            price = 90.0;
            return price;
        }
        else if(itemName=="KajuKatli"){
            price = 300.0;
            return price;
        }
        else if(itemName=="Ladoo"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Barfi"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Peda"){
            price = 130.0;
            return price;
        }
        else if(itemName=="MilkCake"){
            price = 160.0;
            return price;
        }
        else if(itemName=="CarrotHalwa"){
            price = 140.0;
            return price;
        }
        else if(itemName=="MoongDalHalwa"){
            price = 180.0;
            return price;
        }
        else if(itemName=="GajarKaHalwa"){
            price = 150.0;
            return price;
        }
        else if(itemName=="ChocolateMousse"){
            price = 170.0;
            return price;
        }
        else if(itemName=="StrawberryMousse"){
            price = 160.0;
            return price;
        }
        else if(itemName=="BlueberryCheesecake"){
            price = 280.0;
            return price;
        }
        else if(itemName=="NewYorkCheesecake"){
            price = 300.0;
            return price;
        }
        else if(itemName=="Tiramisu"){
            price = 320.0;
            return price;
        }
        else if(itemName=="Macarons"){
            price = 200.0;
            return price;
        }
        else if(itemName=="Donut"){
            price = 90.0;
            return price;
        }
        else if(itemName=="ChocoLavaCake"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Waffle"){
            price = 180.0;
            return price;
        }
        else if(itemName=="Pancakes"){
            price = 170.0;
            return price;
        }
        else if(itemName=="HoneyToast"){
            price = 200.0;
            return price;
        }
        else if(itemName=="BananaSplit"){
            price = 190.0;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }


    public static double search(String itemName , int quantity){

        double price = 0.0;

        if(itemName=="ChocolateCake"){
            price = 250.0 * quantity;
            return price;
        }
        else if(itemName=="VanillaCake"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="RedVelvetCake"){
            price = 300.0 * quantity;
            return price;
        }
        else if(itemName=="BlackForestCake"){
            price = 280.0 * quantity;
            return price;
        }
        else if(itemName=="ButterscotchCake"){
            price = 260.0 * quantity;
            return price;
        }
        else if(itemName=="Cupcake"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName=="ChocolateBrownie"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="FudgeBrownie"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="IceCreamSundae"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="ChocolateIceCream"){
            price = 100.0 * quantity;
            return price;
        }
        else if(itemName=="VanillaIceCream"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="StrawberryIceCream"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName=="MangoIceCream"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="Kulfi"){
            price = 70.0 * quantity;
            return price;
        }
        else if(itemName=="Falooda"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="GulabJamun"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName=="Rasgulla"){
            price = 75.0 * quantity;
            return price;
        }
        else if(itemName=="Rasmalai"){
            price = 100.0 * quantity;
            return price;
        }
        else if(itemName=="Jalebi"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="KajuKatli"){
            price = 300.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}