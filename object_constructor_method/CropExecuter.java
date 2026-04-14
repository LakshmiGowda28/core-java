class CropExecuter{
	public static void main(String args[]){
	Crop crop = new Crop();
	Season season = new Season();

	crop.season = season;  

	crop.cropId = 1;
	crop.name = "Rice";

	season.id = 1201;
	season.type = "Kharif";

	crop.getCropInfo();
	}
}