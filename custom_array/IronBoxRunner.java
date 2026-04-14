class IronBoxRunner{
public static void main(String[] args){

IronBox ironBoxOne = new IronBox();
ironBoxOne.ironBoxId = 1;
ironBoxOne.ironBoxBrand = "Philips";
ironBoxOne.ironBoxColor = "Black";
ironBoxOne.ironBoxType = "Steam";

IronBox ironBoxTwo = new IronBox();
ironBoxTwo.ironBoxId = 2;
ironBoxTwo.ironBoxBrand = "Bajaj";
ironBoxTwo.ironBoxColor = "White";
ironBoxTwo.ironBoxType = "Dry";

IronBox ironBoxThree = new IronBox();
ironBoxThree.ironBoxId = 3;
ironBoxThree.ironBoxBrand = "Usha";
ironBoxThree.ironBoxColor = "Blue";
ironBoxThree.ironBoxType = "Steam";

IronBox ironBoxFour = new IronBox();
ironBoxFour.ironBoxId = 4;
ironBoxFour.ironBoxBrand = "Havells";
ironBoxFour.ironBoxColor = "Gray";
ironBoxFour.ironBoxType = "Dry";

IronBox ironBoxFive = new IronBox();
ironBoxFive.ironBoxId = 5;
ironBoxFive.ironBoxBrand = "Prestige";
ironBoxFive.ironBoxColor = "Black";
ironBoxFive.ironBoxType = "Steam";

IronBox ironBoxSix = new IronBox();
ironBoxSix.ironBoxId = 6;
ironBoxSix.ironBoxBrand = "MorphyRichards";
ironBoxSix.ironBoxColor = "White";
ironBoxSix.ironBoxType = "Steam";

IronBox ironBoxSeven = new IronBox();
ironBoxSeven.ironBoxId = 7;
ironBoxSeven.ironBoxBrand = "Panasonic";
ironBoxSeven.ironBoxColor = "Blue";
ironBoxSeven.ironBoxType = "Dry";

IronBox ironBoxEight = new IronBox();
ironBoxEight.ironBoxId = 8;
ironBoxEight.ironBoxBrand = "Orient";
ironBoxEight.ironBoxColor = "Gray";
ironBoxEight.ironBoxType = "Steam";

IronBox ironBoxNine = new IronBox();
ironBoxNine.ironBoxId = 9;
ironBoxNine.ironBoxBrand = "Singer";
ironBoxNine.ironBoxColor = "Black";
ironBoxNine.ironBoxType = "Dry";

IronBox ironBoxTen = new IronBox();
ironBoxTen.ironBoxId = 10;
ironBoxTen.ironBoxBrand = "Inalsa";
ironBoxTen.ironBoxColor = "White";
ironBoxTen.ironBoxType = "Steam";

IronBox ironBoxEleven = new IronBox();
ironBoxEleven.ironBoxId = 11;
ironBoxEleven.ironBoxBrand = "BlackDecker";
ironBoxEleven.ironBoxColor = "Blue";
ironBoxEleven.ironBoxType = "Steam";

IronBox ironBoxTwelve = new IronBox();
ironBoxTwelve.ironBoxId = 12;
ironBoxTwelve.ironBoxBrand = "Kenstar";
ironBoxTwelve.ironBoxColor = "Gray";
ironBoxTwelve.ironBoxType = "Dry";

IronBox ironBoxThirteen = new IronBox();
ironBoxThirteen.ironBoxId = 13;
ironBoxThirteen.ironBoxBrand = "Tefal";
ironBoxThirteen.ironBoxColor = "Black";
ironBoxThirteen.ironBoxType = "Steam";

IronBox ironBoxFourteen = new IronBox();
ironBoxFourteen.ironBoxId = 14;
ironBoxFourteen.ironBoxBrand = "RussellHobbs";
ironBoxFourteen.ironBoxColor = "White";
ironBoxFourteen.ironBoxType = "Dry";

IronBox ironBoxFifteen = new IronBox();
ironBoxFifteen.ironBoxId = 15;
ironBoxFifteen.ironBoxBrand = "Crompton";
ironBoxFifteen.ironBoxColor = "Blue";
ironBoxFifteen.ironBoxType = "Steam";


IronBox ironBoxes[] = new IronBox[15];

ironBoxes[0] = ironBoxOne;
ironBoxes[1] = ironBoxTwo;
ironBoxes[2] = ironBoxThree;
ironBoxes[3] = ironBoxFour;
ironBoxes[4] = ironBoxFive;
ironBoxes[5] = ironBoxSix;
ironBoxes[6] = ironBoxSeven;
ironBoxes[7] = ironBoxEight;
ironBoxes[8] = ironBoxNine;
ironBoxes[9] = ironBoxTen;
ironBoxes[10] = ironBoxEleven;
ironBoxes[11] = ironBoxTwelve;
ironBoxes[12] = ironBoxThirteen;
ironBoxes[13] = ironBoxFourteen;
ironBoxes[14] = ironBoxFifteen;


for(IronBox i : ironBoxes){

System.out.println("the ironbox id is "+i.ironBoxId);
System.out.println("the ironbox brand is "+i.ironBoxBrand);
System.out.println("the ironbox color is "+i.ironBoxColor);
System.out.println("the ironbox type is "+i.ironBoxType);
System.out.println("----------");

}

}
}