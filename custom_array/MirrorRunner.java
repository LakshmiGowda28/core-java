class MirrorRunner{
public static void main(String[] args){

Mirror mirrorOne = new Mirror();
mirrorOne.mirrorId = 1;
mirrorOne.mirrorBrand = "SaintGobain";
mirrorOne.mirrorColor = "Silver";
mirrorOne.mirrorType = "Wall";

Mirror mirrorTwo = new Mirror();
mirrorTwo.mirrorId = 2;
mirrorTwo.mirrorBrand = "Ikea";
mirrorTwo.mirrorColor = "White";
mirrorTwo.mirrorType = "Standing";

Mirror mirrorThree = new Mirror();
mirrorThree.mirrorId = 3;
mirrorThree.mirrorBrand = "HomeCentre";
mirrorThree.mirrorColor = "Black";
mirrorThree.mirrorType = "Wall";

Mirror mirrorFour = new Mirror();
mirrorFour.mirrorId = 4;
mirrorFour.mirrorBrand = "UrbanLadder";
mirrorFour.mirrorColor = "Brown";
mirrorFour.mirrorType = "WoodFrame";

Mirror mirrorFive = new Mirror();
mirrorFive.mirrorId = 5;
mirrorFive.mirrorBrand = "Durian";
mirrorFive.mirrorColor = "Gold";
mirrorFive.mirrorType = "Decor";

Mirror mirrorSix = new Mirror();
mirrorSix.mirrorId = 6;
mirrorSix.mirrorBrand = "Godrej";
mirrorSix.mirrorColor = "Silver";
mirrorSix.mirrorType = "Wall";

Mirror mirrorSeven = new Mirror();
mirrorSeven.mirrorId = 7;
mirrorSeven.mirrorBrand = "Nilkamal";
mirrorSeven.mirrorColor = "Black";
mirrorSeven.mirrorType = "Standing";

Mirror mirrorEight = new Mirror();
mirrorEight.mirrorId = 8;
mirrorEight.mirrorBrand = "Pepperfry";
mirrorEight.mirrorColor = "Brown";
mirrorEight.mirrorType = "Decor";

Mirror mirrorNine = new Mirror();
mirrorNine.mirrorId = 9;
mirrorNine.mirrorBrand = "Spacewood";
mirrorNine.mirrorColor = "White";
mirrorNine.mirrorType = "Wall";

Mirror mirrorTen = new Mirror();
mirrorTen.mirrorId = 10;
mirrorTen.mirrorBrand = "Hometown";
mirrorTen.mirrorColor = "Gray";
mirrorTen.mirrorType = "Decor";

Mirror mirrorEleven = new Mirror();
mirrorEleven.mirrorId = 11;
mirrorEleven.mirrorBrand = "RoyalOak";
mirrorEleven.mirrorColor = "Brown";
mirrorEleven.mirrorType = "WoodFrame";

Mirror mirrorTwelve = new Mirror();
mirrorTwelve.mirrorId = 12;
mirrorTwelve.mirrorBrand = "Evok";
mirrorTwelve.mirrorColor = "Silver";
mirrorTwelve.mirrorType = "Wall";

Mirror mirrorThirteen = new Mirror();
mirrorThirteen.mirrorId = 13;
mirrorThirteen.mirrorBrand = "FabIndia";
mirrorThirteen.mirrorColor = "Gold";
mirrorThirteen.mirrorType = "Decor";

Mirror mirrorFourteen = new Mirror();
mirrorFourteen.mirrorId = 14;
mirrorFourteen.mirrorBrand = "HomeTown";
mirrorFourteen.mirrorColor = "Black";
mirrorFourteen.mirrorType = "Standing";

Mirror mirrorFifteen = new Mirror();
mirrorFifteen.mirrorId = 15;
mirrorFifteen.mirrorBrand = "Urban";
mirrorFifteen.mirrorColor = "White";
mirrorFifteen.mirrorType = "Wall";


Mirror mirrors[] = new Mirror[15];

mirrors[0] = mirrorOne;
mirrors[1] = mirrorTwo;
mirrors[2] = mirrorThree;
mirrors[3] = mirrorFour;
mirrors[4] = mirrorFive;
mirrors[5] = mirrorSix;
mirrors[6] = mirrorSeven;
mirrors[7] = mirrorEight;
mirrors[8] = mirrorNine;
mirrors[9] = mirrorTen;
mirrors[10] = mirrorEleven;
mirrors[11] = mirrorTwelve;
mirrors[12] = mirrorThirteen;
mirrors[13] = mirrorFourteen;
mirrors[14] = mirrorFifteen;


for(Mirror m : mirrors){

System.out.println("the mirror id is "+m.mirrorId);
System.out.println("the mirror brand is "+m.mirrorBrand);
System.out.println("the mirror color is "+m.mirrorColor);
System.out.println("the mirror type is "+m.mirrorType);
System.out.println("----------");

}

}
}