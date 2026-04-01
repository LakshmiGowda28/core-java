class Series{

 int seriesId;
 String seriesName;
 String genre;
 int totalSeasons;
 Episode episode;

 public void getSeriesDetails(){

  System.out.println("Series Details");
  System.out.println("Series Id : " + seriesId);
  System.out.println("Series Name : " + seriesName);
  System.out.println("Genre : " + genre);
  System.out.println("Total Seasons : " + totalSeasons);

  episode.getEpisodeDetails();
 }
}