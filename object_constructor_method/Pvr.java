class Pvr{
    int pvrId;
    String location;

    Screen screen;

    Pvr(){}

    Pvr(Screen screen){
        this.screen = screen;
        System.out.println("Pvr constructor called");
    }

    public void createPvr(Screen screen){
        this.screen = screen;
        System.out.println("createPvr method called");
    }

    public void getPvrInfo(){
        System.out.println("getPvrInfo started");
        System.out.println("Pvr id is " + pvrId);
        System.out.println("Pvr location is " + location);
        System.out.println("getPvrInfo executed");
    }
}