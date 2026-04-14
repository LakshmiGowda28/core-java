class PlantsRunner{
public static void main(String[] args){

Plants plantOne = new Plants();
plantOne.plantId = 1;
plantOne.plantName = "Rose";
plantOne.plantColor = "Red";
plantOne.plantType = "Flower";

Plants plantTwo = new Plants();
plantTwo.plantId = 2;
plantTwo.plantName = "Tulsi";
plantTwo.plantColor = "Green";
plantTwo.plantType = "Medicinal";

Plants plantThree = new Plants();
plantThree.plantId = 3;
plantThree.plantName = "Sunflower";
plantThree.plantColor = "Yellow";
plantThree.plantType = "Flower";

Plants plantFour = new Plants();
plantFour.plantId = 4;
plantFour.plantName = "AloeVera";
plantFour.plantColor = "Green";
plantFour.plantType = "Medicinal";

Plants plantFive = new Plants();
plantFive.plantId = 5;
plantFive.plantName = "Lily";
plantFive.plantColor = "White";
plantFive.plantType = "Flower";

Plants plantSix = new Plants();
plantSix.plantId = 6;
plantSix.plantName = "MoneyPlant";
plantSix.plantColor = "Green";
plantSix.plantType = "Indoor";

Plants plantSeven = new Plants();
plantSeven.plantId = 7;
plantSeven.plantName = "Jasmine";
plantSeven.plantColor = "White";
plantSeven.plantType = "Flower";

Plants plantEight = new Plants();
plantEight.plantId = 8;
plantEight.plantName = "Neem";
plantEight.plantColor = "Green";
plantEight.plantType = "Tree";

Plants plantNine = new Plants();
plantNine.plantId = 9;
plantNine.plantName = "Bamboo";
plantNine.plantColor = "Green";
plantNine.plantType = "Indoor";

Plants plantTen = new Plants();
plantTen.plantId = 10;
plantTen.plantName = "Hibiscus";
plantTen.plantColor = "Red";
plantTen.plantType = "Flower";

Plants plantEleven = new Plants();
plantEleven.plantId = 11;
plantEleven.plantName = "Cactus";
plantEleven.plantColor = "Green";
plantEleven.plantType = "Desert";

Plants plantTwelve = new Plants();
plantTwelve.plantId = 12;
plantTwelve.plantName = "Lotus";
plantTwelve.plantColor = "Pink";
plantTwelve.plantType = "Water";

Plants plantThirteen = new Plants();
plantThirteen.plantId = 13;
plantThirteen.plantName = "Mint";
plantThirteen.plantColor = "Green";
plantThirteen.plantType = "Herb";

Plants plantFourteen = new Plants();
plantFourteen.plantId = 14;
plantFourteen.plantName = "CurryLeaf";
plantFourteen.plantColor = "Green";
plantFourteen.plantType = "Herb";

Plants plantFifteen = new Plants();
plantFifteen.plantId = 15;
plantFifteen.plantName = "Orchid";
plantFifteen.plantColor = "Purple";
plantFifteen.plantType = "Flower";


Plants plants[] = new Plants[15];

plants[0] = plantOne;
plants[1] = plantTwo;
plants[2] = plantThree;
plants[3] = plantFour;
plants[4] = plantFive;
plants[5] = plantSix;
plants[6] = plantSeven;
plants[7] = plantEight;
plants[8] = plantNine;
plants[9] = plantTen;
plants[10] = plantEleven;
plants[11] = plantTwelve;
plants[12] = plantThirteen;
plants[13] = plantFourteen;
plants[14] = plantFifteen;


for(Plants p : plants){

System.out.println("the plant id is "+p.plantId);
System.out.println("the plant name is "+p.plantName);
System.out.println("the plant color is "+p.plantColor);
System.out.println("the plant type is "+p.plantType);
System.out.println("----------");

}

}
}