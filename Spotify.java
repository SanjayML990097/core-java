class Spotify{
	String artistNames[] = new String[10];
	String songNames[] = new String[10];
	int index;
	
	public boolean addSong(String artist, String song){
		boolean isSongAdded = false;
		if(artist != null && !artist.isEmpty() && song != null && !song.isEmpty()){
			artistNames[index] = artist;
			songNames[index] = song;
			index++;
			isSongAdded = true;
		}else{
			System.out.println("song not added");
		}
		return isSongAdded;
	}
	
	public void getSongs(){
		System.out.println("the songs in spotify are :");
		for(int i=0; i<songNames.length; i++){
			System.out.println(artistNames[i] + " - " + songNames[i]);
		}
	}
}
