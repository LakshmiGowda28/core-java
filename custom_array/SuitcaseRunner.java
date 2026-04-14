class SuitcaseRunner{
public static void main(String[] args){

Suitcase suitcaseOne = new Suitcase();
suitcaseOne.suitcaseId = 1;
suitcaseOne.suitcaseBrand = "VIP";
suitcaseOne.suitcaseColor = "Black";
suitcaseOne.suitcaseType = "Hard";

Suitcase suitcaseTwo = new Suitcase();
suitcaseTwo.suitcaseId = 2;
suitcaseTwo.suitcaseBrand = "Safari";
suitcaseTwo.suitcaseColor = "Blue";
suitcaseTwo.suitcaseType = "Soft";

Suitcase suitcaseThree = new Suitcase();
suitcaseThree.suitcaseId = 3;
suitcaseThree.suitcaseBrand = "Skybags";
suitcaseThree.suitcaseColor = "Gray";
suitcaseThree.suitcaseType = "Hard";

Suitcase suitcaseFour = new Suitcase();
suitcaseFour.suitcaseId = 4;
suitcaseFour.suitcaseBrand = "AmericanTourister";
suitcaseFour.suitcaseColor = "Red";
suitcaseFour.suitcaseType = "Hard";

Suitcase suitcaseFive = new Suitcase();
suitcaseFive.suitcaseId = 5;
suitcaseFive.suitcaseBrand = "Wildcraft";
suitcaseFive.suitcaseColor = "Black";
suitcaseFive.suitcaseType = "Soft";

Suitcase suitcaseSix = new Suitcase();
suitcaseSix.suitcaseId = 6;
suitcaseSix.suitcaseBrand = "Aristocrat";
suitcaseSix.suitcaseColor = "Blue";
suitcaseSix.suitcaseType = "Hard";

Suitcase suitcaseSeven = new Suitcase();
suitcaseSeven.suitcaseId = 7;
suitcaseSeven.suitcaseBrand = "Delsey";
suitcaseSeven.suitcaseColor = "Brown";
suitcaseSeven.suitcaseType = "Hard";

Suitcase suitcaseEight = new Suitcase();
suitcaseEight.suitcaseId = 8;
suitcaseEight.suitcaseBrand = "Samsonite";
suitcaseEight.suitcaseColor = "Black";
suitcaseEight.suitcaseType = "Hard";

Suitcase suitcaseNine = new Suitcase();
suitcaseNine.suitcaseId = 9;
suitcaseNine.suitcaseBrand = "Lavie";
suitcaseNine.suitcaseColor = "Pink";
suitcaseNine.suitcaseType = "Soft";

Suitcase suitcaseTen = new Suitcase();
suitcaseTen.suitcaseId = 10;
suitcaseTen.suitcaseBrand = "ITLuggage";
suitcaseTen.suitcaseColor = "Gray";
suitcaseTen.suitcaseType = "Hard";

Suitcase suitcaseEleven = new Suitcase();
suitcaseEleven.suitcaseId = 11;
suitcaseEleven.suitcaseBrand = "UrbanForest";
suitcaseEleven.suitcaseColor = "Black";
suitcaseEleven.suitcaseType = "Soft";

Suitcase suitcaseTwelve = new Suitcase();
suitcaseTwelve.suitcaseId = 12;
suitcaseTwelve.suitcaseBrand = "Carlton";
suitcaseTwelve.suitcaseColor = "Blue";
suitcaseTwelve.suitcaseType = "Hard";

Suitcase suitcaseThirteen = new Suitcase();
suitcaseThirteen.suitcaseId = 13;
suitcaseThirteen.suitcaseBrand = "NasherMiles";
suitcaseThirteen.suitcaseColor = "Yellow";
suitcaseThirteen.suitcaseType = "Hard";

Suitcase suitcaseFourteen = new Suitcase();
suitcaseFourteen.suitcaseId = 14;
suitcaseFourteen.suitcaseBrand = "Tripp";
suitcaseFourteen.suitcaseColor = "Silver";
suitcaseFourteen.suitcaseType = "Hard";

Suitcase suitcaseFifteen = new Suitcase();
suitcaseFifteen.suitcaseId = 15;
suitcaseFifteen.suitcaseBrand = "AmazonBasics";
suitcaseFifteen.suitcaseColor = "Black";
suitcaseFifteen.suitcaseType = "Hard";


Suitcase suitcases[] = new Suitcase[15];

suitcases[0] = suitcaseOne;
suitcases[1] = suitcaseTwo;
suitcases[2] = suitcaseThree;
suitcases[3] = suitcaseFour;
suitcases[4] = suitcaseFive;
suitcases[5] = suitcaseSix;
suitcases[6] = suitcaseSeven;
suitcases[7] = suitcaseEight;
suitcases[8] = suitcaseNine;
suitcases[9] = suitcaseTen;
suitcases[10] = suitcaseEleven;
suitcases[11] = suitcaseTwelve;
suitcases[12] = suitcaseThirteen;
suitcases[13] = suitcaseFourteen;
suitcases[14] = suitcaseFifteen;


for(Suitcase suitcase : suitcases){

System.out.println("the suitcase id is "+suitcase.suitcaseId);
System.out.println("the suitcase brand is "+suitcase.suitcaseBrand);
System.out.println("the suitcase color is "+suitcase.suitcaseColor);
System.out.println("the suitcase type is "+suitcase.suitcaseType);
System.out.println("----------");

}

}
}