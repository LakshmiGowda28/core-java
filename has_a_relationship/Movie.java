class Movie{

 int movieId;
 String movieName;
 String language;
 double budget;
 Actor actor;

 public void getMovieDetails(){

  System.out.println("Movie Details");
  System.out.println("Movie Id : " + movieId);
  System.out.println("Movie Name : " + movieName);
  System.out.println("Language : " + language);
  System.out.println("Budget : " + budget);

  actor.getActorDetails();
 }
}