class Spotify {

    String songNames[] = new String[10];
    int index;

    public boolean addSong(String song) {

        boolean isSongAdded = false;

        if (index < songNames.length) {

            if (song != null && !song.isEmpty()) {
                songNames[index++] = song;
                isSongAdded = true;
            } else {
                System.out.println(song + " is not valid");
            }

        } else {
            System.out.println("Song list is full");
        }

        return isSongAdded;
    }

    public void getSongs() {

        System.out.println("Spotify Songs are:");

        for (String song : songNames) {
            System.out.println(song);
        }
    }

    public String getSongByName(String songName) {

        String name = null;

        for (String song : songNames) {
            if (song == songName) {
                name = song;
                break;
            }
        }

        if (name == null) {
            System.out.println("Song is not found");
        }

        return name;
    }

    public boolean updateSong(String existingSong, String updatedSong) {

        boolean isUpdated = false;

        for (int i = 0; i < songNames.length; i++) {

            if (songNames[i] == existingSong) {
                songNames[i] = updatedSong;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingSong + " is not found");
        }

        return isUpdated;
    }

    public boolean deleteSong(String songName) {

        boolean isDeleted = false;

        for (int i = 0; i < songNames.length; i++) {

            if (songNames[i] == songName) {
                songNames[i] = null;
                isDeleted = true;
                break;
            }
        }

        if (isDeleted == false) {
            System.out.println(songName + " is not found");
        }

        return isDeleted;
    }
}