class SpeakerRunner{
public static void main(String[] args){

Speaker speakerOne = new Speaker();
speakerOne.speakerId = 1;
speakerOne.speakerBrand = "JBL";
speakerOne.speakerColor = "Black";
speakerOne.speakerType = "Bluetooth";

Speaker speakerTwo = new Speaker();
speakerTwo.speakerId = 2;
speakerTwo.speakerBrand = "Sony";
speakerTwo.speakerColor = "Blue";
speakerTwo.speakerType = "Wireless";

Speaker speakerThree = new Speaker();
speakerThree.speakerId = 3;
speakerThree.speakerBrand = "Boat";
speakerThree.speakerColor = "Black";
speakerThree.speakerType = "Bluetooth";

Speaker speakerFour = new Speaker();
speakerFour.speakerId = 4;
speakerFour.speakerBrand = "Bose";
speakerFour.speakerColor = "Gray";
speakerFour.speakerType = "Home";

Speaker speakerFive = new Speaker();
speakerFive.speakerId = 5;
speakerFive.speakerBrand = "Philips";
speakerFive.speakerColor = "Black";
speakerFive.speakerType = "Wired";

Speaker speakerSix = new Speaker();
speakerSix.speakerId = 6;
speakerSix.speakerBrand = "Mi";
speakerSix.speakerColor = "White";
speakerSix.speakerType = "Bluetooth";

Speaker speakerSeven = new Speaker();
speakerSeven.speakerId = 7;
speakerSeven.speakerBrand = "Zebronics";
speakerSeven.speakerColor = "Black";
speakerSeven.speakerType = "Home";

Speaker speakerEight = new Speaker();
speakerEight.speakerId = 8;
speakerEight.speakerBrand = "Harman";
speakerEight.speakerColor = "Blue";
speakerEight.speakerType = "Wireless";

Speaker speakerNine = new Speaker();
speakerNine.speakerId = 9;
speakerNine.speakerBrand = "Infinity";
speakerNine.speakerColor = "Black";
speakerNine.speakerType = "Bluetooth";

Speaker speakerTen = new Speaker();
speakerTen.speakerId = 10;
speakerTen.speakerBrand = "LG";
speakerTen.speakerColor = "Gray";
speakerTen.speakerType = "Home";

Speaker speakerEleven = new Speaker();
speakerEleven.speakerId = 11;
speakerEleven.speakerBrand = "Samsung";
speakerEleven.speakerColor = "Black";
speakerEleven.speakerType = "Wireless";

Speaker speakerTwelve = new Speaker();
speakerTwelve.speakerId = 12;
speakerTwelve.speakerBrand = "Realme";
speakerTwelve.speakerColor = "Yellow";
speakerTwelve.speakerType = "Bluetooth";

Speaker speakerThirteen = new Speaker();
speakerThirteen.speakerId = 13;
speakerThirteen.speakerBrand = "Portronics";
speakerThirteen.speakerColor = "Blue";
speakerThirteen.speakerType = "Portable";

Speaker speakerFourteen = new Speaker();
speakerFourteen.speakerId = 14;
speakerFourteen.speakerBrand = "Marshall";
speakerFourteen.speakerColor = "Black";
speakerFourteen.speakerType = "Home";

Speaker speakerFifteen = new Speaker();
speakerFifteen.speakerId = 15;
speakerFifteen.speakerBrand = "Skullcandy";
speakerFifteen.speakerColor = "Red";
speakerFifteen.speakerType = "Bluetooth";


Speaker speakers[] = new Speaker[15];

speakers[0] = speakerOne;
speakers[1] = speakerTwo;
speakers[2] = speakerThree;
speakers[3] = speakerFour;
speakers[4] = speakerFive;
speakers[5] = speakerSix;
speakers[6] = speakerSeven;
speakers[7] = speakerEight;
speakers[8] = speakerNine;
speakers[9] = speakerTen;
speakers[10] = speakerEleven;
speakers[11] = speakerTwelve;
speakers[12] = speakerThirteen;
speakers[13] = speakerFourteen;
speakers[14] = speakerFifteen;


for(Speaker speaker : speakers){

System.out.println("the speaker id is "+speaker.speakerId);
System.out.println("the speaker brand is "+speaker.speakerBrand);
System.out.println("the speaker color is "+speaker.speakerColor);
System.out.println("the speaker type is "+speaker.speakerType);
System.out.println("----------");

}

}
}