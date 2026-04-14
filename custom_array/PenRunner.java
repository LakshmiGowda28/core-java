class PenRunner{
public static void main(String[] args){

Pen penOne = new Pen();
penOne.penId = 1;
penOne.penBrand = "Cello";
penOne.penColor = "Blue";
penOne.penType = "Ball";

Pen penTwo = new Pen();
penTwo.penId = 2;
penTwo.penBrand = "Reynolds";
penTwo.penColor = "Black";
penTwo.penType = "Gel";

Pen penThree = new Pen();
penThree.penId = 3;
penThree.penBrand = "Parker";
penThree.penColor = "Blue";
penThree.penType = "Ink";

Pen penFour = new Pen();
penFour.penId = 4;
penFour.penBrand = "Flair";
penFour.penColor = "Red";
penFour.penType = "Ball";

Pen penFive = new Pen();
penFive.penId = 5;
penFive.penBrand = "Classmate";
penFive.penColor = "Blue";
penFive.penType = "Gel";

Pen penSix = new Pen();
penSix.penId = 6;
penSix.penBrand = "Linc";
penSix.penColor = "Black";
penSix.penType = "Ball";

Pen penSeven = new Pen();
penSeven.penId = 7;
penSeven.penBrand = "Lexi";
penSeven.penColor = "Blue";
penSeven.penType = "Gel";

Pen penEight = new Pen();
penEight.penId = 8;
penEight.penBrand = "Pentonic";
penEight.penColor = "Black";
penEight.penType = "Gel";

Pen penNine = new Pen();
penNine.penId = 9;
penNine.penBrand = "Trimax";
penNine.penColor = "Blue";
penNine.penType = "Ink";

Pen penTen = new Pen();
penTen.penId = 10;
penTen.penBrand = "Hauser";
penTen.penColor = "Black";
penTen.penType = "Ball";

Pen penEleven = new Pen();
penEleven.penId = 11;
penEleven.penBrand = "Rorito";
penEleven.penColor = "Blue";
penEleven.penType = "Gel";

Pen penTwelve = new Pen();
penTwelve.penId = 12;
penTwelve.penBrand = "Faber";
penTwelve.penColor = "Black";
penTwelve.penType = "Ink";

Pen penThirteen = new Pen();
penThirteen.penId = 13;
penThirteen.penBrand = "Add";
penThirteen.penColor = "Blue";
penThirteen.penType = "Ball";

Pen penFourteen = new Pen();
penFourteen.penId = 14;
penFourteen.penBrand = "PinPoint";
penFourteen.penColor = "Black";
penFourteen.penType = "Gel";

Pen penFifteen = new Pen();
penFifteen.penId = 15;
penFifteen.penBrand = "Butterflow";
penFifteen.penColor = "Blue";
penFifteen.penType = "Ball";


Pen pens[] = new Pen[15];

pens[0] = penOne;
pens[1] = penTwo;
pens[2] = penThree;
pens[3] = penFour;
pens[4] = penFive;
pens[5] = penSix;
pens[6] = penSeven;
pens[7] = penEight;
pens[8] = penNine;
pens[9] = penTen;
pens[10] = penEleven;
pens[11] = penTwelve;
pens[12] = penThirteen;
pens[13] = penFourteen;
pens[14] = penFifteen;


for(Pen pen : pens){

System.out.println("the pen id is "+pen.penId);
System.out.println("the pen brand is "+pen.penBrand);
System.out.println("the pen color is "+pen.penColor);
System.out.println("the pen type is "+pen.penType);
System.out.println("----------");

}

}
}