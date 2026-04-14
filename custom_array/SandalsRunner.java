class SandalsRunner{
public static void main(String[] args){

Sandals sandalsOne = new Sandals();
sandalsOne.sandalsId = 1;
sandalsOne.sandalsBrand = "Bata";
sandalsOne.sandalsColor = "Black";
sandalsOne.sandalsType = "Casual";

Sandals sandalsTwo = new Sandals();
sandalsTwo.sandalsId = 2;
sandalsTwo.sandalsBrand = "Sparx";
sandalsTwo.sandalsColor = "Blue";
sandalsTwo.sandalsType = "Sports";

Sandals sandalsThree = new Sandals();
sandalsThree.sandalsId = 3;
sandalsThree.sandalsBrand = "Puma";
sandalsThree.sandalsColor = "White";
sandalsThree.sandalsType = "Casual";

Sandals sandalsFour = new Sandals();
sandalsFour.sandalsId = 4;
sandalsFour.sandalsBrand = "Adidas";
sandalsFour.sandalsColor = "Black";
sandalsFour.sandalsType = "Sports";

Sandals sandalsFive = new Sandals();
sandalsFive.sandalsId = 5;
sandalsFive.sandalsBrand = "Relaxo";
sandalsFive.sandalsColor = "Brown";
sandalsFive.sandalsType = "Casual";

Sandals sandalsSix = new Sandals();
sandalsSix.sandalsId = 6;
sandalsSix.sandalsBrand = "Liberty";
sandalsSix.sandalsColor = "Black";
sandalsSix.sandalsType = "Formal";

Sandals sandalsSeven = new Sandals();
sandalsSeven.sandalsId = 7;
sandalsSeven.sandalsBrand = "Crocs";
sandalsSeven.sandalsColor = "Blue";
sandalsSeven.sandalsType = "Casual";

Sandals sandalsEight = new Sandals();
sandalsEight.sandalsId = 8;
sandalsEight.sandalsBrand = "Woodland";
sandalsEight.sandalsColor = "Brown";
sandalsEight.sandalsType = "Outdoor";

Sandals sandalsNine = new Sandals();
sandalsNine.sandalsId = 9;
sandalsNine.sandalsBrand = "Nike";
sandalsNine.sandalsColor = "White";
sandalsNine.sandalsType = "Sports";

Sandals sandalsTen = new Sandals();
sandalsTen.sandalsId = 10;
sandalsTen.sandalsBrand = "Paragon";
sandalsTen.sandalsColor = "Black";
sandalsTen.sandalsType = "Casual";

Sandals sandalsEleven = new Sandals();
sandalsEleven.sandalsId = 11;
sandalsEleven.sandalsBrand = "RedTape";
sandalsEleven.sandalsColor = "Brown";
sandalsEleven.sandalsType = "Formal";

Sandals sandalsTwelve = new Sandals();
sandalsTwelve.sandalsId = 12;
sandalsTwelve.sandalsBrand = "Campus";
sandalsTwelve.sandalsColor = "Blue";
sandalsTwelve.sandalsType = "Casual";

Sandals sandalsThirteen = new Sandals();
sandalsThirteen.sandalsId = 13;
sandalsThirteen.sandalsBrand = "Metro";
sandalsThirteen.sandalsColor = "Black";
sandalsThirteen.sandalsType = "Party";

Sandals sandalsFourteen = new Sandals();
sandalsFourteen.sandalsId = 14;
sandalsFourteen.sandalsBrand = "HushPuppies";
sandalsFourteen.sandalsColor = "Brown";
sandalsFourteen.sandalsType = "Formal";

Sandals sandalsFifteen = new Sandals();
sandalsFifteen.sandalsId = 15;
sandalsFifteen.sandalsBrand = "LeeCooper";
sandalsFifteen.sandalsColor = "Tan";
sandalsFifteen.sandalsType = "Casual";


Sandals sandals[] = new Sandals[15];

sandals[0] = sandalsOne;
sandals[1] = sandalsTwo;
sandals[2] = sandalsThree;
sandals[3] = sandalsFour;
sandals[4] = sandalsFive;
sandals[5] = sandalsSix;
sandals[6] = sandalsSeven;
sandals[7] = sandalsEight;
sandals[8] = sandalsNine;
sandals[9] = sandalsTen;
sandals[10] = sandalsEleven;
sandals[11] = sandalsTwelve;
sandals[12] = sandalsThirteen;
sandals[13] = sandalsFourteen;
sandals[14] = sandalsFifteen;


for(Sandals s : sandals){

System.out.println("the sandals id is "+s.sandalsId);
System.out.println("the sandals brand is "+s.sandalsBrand);
System.out.println("the sandals color is "+s.sandalsColor);
System.out.println("the sandals type is "+s.sandalsType);
System.out.println("----------");

}

}
}