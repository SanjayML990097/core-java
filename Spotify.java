class Spotify {
    String artistNames[] = new String[10];
    String songNames[] = new String[10];
    int index;

    public boolean addSong(String artist, String song) {
        boolean isSongAdded = false;
        if (artist != null && !artist.isEmpty() && song != null && !song.isEmpty()) {
            artistNames[index] = artist;
      songNames[index] = song;
            index++;
            isSongAdded = true;
        } else {
            System.out.println("song not added");
        }
        return isSongAdded;
    }

    public boolean updateSong(String oldSong, String newArtist, String newSong) {
        boolean isUpdated = false;

        if (oldSong != null && newArtist != null && newSong != null) {
            for (int i = 0; i < songNames.length; i++) {
                if (songNames[i] != null && songNames[i].equals(oldSong)) {
                    artistNames[i] = newArtist;
        songNames[i] = newSong;
                    isUpdated = true;
                    break;
       }
            }
        }

        if (!isUpdated) {
            System.out.println("song not found for update");
        }

        return isUpdated;
    }

    public boolean deleteSong(String song) {
        boolean isDeleted = false;

        if (song != null) {
            for (int i = 0; i < songNames.length; i++) {
                if (songNames[i] != null && songNames[i].equals(song)) {
                    artistNames[i] = null;
      songNames[i] = null;
                    isDeleted = true;
                    break;
        }
            }
        }

        if (!isDeleted) {
            System.out.println("song not found for delete");
        }

        return isDeleted;
    }

    public void getSongs() {
        System.out.println("the songs in spotify are :");
        for (int i = 0; i < songNames.length; i++) {
            System.out.println(artistNames[i] + " - " + songNames[i]);
        }
    }
}

