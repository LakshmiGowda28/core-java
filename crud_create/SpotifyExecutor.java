class SpotifyExecutor{

  public static void main(String[] args){

    Spotify ref = new Spotify();

    boolean added = ref.addSong("Shape of You");
    System.out.println(added);

    added = ref.addSong("Blinding Lights");
    System.out.println(added);

    added = ref.addSong("Believer");
    System.out.println(added);

    added = ref.addSong("Perfect");
    System.out.println(added);

    added = ref.addSong("Senorita");
    System.out.println(added);

    added = ref.addSong("Levitating");
    System.out.println(added);

    added = ref.addSong("Closer");
    System.out.println(added);

    added = ref.addSong("Faded");
    System.out.println(added);

    added = ref.addSong("Thunder");
    System.out.println(added);

    added = ref.addSong("Stay");
    System.out.println(added);

    ref.getSongs();
  }
}