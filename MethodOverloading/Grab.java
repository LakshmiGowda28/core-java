class Grab{
    public static double search(String itemName){
        double price = 0.0;

        if(itemName=="SushiRoll"){
            price = 280.0;
            return price;
        }
        else if(itemName=="MisoSoup"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Edamame"){
            price = 140.0;
            return price;
        }
        else if(itemName=="ThaiBasilChicken"){
            price = 260.0;
            return price;
        }
        else if(itemName=="ThaiFriedRice"){
            price = 240.0;
            return price;
        }
        else if(itemName=="PadSeeEw"){
            price = 250.0;
            return price;
        }
        else if(itemName=="SingaporeNoodles"){
            price = 230.0;
            return price;
        }
        else if(itemName=="ChilliChickenAsian"){
            price = 270.0;
            return price;
        }
        else if(itemName=="KungPaoChicken"){
            price = 280.0;
            return price;
        }
        else if(itemName=="SzechuanNoodles"){
            price = 260.0;
            return price;
        }
        else if(itemName=="HakkaNoodles"){
            price = 220.0;
            return price;
        }
        else if(itemName=="FriedWontons"){
            price = 200.0;
            return price;
        }
        else if(itemName=="ChickenDimsum"){
            price = 240.0;
            return price;
        }
        else if(itemName=="VegDimsum"){
            price = 220.0;
            return price;
        }
        else if(itemName=="ShrimpDimsum"){
            price = 280.0;
            return price;
        }
        else if(itemName=="TeriyakiSalmon"){
            price = 350.0;
            return price;
        }
        else if(itemName=="TeriyakiTofu"){
            price = 260.0;
            return price;
        }
        else if(itemName=="KoreanBBQChicken"){
            price = 300.0;
            return price;
        }
        else if(itemName=="KimchiFriedRice"){
            price = 240.0;
            return price;
        }
        else if(itemName=="Japchae"){
            price = 250.0;
            return price;
        }
        else if(itemName=="Gyoza"){
            price = 220.0;
            return price;
        }
        else if(itemName=="Takoyaki"){
            price = 260.0;
            return price;
        }
        else if(itemName=="Okonomiyaki"){
            price = 280.0;
            return price;
        }
        else if(itemName=="PhoBo"){
            price = 270.0;
            return price;
        }
        else if(itemName=="BanhMi"){
            price = 230.0;
            return price;
        }
        else if(itemName=="Laksa"){
            price = 260.0;
            return price;
        }
        else if(itemName=="NasiGoreng"){
            price = 250.0;
            return price;
        }
        else if(itemName=="SatayChicken"){
            price = 280.0;
            return price;
        }
        else if(itemName=="SatayPaneer"){
            price = 260.0;
            return price;
        }
        else if(itemName=="ThaiGreenCurryVeg"){
            price = 270.0;
            return price;
        }
        else if(itemName=="ThaiRedCurryChicken"){
            price = 290.0;
            return price;
        }
        else if(itemName=="MangoStickyRice"){
            price = 220.0;
            return price;
        }
        else if(itemName=="BubbleTea"){
            price = 180.0;
            return price;
        }
        else if(itemName=="MatchaLatte"){
            price = 190.0;
            return price;
        }
        else if(itemName=="SakuraMochi"){
            price = 210.0;
            return price;
        }
        else if(itemName=="UbeCake"){
            price = 230.0;
            return price;
        }
        else if(itemName=="PandanCake"){
            price = 220.0;
            return price;
        }
        else if(itemName=="ThaiIcedTea"){
            price = 170.0;
            return price;
        }
        else if(itemName=="VietnameseCoffee"){
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

        if(itemName=="SushiRoll"){
            price = 280.0 * quantity;
            return price;
        }
        else if(itemName=="MisoSoup"){
            price = 150.0 * quantity;
            return price;
        }
        else if(itemName=="Edamame"){
            price = 140.0 * quantity;
            return price;
        }
        else if(itemName=="ThaiBasilChicken"){
            price = 260.0 * quantity;
            return price;
        }
        else if(itemName=="ThaiFriedRice"){
            price = 240.0 * quantity;
            return price;
        }
        else if(itemName=="PadSeeEw"){
            price = 250.0 * quantity;
            return price;
        }
        else if(itemName=="SingaporeNoodles"){
            price = 230.0 * quantity;
            return price;
        }
        else if(itemName=="ChilliChickenAsian"){
            price = 270.0 * quantity;
            return price;
        }
        else if(itemName=="KungPaoChicken"){
            price = 280.0 * quantity;
            return price;
        }
        else if(itemName=="SzechuanNoodles"){
            price = 260.0 * quantity;
            return price;
        }
        else if(itemName=="HakkaNoodles"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="FriedWontons"){
            price = 200.0 * quantity;
            return price;
        }
        else if(itemName=="ChickenDimsum"){
            price = 240.0 * quantity;
            return price;
        }
        else if(itemName=="VegDimsum"){
            price = 220.0 * quantity;
            return price;
        }
        else if(itemName=="ShrimpDimsum"){
            price = 280.0 * quantity;
            return price;
        }
        else if(itemName=="TeriyakiSalmon"){
            price = 350.0 * quantity;
            return price;
        }
        else if(itemName=="TeriyakiTofu"){
            price = 260.0 * quantity;
            return price;
        }
        else if(itemName=="KoreanBBQChicken"){
            price = 300.0 * quantity;
            return price;
        }
        else if(itemName=="KimchiFriedRice"){
            price = 240.0 * quantity;
            return price;
        }
        else if(itemName=="Japchae"){
            price = 250.0 * quantity;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }
}