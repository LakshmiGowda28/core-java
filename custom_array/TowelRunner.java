class TowelRunner{
public static void main(String[] args){

Towel towelOne = new Towel();
towelOne.towelId = 1;
towelOne.towelBrand = "BombayDyeing";
towelOne.towelColor = "White";
towelOne.towelType = "Cotton";

Towel towelTwo = new Towel();
towelTwo.towelId = 2;
towelTwo.towelBrand = "Raymond";
towelTwo.towelColor = "Blue";
towelTwo.towelType = "Cotton";

Towel towelThree = new Towel();
towelThree.towelId = 3;
towelThree.towelBrand = "Trident";
towelThree.towelColor = "Pink";
towelThree.towelType = "Soft";

Towel towelFour = new Towel();
towelFour.towelId = 4;
towelFour.towelBrand = "Spaces";
towelFour.towelColor = "Green";
towelFour.towelType = "Cotton";

Towel towelFive = new Towel();
towelFive.towelId = 5;
towelFive.towelBrand = "Welspun";
towelFive.towelColor = "Yellow";
towelFive.towelType = "Soft";

Towel towelSix = new Towel();
towelSix.towelId = 6;
towelSix.towelBrand = "HomeCentre";
towelSix.towelColor = "White";
towelSix.towelType = "Cotton";

Towel towelSeven = new Towel();
towelSeven.towelId = 7;
towelSeven.towelBrand = "DDecor";
towelSeven.towelColor = "Blue";
towelSeven.towelType = "Soft";

Towel towelEight = new Towel();
towelEight.towelId = 8;
towelEight.towelBrand = "Portico";
towelEight.towelColor = "Gray";
towelEight.towelType = "Cotton";

Towel towelNine = new Towel();
towelNine.towelId = 9;
towelNine.towelBrand = "StoryHome";
towelNine.towelColor = "Pink";
towelNine.towelType = "Soft";

Towel towelTen = new Towel();
towelTen.towelId = 10;
towelTen.towelBrand = "Marks";
towelTen.towelColor = "White";
towelTen.towelType = "Cotton";

Towel towelEleven = new Towel();
towelEleven.towelId = 11;
towelEleven.towelBrand = "ZaraHome";
towelEleven.towelColor = "Brown";
towelEleven.towelType = "Soft";

Towel towelTwelve = new Towel();
towelTwelve.towelId = 12;
towelTwelve.towelBrand = "Ikea";
towelTwelve.towelColor = "Blue";
towelTwelve.towelType = "Cotton";

Towel towelThirteen = new Towel();
towelThirteen.towelId = 13;
towelThirteen.towelBrand = "Hokipo";
towelThirteen.towelColor = "Purple";
towelThirteen.towelType = "Soft";

Towel towelFourteen = new Towel();
towelFourteen.towelId = 14;
towelFourteen.towelBrand = "AmazonBasics";
towelFourteen.towelColor = "White";
towelFourteen.towelType = "Cotton";

Towel towelFifteen = new Towel();
towelFifteen.towelId = 15;
towelFifteen.towelBrand = "Miniso";
towelFifteen.towelColor = "SkyBlue";
towelFifteen.towelType = "Soft";


Towel towels[] = new Towel[15];

towels[0] = towelOne;
towels[1] = towelTwo;
towels[2] = towelThree;
towels[3] = towelFour;
towels[4] = towelFive;
towels[5] = towelSix;
towels[6] = towelSeven;
towels[7] = towelEight;
towels[8] = towelNine;
towels[9] = towelTen;
towels[10] = towelEleven;
towels[11] = towelTwelve;
towels[12] = towelThirteen;
towels[13] = towelFourteen;
towels[14] = towelFifteen;


for(Towel towel : towels){

System.out.println("the towel id is "+towel.towelId);
System.out.println("the towel brand is "+towel.towelBrand);
System.out.println("the towel color is "+towel.towelColor);
System.out.println("the towel type is "+towel.towelType);
System.out.println("----------");

}

}
}