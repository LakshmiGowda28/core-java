class Freelancer{

 int freelancerId;
 String freelancerName;
 String skill;
 double hourlyRate;
 Client client;

 public void getFreelancerDetails(){

  System.out.println("Freelancer Details");
  System.out.println("Freelancer Id : " + freelancerId);
  System.out.println("Freelancer Name : " + freelancerName);
  System.out.println("Skill : " + skill);
  System.out.println("Hourly Rate : " + hourlyRate);

  client.getClientDetails();
 }
}