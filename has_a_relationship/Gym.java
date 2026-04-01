class Gym{

 int gymId;
 String gymName;
 String location;
 int totalMembers;
 Trainer trainer;

 public void getGymDetails(){

  System.out.println("Gym Details");
  System.out.println("Gym Id : " + gymId);
  System.out.println("Gym Name : " + gymName);
  System.out.println("Location : " + location);
  System.out.println("Total Members : " + totalMembers);

  trainer.getTrainerDetails();
 }
}