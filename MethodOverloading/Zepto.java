class Zepto{
    public static double search(String itemName){
        double price = 0.0;
        if(itemName=="Milk"){
            price = 50.0;
            return price;
        }
        else if(itemName=="Bread"){
            price = 40.0;
            return price;
        }
        else if(itemName=="Eggs"){
            price = 70.0;
            return price;
        }
        else if(itemName=="Rice"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Wheat Flour"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Sugar"){
            price = 45.0;
            return price;
        }
        else if(itemName=="Salt"){
            price = 20.0;
            return price;
        }
        else if(itemName=="Cooking Oil"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Butter"){
            price = 55.0;
            return price;
        }
        else if(itemName=="Cheese"){
            price = 80.0;
            return price;
        }
        else if(itemName=="Curd"){
            price = 35.0;
            return price;
        }
        else if(itemName=="Paneer"){
            price = 90.0;
            return price;
        }
        else if(itemName=="Apple"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Banana"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Orange"){
            price = 80.0;
            return price;
        }
        else if(itemName=="Mango"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Grapes"){
            price = 90.0;
            return price;
        }
        else if(itemName=="Watermelon"){
            price = 70.0;
            return price;
        }
        else if(itemName=="Papaya"){
            price = 65.0;
            return price;
        }
        else if(itemName=="Pineapple"){
            price = 85.0;
            return price;
        }
        else if(itemName=="Potato"){
            price = 40.0;
            return price;
        }
        else if(itemName=="Tomato"){
            price = 50.0;
            return price;
        }
        else if(itemName=="Onion"){
            price = 45.0;
            return price;
        }
        else if(itemName=="Carrot"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Beans"){
            price = 55.0;
            return price;
        }
        else if(itemName=="Cabbage"){
            price = 35.0;
            return price;
        }
        else if(itemName=="Cauliflower"){
            price = 45.0;
            return price;
        }
        else if(itemName=="Spinach"){
            price = 25.0;
            return price;
        }
        else if(itemName=="Brinjal"){
            price = 40.0;
            return price;
        }
        else if(itemName=="Capsicum"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Maggi"){
            price = 20.0;
            return price;
        }
        else if(itemName=="Biscuits"){
            price = 30.0;
            return price;
        }
        else if(itemName=="Chips"){
            price = 25.0;
            return price;
        }
        else if(itemName=="Chocolate"){
            price = 50.0;
            return price;
        }
        else if(itemName=="IceCream"){
            price = 100.0;
            return price;
        }
        else if(itemName=="Cold Drink"){
            price = 40.0;
            return price;
        }
        else if(itemName=="Juice"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Tea Powder"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Coffee Powder"){
            price = 180.0;
            return price;
        }
        else if(itemName=="Honey"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Shampoo"){
            price = 250.0;
            return price;
        }
        else if(itemName=="Soap"){
            price = 40.0;
            return price;
        }
        else if(itemName=="Toothpaste"){
            price = 90.0;
            return price;
        }
        else if(itemName=="Toothbrush"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Facewash"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Body Lotion"){
            price = 200.0;
            return price;
        }
        else if(itemName=="Hair Oil"){
            price = 140.0;
            return price;
        }
        else if(itemName=="Deodorant"){
            price = 180.0;
            return price;
        }
        else if(itemName=="Sanitary Pads"){
            price = 120.0;
            return price;
        }
        else if(itemName=="Detergent"){
            price = 220.0;
            return price;
        }
        else if(itemName=="Floor Cleaner"){
            price = 150.0;
            return price;
        }
        else if(itemName=="Dishwash Liquid"){
            price = 110.0;
            return price;
        }
        else if(itemName=="Handwash"){
            price = 90.0;
            return price;
        }
        else if(itemName=="Garbage Bags"){
            price = 70.0;
            return price;
        }
        else if(itemName=="Tissue Paper"){
            price = 60.0;
            return price;
        }
        else if(itemName=="Aluminium Foil"){
            price = 80.0;
            return price;
        }
        else if(itemName=="Matchbox"){
            price = 10.0;
            return price;
        }
        else{
            System.out.println(itemName+" not found");
        }

        return price;
    }

public static double search(String itemName , int quantity){

    double price = 0.0;

    if(itemName=="Milk"){
        price = 50.0 * quantity;
        return price;
    }
    else if(itemName=="Bread"){
        price = 40.0 * quantity;
        return price;
    }
    else if(itemName=="Eggs"){
        price = 70.0 * quantity;
        return price;
    }
    else if(itemName=="Rice"){
        price = 120.0 * quantity;
        return price;
    }
    else if(itemName=="Wheat Flour"){
        price = 60.0 * quantity;
        return price;
    }
    else if(itemName=="Sugar"){
        price = 45.0 * quantity;
        return price;
    }
    else if(itemName=="Salt"){
        price = 20.0 * quantity;
        return price;
    }
    else if(itemName=="Cooking Oil"){
        price = 150.0 * quantity;
        return price;
    }
    else if(itemName=="Butter"){
        price = 55.0 * quantity;
        return price;
    }
    else if(itemName=="Cheese"){
        price = 80.0 * quantity;
        return price;
    }
    else if(itemName=="Curd"){
        price = 35.0 * quantity;
        return price;
    }
    else if(itemName=="Paneer"){
        price = 90.0 * quantity;
        return price;
    }
    else if(itemName=="Apple"){
        price = 120.0 * quantity;
        return price;
    }
    else if(itemName=="Banana"){
        price = 60.0 * quantity;
        return price;
    }
    else if(itemName=="Orange"){
        price = 80.0 * quantity;
        return price;
    }
    else if(itemName=="Mango"){
        price = 150.0 * quantity;
        return price;
    }
    else if(itemName=="Grapes"){
        price = 90.0 * quantity;
        return price;
    }
    else if(itemName=="Watermelon"){
        price = 70.0 * quantity;
        return price;
    }
    else if(itemName=="Papaya"){
        price = 65.0 * quantity;
        return price;
    }
    else if(itemName=="Pineapple"){
        price = 85.0 * quantity;
        return price;
    }
    else if(itemName=="Potato"){
        price = 40.0 * quantity;
        return price;
    }
    else if(itemName=="Tomato"){
        price = 50.0 * quantity;
        return price;
    }
    else if(itemName=="Onion"){
        price = 45.0 * quantity;
        return price;
    }
    else if(itemName=="Carrot"){
        price = 60.0 * quantity;
        return price;
    }
    else if(itemName=="Beans"){
        price = 55.0 * quantity;
        return price;
    }
    else if(itemName=="Cabbage"){
        price = 35.0 * quantity;
        return price;
    }
    else if(itemName=="Cauliflower"){
        price = 45.0 * quantity;
        return price;
    }
    else if(itemName=="Spinach"){
        price = 25.0 * quantity;
        return price;
    }
    else if(itemName=="Brinjal"){
        price = 40.0 * quantity;
        return price;
    }
    else if(itemName=="Capsicum"){
        price = 60.0 * quantity;
        return price;
    }
    else if(itemName=="Maggi"){
        price = 20.0 * quantity;
        return price;
    }
    else if(itemName=="Biscuits"){
        price = 30.0 * quantity;
        return price;
    }
    else if(itemName=="Chips"){
        price = 25.0 * quantity;
        return price;
    }
    else if(itemName=="Chocolate"){
        price = 50.0 * quantity;
        return price;
    }
    else if(itemName=="IceCream"){
        price = 100.0 * quantity;
        return price;
    }
    else if(itemName=="Cold Drink"){
        price = 40.0 * quantity;
        return price;
    }
    else if(itemName=="Juice"){
        price = 60.0 * quantity;
        return price;
    }
    else if(itemName=="Tea Powder"){
        price = 120.0 * quantity;
        return price;
    }
    else if(itemName=="Coffee Powder"){
        price = 180.0 * quantity;
        return price;
    }
    else if(itemName=="Honey"){
        price = 150.0 * quantity;
        return price;
    }
    else if(itemName=="Shampoo"){
        price = 250.0 * quantity;
        return price;
    }
    else if(itemName=="Soap"){
        price = 40.0 * quantity;
        return price;
    }
    else if(itemName=="Toothpaste"){
        price = 90.0 * quantity;
        return price;
    }
    else if(itemName=="Toothbrush"){
        price = 60.0 * quantity;
        return price;
    }
    else if(itemName=="Facewash"){
        price = 120.0 * quantity;
        return price;
    }
    else if(itemName=="Body Lotion"){
        price = 200.0 * quantity;
        return price;
    }
    else if(itemName=="Hair Oil"){
        price = 140.0 * quantity;
        return price;
    }
    else if(itemName=="Deodorant"){
        price = 180.0 * quantity;
        return price;
    }
    else if(itemName=="Sanitary Pads"){
        price = 120.0 * quantity;
        return price;
    }
    else if(itemName=="Detergent"){
        price = 220.0 * quantity;
        return price;
    }
    else if(itemName=="Floor Cleaner"){
        price = 150.0 * quantity;
        return price;
    }
    else if(itemName=="Dishwash Liquid"){
        price = 110.0 * quantity;
        return price;
    }
    else if(itemName=="Handwash"){
        price = 90.0 * quantity;
        return price;
    }
    else if(itemName=="Garbage Bags"){
        price = 70.0 * quantity;
        return price;
    }
    else if(itemName=="Tissue Paper"){
        price = 60.0 * quantity;
        return price;
    }
    else if(itemName=="Aluminium Foil"){
        price = 80.0 * quantity;
        return price;
    }
    else if(itemName=="Matchbox"){
        price = 10.0 * quantity;
        return price;
    }
    else{
        System.out.println(itemName+"not found");
    }
    return price;
}
}
