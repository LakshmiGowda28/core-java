class Gym{
    String gymName;
    String location;
    Trainer trainer;

    public void getGymDetails(){
        System.out.println("Gym name is " + gymName);
        System.out.println("Location is " + location);
        trainer.getTrainerDetails();
    }
}