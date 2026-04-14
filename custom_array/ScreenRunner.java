class ScreenRunner{
public static void main(String[] args){

Screen screenOne = new Screen();
screenOne.screenId = 1;
screenOne.screenBrand = "Samsung";
screenOne.screenColor = "Black";
screenOne.screenType = "LED";

Screen screenTwo = new Screen();
screenTwo.screenId = 2;
screenTwo.screenBrand = "LG";
screenTwo.screenColor = "Black";
screenTwo.screenType = "OLED";

Screen screenThree = new Screen();
screenThree.screenId = 3;
screenThree.screenBrand = "Sony";
screenThree.screenColor = "Gray";
screenThree.screenType = "LED";

Screen screenFour = new Screen();
screenFour.screenId = 4;
screenFour.screenBrand = "Dell";
screenFour.screenColor = "Black";
screenFour.screenType = "Monitor";

Screen screenFive = new Screen();
screenFive.screenId = 5;
screenFive.screenBrand = "HP";
screenFive.screenColor = "Black";
screenFive.screenType = "Monitor";

Screen screenSix = new Screen();
screenSix.screenId = 6;
screenSix.screenBrand = "Lenovo";
screenSix.screenColor = "Black";
screenSix.screenType = "LED";

Screen screenSeven = new Screen();
screenSeven.screenId = 7;
screenSeven.screenBrand = "Acer";
screenSeven.screenColor = "Gray";
screenSeven.screenType = "Monitor";

Screen screenEight = new Screen();
screenEight.screenId = 8;
screenEight.screenBrand = "Asus";
screenEight.screenColor = "Black";
screenEight.screenType = "LED";

Screen screenNine = new Screen();
screenNine.screenId = 9;
screenNine.screenBrand = "TCL";
screenNine.screenColor = "Black";
screenNine.screenType = "Smart";

Screen screenTen = new Screen();
screenTen.screenId = 10;
screenTen.screenBrand = "Panasonic";
screenTen.screenColor = "Gray";
screenTen.screenType = "LED";

Screen screenEleven = new Screen();
screenEleven.screenId = 11;
screenEleven.screenBrand = "Realme";
screenEleven.screenColor = "Black";
screenEleven.screenType = "Smart";

Screen screenTwelve = new Screen();
screenTwelve.screenId = 12;
screenTwelve.screenBrand = "Mi";
screenTwelve.screenColor = "Black";
screenTwelve.screenType = "Smart";

Screen screenThirteen = new Screen();
screenThirteen.screenId = 13;
screenThirteen.screenBrand = "OnePlus";
screenThirteen.screenColor = "Gray";
screenThirteen.screenType = "Smart";

Screen screenFourteen = new Screen();
screenFourteen.screenId = 14;
screenFourteen.screenBrand = "ViewSonic";
screenFourteen.screenColor = "Black";
screenFourteen.screenType = "Monitor";

Screen screenFifteen = new Screen();
screenFifteen.screenId = 15;
screenFifteen.screenBrand = "BenQ";
screenFifteen.screenColor = "Black";
screenFifteen.screenType = "LED";


Screen screens[] = new Screen[15];

screens[0] = screenOne;
screens[1] = screenTwo;
screens[2] = screenThree;
screens[3] = screenFour;
screens[4] = screenFive;
screens[5] = screenSix;
screens[6] = screenSeven;
screens[7] = screenEight;
screens[8] = screenNine;
screens[9] = screenTen;
screens[10] = screenEleven;
screens[11] = screenTwelve;
screens[12] = screenThirteen;
screens[13] = screenFourteen;
screens[14] = screenFifteen;


for(Screen s : screens){

System.out.println("the screen id is "+s.screenId);
System.out.println("the screen brand is "+s.screenBrand);
System.out.println("the screen color is "+s.screenColor);
System.out.println("the screen type is "+s.screenType);
System.out.println("----------");

}

}
}