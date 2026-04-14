class HatRunner{
public static void main(String[] args){

Hat hatOne = new Hat();
hatOne.hatId = 1;
hatOne.hatBrand = "Nike";
hatOne.hatColor = "Black";
hatOne.hatType = "Cap";

Hat hatTwo = new Hat();
hatTwo.hatId = 2;
hatTwo.hatBrand = "Adidas";
hatTwo.hatColor = "Blue";
hatTwo.hatType = "Sports";

Hat hatThree = new Hat();
hatThree.hatId = 3;
hatThree.hatBrand = "Puma";
hatThree.hatColor = "White";
hatThree.hatType = "Cap";

Hat hatFour = new Hat();
hatFour.hatId = 4;
hatFour.hatBrand = "Reebok";
hatFour.hatColor = "Red";
hatFour.hatType = "Sports";

Hat hatFive = new Hat();
hatFive.hatId = 5;
hatFive.hatBrand = "Levis";
hatFive.hatColor = "Black";
hatFive.hatType = "Casual";

Hat hatSix = new Hat();
hatSix.hatId = 6;
hatSix.hatBrand = "Zara";
hatSix.hatColor = "Brown";
hatSix.hatType = "Fashion";

Hat hatSeven = new Hat();
hatSeven.hatId = 7;
hatSeven.hatBrand = "H&M";
hatSeven.hatColor = "Gray";
hatSeven.hatType = "Casual";

Hat hatEight = new Hat();
hatEight.hatId = 8;
hatEight.hatBrand = "Gucci";
hatEight.hatColor = "Black";
hatEight.hatType = "Premium";

Hat hatNine = new Hat();
hatNine.hatId = 9;
hatNine.hatBrand = "Louis";
hatNine.hatColor = "White";
hatNine.hatType = "Premium";

Hat hatTen = new Hat();
hatTen.hatId = 10;
hatTen.hatBrand = "AllenSolly";
hatTen.hatColor = "Blue";
hatTen.hatType = "Formal";

Hat hatEleven = new Hat();
hatEleven.hatId = 11;
hatEleven.hatBrand = "PeterEngland";
hatEleven.hatColor = "Black";
hatEleven.hatType = "Formal";

Hat hatTwelve = new Hat();
hatTwelve.hatId = 12;
hatTwelve.hatBrand = "USPA";
hatTwelve.hatColor = "Red";
hatTwelve.hatType = "Sports";

Hat hatThirteen = new Hat();
hatThirteen.hatId = 13;
hatThirteen.hatBrand = "Wrangler";
hatThirteen.hatColor = "Brown";
hatThirteen.hatType = "Casual";

Hat hatFourteen = new Hat();
hatFourteen.hatId = 14;
hatFourteen.hatBrand = "Roadster";
hatFourteen.hatColor = "Gray";
hatFourteen.hatType = "Casual";

Hat hatFifteen = new Hat();
hatFifteen.hatId = 15;
hatFifteen.hatBrand = "Tommy";
hatFifteen.hatColor = "Blue";
hatFifteen.hatType = "Premium";


Hat hats[] = new Hat[15];

hats[0] = hatOne;
hats[1] = hatTwo;
hats[2] = hatThree;
hats[3] = hatFour;
hats[4] = hatFive;
hats[5] = hatSix;
hats[6] = hatSeven;
hats[7] = hatEight;
hats[8] = hatNine;
hats[9] = hatTen;
hats[10] = hatEleven;
hats[11] = hatTwelve;
hats[12] = hatThirteen;
hats[13] = hatFourteen;
hats[14] = hatFifteen;


for(Hat h : hats){

System.out.println("the hat id is "+h.hatId);
System.out.println("the hat brand is "+h.hatBrand);
System.out.println("the hat color is "+h.hatColor);
System.out.println("the hat type is "+h.hatType);
System.out.println("----------");

}

}
}