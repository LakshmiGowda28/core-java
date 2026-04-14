class Morchery{
    int morcheryId;
    String name;

    DeadBody deadBody;

    Morchery(){}

    Morchery(DeadBody deadBody){
        this.deadBody = deadBody;
        System.out.println("Morchery constructor called");
    }

    public void createMorchery(DeadBody deadBody){
        this.deadBody = deadBody;
        System.out.println("createMorchery method called");
    }

    public void getMorcheryInfo(){
        System.out.println("getMorcheryInfo started");
        System.out.println("Morchery id is " + morcheryId);
        System.out.println("Morchery name is " + name);
        System.out.println("getMorcheryInfo executed");
    }
}