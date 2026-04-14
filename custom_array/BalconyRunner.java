class BalconyRunner{
public static void main(String[] args){

Balcony balconyOne = new Balcony();
balconyOne.balconyId = 1;
balconyOne.balconyName = "Front";
balconyOne.balconyColor = "White";
balconyOne.balconyType = "Open";

Balcony balconyTwo = new Balcony();
balconyTwo.balconyId = 2;
balconyTwo.balconyName = "Back";
balconyTwo.balconyColor = "Cream";
balconyTwo.balconyType = "Closed";

Balcony balconyThree = new Balcony();
balconyThree.balconyId = 3;
balconyThree.balconyName = "Side";
balconyThree.balconyColor = "Gray";
balconyThree.balconyType = "Open";

Balcony balconyFour = new Balcony();
balconyFour.balconyId = 4;
balconyFour.balconyName = "Garden";
balconyFour.balconyColor = "White";
balconyFour.balconyType = "Open";

Balcony balconyFive = new Balcony();
balconyFive.balconyId = 5;
balconyFive.balconyName = "Terrace";
balconyFive.balconyColor = "LightGray";
balconyFive.balconyType = "Closed";

Balcony balconySix = new Balcony();
balconySix.balconyId = 6;
balconySix.balconyName = "Living";
balconySix.balconyColor = "White";
balconySix.balconyType = "Open";

Balcony balconySeven = new Balcony();
balconySeven.balconyId = 7;
balconySeven.balconyName = "Bedroom";
balconySeven.balconyColor = "Blue";
balconySeven.balconyType = "Closed";

Balcony balconyEight = new Balcony();
balconyEight.balconyId = 8;
balconyEight.balconyName = "Kitchen";
balconyEight.balconyColor = "Cream";
balconyEight.balconyType = "Open";

Balcony balconyNine = new Balcony();
balconyNine.balconyId = 9;
balconyNine.balconyName = "Hall";
balconyNine.balconyColor = "White";
balconyNine.balconyType = "Closed";

Balcony balconyTen = new Balcony();
balconyTen.balconyId = 10;
balconyTen.balconyName = "Office";
balconyTen.balconyColor = "Gray";
balconyTen.balconyType = "Open";

Balcony balconyEleven = new Balcony();
balconyEleven.balconyId = 11;
balconyEleven.balconyName = "Guest";
balconyEleven.balconyColor = "White";
balconyEleven.balconyType = "Closed";

Balcony balconyTwelve = new Balcony();
balconyTwelve.balconyId = 12;
balconyTwelve.balconyName = "Study";
balconyTwelve.balconyColor = "LightBlue";
balconyTwelve.balconyType = "Open";

Balcony balconyThirteen = new Balcony();
balconyThirteen.balconyId = 13;
balconyThirteen.balconyName = "Corner";
balconyThirteen.balconyColor = "White";
balconyThirteen.balconyType = "Closed";

Balcony balconyFourteen = new Balcony();
balconyFourteen.balconyId = 14;
balconyFourteen.balconyName = "Top";
balconyFourteen.balconyColor = "Gray";
balconyFourteen.balconyType = "Open";

Balcony balconyFifteen = new Balcony();
balconyFifteen.balconyId = 15;
balconyFifteen.balconyName = "Mini";
balconyFifteen.balconyColor = "White";
balconyFifteen.balconyType = "Closed";


Balcony balconies[] = new Balcony[15];

balconies[0] = balconyOne;
balconies[1] = balconyTwo;
balconies[2] = balconyThree;
balconies[3] = balconyFour;
balconies[4] = balconyFive;
balconies[5] = balconySix;
balconies[6] = balconySeven;
balconies[7] = balconyEight;
balconies[8] = balconyNine;
balconies[9] = balconyTen;
balconies[10] = balconyEleven;
balconies[11] = balconyTwelve;
balconies[12] = balconyThirteen;
balconies[13] = balconyFourteen;
balconies[14] = balconyFifteen;


for(Balcony b : balconies){

System.out.println("the balcony id is "+b.balconyId);
System.out.println("the balcony name is "+b.balconyName);
System.out.println("the balcony color is "+b.balconyColor);
System.out.println("the balcony type is "+b.balconyType);
System.out.println("----------");

}

}
}