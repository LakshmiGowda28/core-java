class DoorDash{
    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="Sushi"){
            price = 300.0;
            return price;
        }
        else if(itemName=="Ramen"){
            price = 250.0;
            return price;
        }
        else if(itemName=="Tempura"){
            price = 280.0;
            return price;
        }
        else if(itemName=="Tacos"){
            price = 200.0;
            return price;
        }
        else if(itemName=="Burrito"){
            price = 220.0;
            return price;
        }
        else if(itemName=="Quesadilla"){
            price = 210.0;
            return price;
        }
        else if(itemName=="PastaAlfredo"){
            price = 260.0;
            return price;
        }
        else if(itemName=="Spaghetti"){
            price = 240.0;
            return price;
        }
        else if(itemName=="Lasagna"){
            price = 300.0;
            return price;
        }
        else if(itemName=="Risotto"){
            price = 270.0;
            return price;
        }
        else if(itemName=="Paella"){
            price = 320.0;
            return price;
        }
        else if(itemName=="Croissant"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Bagel"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Hotdog"){
            price = 180.0;
            return price;
        }
        else if(itemName=="Steak"){
            price = 500.0;
            return price;
        }
        else if(itemName=="GrilledSalmon"){
            price = 450.0;
            return price;
        }
        else if(itemName=="BBQRibs"){
            price = 400.0;
            return price;
        }
        else if(itemName=="FishAndChips"){
            price = 300.0;
            return price;
        }
        else if(itemName=="ChickenWings"){
            price = 250.0;
            return price;
        }
        else if(itemName=="CaesarSalad"){
            price = 200.0;
            return price;
        }
        else if(itemName=="GreekSalad"){
            price = 210.0;
            return price;
        }
        else if(itemName=="Falafel"){
            price = 180.0;
            return price;
        }
        else if(itemName=="Hummus"){
            price = 170.0;
            return price;
        }
        else if(itemName=="PitaBread"){
            price = 100.0;
            return price;
        }
        else if(itemName=="Shawarma"){
            price = 220.0;
            return price;
        }
        else if(itemName=="DonerKebab"){
            price = 230.0;
            return price;
        }
        else if(itemName=="Kimchi"){
            price = 160.0;
            return price;
        }
        else if(itemName=="Bibimbap"){
            price = 260.0;
            return price;
        }
        else if(itemName=="Dumplings"){
            price = 200.0;
            return price;
        }
        else if(itemName=="WontonSoup"){
            price = 190.0;
            return price;
        }
        else if(itemName=="SpringOnionChicken"){
            price = 270.0;
            return price;
        }
        else if(itemName=="TeriyakiChicken"){
            price = 280.0;
            return price;
        }
        else if(itemName=="Udon"){
            price = 240.0;
            return price;
        }
        else if(itemName=="Pho"){
            price = 230.0;
            return price;
        }
        else if(itemName=="Satay"){
            price = 260.0;
            return price;
        }
        else if(itemName=="PadThai"){
            price = 250.0;
            return price;
        }
        else if(itemName=="GreenCurry"){
            price = 260.0;
            return price;
        }
        else if(itemName=="RedCurry"){
            price = 260.0;
            return price;
        }
        else if(itemName=="TomYumSoup"){
            price = 240.0;
            return price;
        }
        else if(itemName=="FriedTofu"){
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

        if(itemName=="Sushi"){
            price = 300.0 * quantity;
            return price;
        }
        else if(itemName=="Ramen"){
            price = 250.0 * quantity;
            return price;
        }
        else if(itemName=="Tempura"){
            price = 280.0 * quantity;
            return price;
        }
        else if(itemName=="Tacos"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName=="Burrito"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="Quesadilla"){
            price = 210.0 * quantity;
            return price;
        }
        else if(itemName=="PastaAlfredo"){
            price = 260.0 * quantity;
            return price;
        }
        else if(itemName=="Spaghetti"){
            price = 240.0 * quantity;
            return price;
        }
        else if(itemName=="Lasagna"){
            price = 300.0 * quantity;
            return price;
        }
        else if(itemName=="Risotto"){
            price = 270.0 * quantity;
            return price;
        }
        else if(itemName=="Paella"){
            price = 320.0 * quantity;
            return price;
        }
        else if(itemName=="Croissant"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="Bagel"){
            price = 120.0 * quantity;
            return price;
        }
        else if(itemName=="Hotdog"){
            price = 180.0 * quantity;
            return price;
        }
        else if(itemName=="Steak"){
            price = 500.0 * quantity;
            return price;
        }
        else if(itemName=="GrilledSalmon"){
            price = 450.0 * quantity;
            return price;
        }
        else if(itemName=="BBQRibs"){
            price = 400.0 * quantity;
            return price;
        }
        else if(itemName=="FishAndChips"){
            price = 300.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenWings"){
            price = 250.0 * quantity;
            return price;
        }
        else if(itemName=="CaesarSalad"){
            price = 200.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}