class Episode{

 int episodeId;
 String episodeTitle;
 int durationMinutes;
 int episodeNumber;
 boolean isHit;

 public void getEpisodeDetails(){

  System.out.println("Episode Details");
  System.out.println("Episode Id : " + episodeId);
  System.out.println("Episode Title : " + episodeTitle);
  System.out.println("Duration : " + durationMinutes);
  System.out.println("Episode Number : " + episodeNumber);
  System.out.println("Hit : " + isHit);
  System.out.println("-------------------------");

 }
}