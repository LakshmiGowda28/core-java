class Garden{
    int gardenId;
    String name;

    Flower flower;

    Garden(){}

    Garden(Flower flower){
        this.flower = flower;
        System.out.println("Garden constructor called");
    }

    public void createGarden(Flower flower){
        this.flower = flower;
        System.out.println("createGarden method called");
    }

    public void getGardenInfo(){
        System.out.println("getGardenInfo started");
        System.out.println("Garden id is " + gardenId);
        System.out.println("Garden name is " + name);
        System.out.println("getGardenInfo executed");
    }
}