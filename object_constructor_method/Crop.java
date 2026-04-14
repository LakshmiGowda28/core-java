class Crop{
    int cropId;
    String name;

    Season season;

    Crop(){}

    Crop(Season season){
        this.season = season;
        System.out.println("Crop constructor called");
    }

    public void createCrop(Season season){
        this.season = season;
        System.out.println("createCrop method called");
    }

    public void getCropInfo(){
        System.out.println("getCropInfo started");
        System.out.println("Crop id is " + cropId);
        System.out.println("Crop name is " + name);
        System.out.println("getCropInfo executed");
    }
}