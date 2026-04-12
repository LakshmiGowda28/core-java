class SpotifyExecutor{

  public static void main(String[] args){

    Spotify s = new Spotify();

    boolean added = s.addSong("Shape of You");
    System.out.println(added);

    added = s.addSong("Blinding Lights");
    System.out.println(added);

    added = s.addSong("Believer");
    System.out.println(added);

    added = s.addSong("Perfect");
    System.out.println(added);

    added = s.addSong("Senorita");
    System.out.println(added);

    added = s.addSong("Levitating");
    System.out.println(added);

    added = s.addSong("Closer");
    System.out.println(added);

    added = s.addSong("Faded");
    System.out.println(added);

    added = s.addSong("Thunder");
    System.out.println(added);

    added = s.addSong("Stay");
    System.out.println(added);

    s.getSongs();
	

String song = s.getSongByName("Shape of You");
System.out.println("Song name is available");

s.updateSong("Believer", "Believer Remix");
System.out.println("Song name is updated");

s.deleteSong("Thunder");
System.out.println("Song name is deleted");	

s.getSongs();
	
  }
}