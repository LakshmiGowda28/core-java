class Trainer{

 int trainerId;
 String trainerName;
 String specialization;
 int experienceYears;
 boolean isCertified;

 public void getTrainerDetails(){

  System.out.println("Trainer Details");
  System.out.println("Trainer Id : " + trainerId);
  System.out.println("Trainer Name : " + trainerName);
  System.out.println("Specialization : " + specialization);
  System.out.println("Experience : " + experienceYears);
  System.out.println("Certified : " + isCertified);
  System.out.println("---------------------");

 }
}