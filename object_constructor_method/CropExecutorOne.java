class CropExecutorOne{
    public static void main(String[] args){
        Season season = new Season();

        season.id = 1202;
        season.type = "Rabi";

        Crop crop = new Crop(season);

        crop.cropId = 2;
        crop.name = "Wheat";

        crop.getCropInfo();
    }
}