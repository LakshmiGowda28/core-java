class YogaMatRunner{
public static void main(String[] args){

YogaMat yogaMatOne = new YogaMat();
yogaMatOne.yogaMatId = 1;
yogaMatOne.yogaMatBrand = "Boldfit";
yogaMatOne.yogaMatColor = "Purple";
yogaMatOne.yogaMatType = "Foam";

YogaMat yogaMatTwo = new YogaMat();
yogaMatTwo.yogaMatId = 2;
yogaMatTwo.yogaMatBrand = "AmazonBasics";
yogaMatTwo.yogaMatColor = "Blue";
yogaMatTwo.yogaMatType = "Rubber";

YogaMat yogaMatThree = new YogaMat();
yogaMatThree.yogaMatId = 3;
yogaMatThree.yogaMatBrand = "Strauss";
yogaMatThree.yogaMatColor = "Black";
yogaMatThree.yogaMatType = "Foam";

YogaMat yogaMatFour = new YogaMat();
yogaMatFour.yogaMatId = 4;
yogaMatFour.yogaMatBrand = "Reebok";
yogaMatFour.yogaMatColor = "Pink";
yogaMatFour.yogaMatType = "Rubber";

YogaMat yogaMatFive = new YogaMat();
yogaMatFive.yogaMatId = 5;
yogaMatFive.yogaMatBrand = "Nike";
yogaMatFive.yogaMatColor = "Gray";
yogaMatFive.yogaMatType = "Foam";

YogaMat yogaMatSix = new YogaMat();
yogaMatSix.yogaMatId = 6;
yogaMatSix.yogaMatBrand = "Adidas";
yogaMatSix.yogaMatColor = "Blue";
yogaMatSix.yogaMatType = "Rubber";

YogaMat yogaMatSeven = new YogaMat();
yogaMatSeven.yogaMatId = 7;
yogaMatSeven.yogaMatBrand = "Puma";
yogaMatSeven.yogaMatColor = "Black";
yogaMatSeven.yogaMatType = "Foam";

YogaMat yogaMatEight = new YogaMat();
yogaMatEight.yogaMatId = 8;
yogaMatEight.yogaMatBrand = "Fitkit";
yogaMatEight.yogaMatColor = "Green";
yogaMatEight.yogaMatType = "Rubber";

YogaMat yogaMatNine = new YogaMat();
yogaMatNine.yogaMatId = 9;
yogaMatNine.yogaMatBrand = "Aurion";
yogaMatNine.yogaMatColor = "Purple";
yogaMatNine.yogaMatType = "Foam";

YogaMat yogaMatTen = new YogaMat();
yogaMatTen.yogaMatId = 10;
yogaMatTen.yogaMatBrand = "Kobo";
yogaMatTen.yogaMatColor = "Red";
yogaMatTen.yogaMatType = "Rubber";

YogaMat yogaMatEleven = new YogaMat();
yogaMatEleven.yogaMatId = 11;
yogaMatEleven.yogaMatBrand = "Cosco";
yogaMatEleven.yogaMatColor = "Blue";
yogaMatEleven.yogaMatType = "Foam";

YogaMat yogaMatTwelve = new YogaMat();
yogaMatTwelve.yogaMatId = 12;
yogaMatTwelve.yogaMatBrand = "Nivia";
yogaMatTwelve.yogaMatColor = "Black";
yogaMatTwelve.yogaMatType = "Rubber";

YogaMat yogaMatThirteen = new YogaMat();
yogaMatThirteen.yogaMatId = 13;
yogaMatThirteen.yogaMatBrand = "HRX";
yogaMatThirteen.yogaMatColor = "Gray";
yogaMatThirteen.yogaMatType = "Foam";

YogaMat yogaMatFourteen = new YogaMat();
yogaMatFourteen.yogaMatId = 14;
yogaMatFourteen.yogaMatBrand = "Bold";
yogaMatFourteen.yogaMatColor = "Pink";
yogaMatFourteen.yogaMatType = "Rubber";

YogaMat yogaMatFifteen = new YogaMat();
yogaMatFifteen.yogaMatId = 15;
yogaMatFifteen.yogaMatBrand = "Protoner";
yogaMatFifteen.yogaMatColor = "Green";
yogaMatFifteen.yogaMatType = "Foam";


YogaMat yogaMats[] = new YogaMat[15];

yogaMats[0] = yogaMatOne;
yogaMats[1] = yogaMatTwo;
yogaMats[2] = yogaMatThree;
yogaMats[3] = yogaMatFour;
yogaMats[4] = yogaMatFive;
yogaMats[5] = yogaMatSix;
yogaMats[6] = yogaMatSeven;
yogaMats[7] = yogaMatEight;
yogaMats[8] = yogaMatNine;
yogaMats[9] = yogaMatTen;
yogaMats[10] = yogaMatEleven;
yogaMats[11] = yogaMatTwelve;
yogaMats[12] = yogaMatThirteen;
yogaMats[13] = yogaMatFourteen;
yogaMats[14] = yogaMatFifteen;


for(YogaMat y : yogaMats){

System.out.println("the yogamat id is "+y.yogaMatId);
System.out.println("the yogamat brand is "+y.yogaMatBrand);
System.out.println("the yogamat color is "+y.yogaMatColor);
System.out.println("the yogamat type is "+y.yogaMatType);
System.out.println("----------");

}

}
}