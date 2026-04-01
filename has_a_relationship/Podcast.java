class Podcast{

 int podcastId;
 String podcastName;
 String category;
 int totalEpisodes;
 Guest guest;

 public void getPodcastDetails(){

  System.out.println("Podcast Details");
  System.out.println("Podcast Id : " + podcastId);
  System.out.println("Podcast Name : " + podcastName);
  System.out.println("Category : " + category);
  System.out.println("Total Episodes : " + totalEpisodes);

  guest.getGuestDetails();
 }
}