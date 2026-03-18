class Swiggy{
    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Samosa"){
            price = 20.0;
            return price;
        }
        else if(itemName=="Kachori"){
            price = 25.0;
            return price;
        }
        else if(itemName=="VegPuff"){
            price = 30.0;
            return price;
        }
        else if(itemName=="ChickenPuff"){
            price = 40.0;
            return price;
        }
        else if(itemName=="FrenchFries"){
            price = 90.0;
            return price;
        }
        else if(itemName=="CheeseBalls"){
            price = 110.0;
            return price;
        }
        else if(itemName=="OnionRings"){
            price = 80.0;
            return price;
        }
        else if(itemName=="BreadRoll"){
            price = 35.0;
            return price;
        }
        else if(itemName=="VegCutlet"){
            price = 45.0;
            return price;
        }
        else if(itemName=="ChickenCutlet"){
            price = 70.0;
            return price;
        }
        else if(itemName=="SpringDosa"){
            price = 60.0;
            return price;
        }
        else if(itemName=="MiniIdli"){
            price = 50.0;
            return price;
        }
        else if(itemName=="GoliBajji"){
            price = 40.0;
            return price;
        }
        else if(itemName=="MirchiBajji"){
            price = 35.0;
            return price;
        }
        else if(itemName=="AlooBonda"){
            price = 30.0;
            return price;
        }
        else if(itemName=="PaneerPakoda"){
            price = 90.0;
            return price;
        }
        else if(itemName=="ChickenPakoda"){
            price = 120.0;
            return price;
        }
        else if(itemName=="CornChaat"){
            price = 60.0;
            return price;
        }
        else if(itemName=="PaniPuri"){
            price = 40.0;
            return price;
        }
        else if(itemName=="BhelPuri"){
            price = 50.0;
            return price;
        }
        else if(itemName=="SevPuri"){
            price = 55.0;
            return price;
        }
        else if(itemName=="DahiPuri"){
            price = 65.0;
            return price;
        }
        else if(itemName=="RagdaPattice"){
            price = 70.0;
            return price;
        }
        else if(itemName=="MasalaCorn"){
            price = 50.0;
            return price;
        }
        else if(itemName=="CheeseMaggi"){
            price = 70.0;
            return price;
        }
        else if(itemName=="EggMaggi"){
            price = 80.0;
            return price;
        }
        else if(itemName=="ChickenMaggi"){
            price = 100.0;
            return price;
        }
        else if(itemName=="VegSandwich"){
            price = 60.0;
            return price;
        }
        else if(itemName=="GrillSandwich"){
            price = 90.0;
            return price;
        }
        else if(itemName=="CheeseSandwich"){
            price = 80.0;
            return price;
        }
        else if(itemName=="ChickenSandwich"){
            price = 110.0;
            return price;
        }
        else if(itemName=="VegBurger"){
            price = 70.0;
            return price;
        }
        else if(itemName=="ChickenBurger"){
            price = 120.0;
            return price;
        }
        else if(itemName=="PaneerBurger"){
            price = 100.0;
            return price;
        }
        else if(itemName=="MiniPizza"){
            price = 130.0;
            return price;
        }
        else if(itemName=="GarlicBread"){
            price = 90.0;
            return price;
        }
        else if(itemName=="CheeseGarlicBread"){
            price = 110.0;
            return price;
        }
        else if(itemName=="Nachos"){
            price = 120.0;
            return price;
        }
        else if(itemName=="CheeseNachos"){
            price = 140.0;
            return price;
        }
        else if(itemName=="Popcorn"){
            price = 100.0;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }


    public static double search(String itemName , int quantity){

        double price = 0.0;

        if(itemName=="Samosa"){
            price = 20.0 * quantity;
            return price;
        }
        else if(itemName=="Kachori"){
            price = 25.0 * quantity;
            return price;
        }
        else if(itemName=="VegPuff"){
            price = 30.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenPuff"){
            price = 40.0 * quantity;
            return price;
        }
        else if(itemName=="FrenchFries"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="CheeseBalls"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName=="OnionRings"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName=="BreadRoll"){
            price = 35.0 * quantity;
            return price;
        }
        else if(itemName=="VegCutlet"){
            price = 45.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenCutlet"){
            price = 70.0 * quantity;
            return price;
        }
        else if(itemName=="SpringDosa"){
            price = 60.0 * quantity;
            return price;
        }
        else if(itemName=="MiniIdli"){
            price = 50.0 * quantity;
            return price;
        }
        else if(itemName=="GoliBajji"){
            price = 40.0 * quantity;
            return price;
        }
        else if(itemName=="MirchiBajji"){
            price = 35.0 * quantity;
            return price;
        }
        else if(itemName=="AlooBonda"){
            price = 30.0 * quantity;
            return price;
        }
        else if(itemName=="PaneerPakoda"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenPakoda"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="CornChaat"){
            price = 60.0 * quantity;
            return price;
        }
        else if(itemName=="PaniPuri"){
            price = 40.0 * quantity;
            return price;
        }
        else if(itemName=="BhelPuri"){
            price = 50.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}