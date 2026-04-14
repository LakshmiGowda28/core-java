class CropRunner{
	public static void main(String args[]){
	Crop crop = new Crop();
	Season season = new Season();

	season.id = 1203;
	season.type = "Zaid";

	crop.createCrop(season);  
	
	crop.cropId = 3;
	crop.name = "Maize";

	crop.getCropInfo();
	}
}