class PeanutButterRunner{
public static void main(String[] args){

PeanutButter pbOne = new PeanutButter();
pbOne.peanutButterId = 1;
pbOne.peanutButterBrand = "Pintola";
pbOne.peanutButterFlavor = "Classic";
pbOne.peanutButterType = "Crunchy";

PeanutButter pbTwo = new PeanutButter();
pbTwo.peanutButterId = 2;
pbTwo.peanutButterBrand = "Alpino";
pbTwo.peanutButterFlavor = "Chocolate";
pbTwo.peanutButterType = "Smooth";

PeanutButter pbThree = new PeanutButter();
pbThree.peanutButterId = 3;
pbThree.peanutButterBrand = "MyFitness";
pbThree.peanutButterFlavor = "Honey";
pbThree.peanutButterType = "Crunchy";

PeanutButter pbFour = new PeanutButter();
pbFour.peanutButterId = 4;
pbFour.peanutButterBrand = "Sundrop";
pbFour.peanutButterFlavor = "Classic";
pbFour.peanutButterType = "Smooth";

PeanutButter pbFive = new PeanutButter();
pbFive.peanutButterId = 5;
pbFive.peanutButterBrand = "Dr.Oetker";
pbFive.peanutButterFlavor = "Chocolate";
pbFive.peanutButterType = "Smooth";

PeanutButter pbSix = new PeanutButter();
pbSix.peanutButterId = 6;
pbSix.peanutButterBrand = "DiSano";
pbSix.peanutButterFlavor = "Classic";
pbSix.peanutButterType = "Crunchy";

PeanutButter pbSeven = new PeanutButter();
pbSeven.peanutButterId = 7;
pbSeven.peanutButterBrand = "UrbanPlatter";
pbSeven.peanutButterFlavor = "Honey";
pbSeven.peanutButterType = "Smooth";

PeanutButter pbEight = new PeanutButter();
pbEight.peanutButterId = 8;
pbEight.peanutButterBrand = "YogaBar";
pbEight.peanutButterFlavor = "Chocolate";
pbEight.peanutButterType = "Crunchy";

PeanutButter pbNine = new PeanutButter();
pbNine.peanutButterId = 9;
pbNine.peanutButterBrand = "HappyChef";
pbNine.peanutButterFlavor = "Classic";
pbNine.peanutButterType = "Smooth";

PeanutButter pbTen = new PeanutButter();
pbTen.peanutButterId = 10;
pbTen.peanutButterBrand = "Veeba";
pbTen.peanutButterFlavor = "Chocolate";
pbTen.peanutButterType = "Smooth";

PeanutButter pbEleven = new PeanutButter();
pbEleven.peanutButterId = 11;
pbEleven.peanutButterBrand = "NatureLand";
pbEleven.peanutButterFlavor = "Classic";
pbEleven.peanutButterType = "Crunchy";

PeanutButter pbTwelve = new PeanutButter();
pbTwelve.peanutButterId = 12;
pbTwelve.peanutButterBrand = "ProV";
pbTwelve.peanutButterFlavor = "Honey";
pbTwelve.peanutButterType = "Smooth";

PeanutButter pbThirteen = new PeanutButter();
pbThirteen.peanutButterId = 13;
pbThirteen.peanutButterBrand = "MuscleBlaze";
pbThirteen.peanutButterFlavor = "Chocolate";
pbThirteen.peanutButterType = "Crunchy";

PeanutButter pbFourteen = new PeanutButter();
pbFourteen.peanutButterId = 14;
pbFourteen.peanutButterBrand = "TrueElements";
pbFourteen.peanutButterFlavor = "Classic";
pbFourteen.peanutButterType = "Smooth";

PeanutButter pbFifteen = new PeanutButter();
pbFifteen.peanutButterId = 15;
pbFifteen.peanutButterBrand = "Nutty";
pbFifteen.peanutButterFlavor = "Honey";
pbFifteen.peanutButterType = "Crunchy";


PeanutButter peanutButters[] = new PeanutButter[15];

peanutButters[0] = pbOne;
peanutButters[1] = pbTwo;
peanutButters[2] = pbThree;
peanutButters[3] = pbFour;
peanutButters[4] = pbFive;
peanutButters[5] = pbSix;
peanutButters[6] = pbSeven;
peanutButters[7] = pbEight;
peanutButters[8] = pbNine;
peanutButters[9] = pbTen;
peanutButters[10] = pbEleven;
peanutButters[11] = pbTwelve;
peanutButters[12] = pbThirteen;
peanutButters[13] = pbFourteen;
peanutButters[14] = pbFifteen;


for(PeanutButter pb : peanutButters){

System.out.println("the peanut butter id is "+pb.peanutButterId);
System.out.println("the peanut butter brand is "+pb.peanutButterBrand);
System.out.println("the peanut butter flavor is "+pb.peanutButterFlavor);
System.out.println("the peanut butter type is "+pb.peanutButterType);
System.out.println("----------");

}

}
}