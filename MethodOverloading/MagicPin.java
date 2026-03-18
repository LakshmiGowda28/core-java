class MagicPin{
    public static double search(String itemName){
        double price = 0.0;
        if(itemName=="PavBhaji"){
            price = 120.0;
            return price;
        }
        else if(itemName=="VadaPav"){
            price = 30.0;
            return price;
        }
        else if(itemName=="Dabeli"){
            price = 40.0;
            return price;
        }
        else if(itemName=="MisalPav"){
            price = 90.0;
            return price;
        }
        else if(itemName=="BombaySandwich"){
            price = 70.0;
            return price;
        }
        else if(itemName=="MasalaPav"){
            price = 60.0;
            return price;
        }
        else if(itemName=="TawaPulao"){
            price = 110.0;
            return price;
        }
        else if(itemName=="SevUsal"){
            price = 80.0;
            return price;
        }
        else if(itemName=="KathiRoll"){
            price = 100.0;
            return price;
        }
        else if(itemName=="EggRollStreet"){
            price = 90.0;
            return price;
        }
        else if(itemName=="ChickenRollStreet"){
            price = 120.0;
            return price;
        }
        else if(itemName=="PaneerTikkaRoll"){
            price = 110.0;
            return price;
        }
        else if(itemName=="AlooTikki"){
            price = 50.0;
            return price;
        }
        else if(itemName=="CholeBhature"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Kulcha"){
            price = 90.0;
            return price;
        }
        else if(itemName=="AmritsariKulcha"){
            price = 140.0;
            return price;
        }
        else if(itemName=="RajKachori"){
            price = 100.0;
            return price;
        }
        else if(itemName=="PapdiChaat"){
            price = 80.0;
            return price;
        }
        else if(itemName=="AlooChaat"){
            price = 70.0;
            return price;
        }
        else if(itemName=="SamosaChaat"){
            price = 90.0;
            return price;
        }
        else if(itemName=="ChaatPlatter"){
            price = 120.0;
            return price;
        }
        else if(itemName=="MomosStreet"){
            price = 100.0;
            return price;
        }
        else if(itemName=="FriedMomos"){
            price = 120.0;
            return price;
        }
        else if(itemName=="TandooriMomos"){
            price = 140.0;
            return price;
        }
        else if(itemName=="PaneerMomos"){
            price = 130.0;
            return price;
        }
        else if(itemName=="ChickenMomosStreet"){
            price = 150.0;
            return price;
        }
        else if(itemName=="HakkaChowmein"){
            price = 110.0;
            return price;
        }
        else if(itemName=="EggChowmein"){
            price = 120.0;
            return price;
        }
        else if(itemName=="ChickenChowmein"){
            price = 140.0;
            return price;
        }
        else if(itemName=="ChilliPaneerStreet"){
            price = 130.0;
            return price;
        }
        else if(itemName=="ChilliChickenStreet"){
            price = 150.0;
            return price;
        }
        else if(itemName=="VegFriedRiceStreet"){
            price = 110.0;
            return price;
        }
        else if(itemName=="EggFriedRiceStreet"){
            price = 120.0;
            return price;
        }
        else if(itemName=="ChickenFriedRiceStreet"){
            price = 140.0;
            return price;
        }
        else if(itemName=="KulfiFalooda"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Rabri"){
            price = 130.0;
            return price;
        }
        else if(itemName=="Malpua"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Imarti"){
            price = 110.0;
            return price;
        }
        else if(itemName=="SugarcaneJuice"){
            price = 50.0;
            return price;
        }
        else if(itemName=="Lassi"){
            price = 80.0;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }


    public static double search(String itemName , int quantity){

        double price = 0.0;

        if(itemName=="PavBhaji"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="VadaPav"){
            price = 30.0 * quantity;
            return price;
        }
        else if(itemName=="Dabeli"){
            price = 40.0 * quantity;
            return price;
        }
        else if(itemName=="MisalPav"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="BombaySandwich"){
            price = 70.0 * quantity;
            return price;
        }
        else if(itemName=="MasalaPav"){
            price = 60.0 * quantity;
            return price;
        }
        else if(itemName=="TawaPulao"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName=="SevUsal"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName=="KathiRoll"){
            price = 100.0 * quantity;
            return price;
        }
        else if(itemName=="EggRollStreet"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenRollStreet"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="PaneerTikkaRoll"){
            price = 110.0 * quantity;
            return price;
        }
        else if(itemName=="AlooTikki"){
            price = 50.0 * quantity;
            return price;
        }
        else if(itemName=="CholeBhature"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="Kulcha"){
            price = 90.0 * quantity;
            return price;
        }
        else if(itemName=="AmritsariKulcha"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="RajKachori"){
            price = 100.0 * quantity;
            return price;
        }
        else if(itemName=="PapdiChaat"){
            price = 80.0 * quantity;
            return price;
        }
        else if(itemName=="AlooChaat"){
            price = 70.0 * quantity;
            return price;
        }
        else if(itemName=="SamosaChaat"){
            price = 90.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}