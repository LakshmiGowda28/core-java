class WallRunner {
    public static void main(String[] args){
	
	Wall wallOne = new Wall();
	wallOne.wallId = 1;
	wallOne.wallName = "Living";
	wallOne.wallColor = "White";
	wallOne.wallType = "Interior";

	Wall wallTwo = new Wall();
	wallTwo.wallId = 2;
	wallTwo.wallName = "Bedroom";
	wallTwo.wallColor = "Blue";
	wallTwo.wallType = "Interior";

	Wall wallThree = new Wall();
	wallThree.wallId = 3;
	wallThree.wallName = "Kitchen";
	wallThree.wallColor = "Yellow";
	wallThree.wallType = "Interior";

	Wall wallFour = new Wall();
	wallFour.wallId = 4;
	wallFour.wallName = "Bathroom";
	wallFour.wallColor = "SkyBlue";
	wallFour.wallType = "Interior";

	Wall wallFive = new Wall();
	wallFive.wallId = 5;
	wallFive.wallName = "Hall";
	wallFive.wallColor = "Cream";
	wallFive.wallType = "Interior";

	Wall wallSix = new Wall();
	wallSix.wallId = 6;
	wallSix.wallName = "Pooja";
	wallSix.wallColor = "LightYellow";
	wallSix.wallType = "Interior";

	Wall wallSeven = new Wall();
	wallSeven.wallId = 7;
	wallSeven.wallName = "Stairs";
	wallSeven.wallColor = "Brown";
	wallSeven.wallType = "Interior";

	Wall wallEight = new Wall();
	wallEight.wallId = 8;
	wallEight.wallName = "Balcony";
	wallEight.wallColor = "White";
	wallEight.wallType = "Exterior";

	Wall wallNine = new Wall();
	wallNine.wallId = 9;
	wallNine.wallName = "Compound";
	wallNine.wallColor = "Gray";
	wallNine.wallType = "Exterior";

	Wall wallTen = new Wall();
	wallTen.wallId = 10;
	wallTen.wallName = "Parking";
	wallTen.wallColor = "DarkGray";
	wallTen.wallType = "Exterior";

	Wall wallEleven = new Wall();
	wallEleven.wallId = 11;
	wallEleven.wallName = "Garden";
	wallEleven.wallColor = "Green";
	wallEleven.wallType = "Exterior";

	Wall wallTwelve = new Wall();
	wallTwelve.wallId = 12;
	wallTwelve.wallName = "Office";
	wallTwelve.wallColor = "White";
	wallTwelve.wallType = "Interior";

	Wall wallThirteen = new Wall();
	wallThirteen.wallId = 13;
	wallThirteen.wallName = "Study";
	wallThirteen.wallColor = "LightBlue";
	wallThirteen.wallType = "Interior";

	Wall wallFourteen = new Wall();
	wallFourteen.wallId = 14;
	wallFourteen.wallName = "Guest";
	wallFourteen.wallColor = "Pink";
	wallFourteen.wallType = "Interior";

	Wall wallFifteen = new Wall();
	wallFifteen.wallId = 15;
	wallFifteen.wallName = "Terrace";
	wallFifteen.wallColor = "White";
	wallFifteen.wallType = "Exterior";

	Wall walls[] = new Wall[15];

	walls[0] = wallOne;
	walls[1] = wallTwo;
	walls[2] = wallThree;
	walls[3] = wallFour;
	walls[4] = wallFive;
	walls[5] = wallSix;
	walls[6] = wallSeven;
	walls[7] = wallEight;
	walls[8] = wallNine;
	walls[9] = wallTen;
	walls[10] = wallEleven;
	walls[11] = wallTwelve;
	walls[12] = wallThirteen;
	walls[13] = wallFourteen;
	walls[14] = wallFifteen;

	for(Wall wall : walls){

		System.out.println("the wall ID is"+wall.wallId);
		System.out.println("the wall name is"+wall.wallName);
		System.out.println("the wall color is"+wall.wallColor);
		System.out.println("the wall type is"+wall.wallType);
		System.out.println("---------");
	}
}
}