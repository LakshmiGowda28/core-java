class Spotify{

String songNames[] = new String[10];
int index;

public boolean addSong(String song){
boolean isSongAdded = false;

    if(index < songNames.length){
    if(song != null && !song.isEmpty()){

        songNames[index++] = song;
        isSongAdded = true;
    }
    else
    System.out.println(song + " is not valid");
    }
    else
    System.out.println("Song list is full");

    return isSongAdded;
  }

public void getSongs(){
System.out.println("Spotify Songs are:");
    for(String song : songNames)
    System.out.println(song);
    
  }

}