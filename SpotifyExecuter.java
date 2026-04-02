class SpotifyExecuter{
	public static void main(String args[]){
		Spotify s = new Spotify();

		boolean added = s.addSong("Arijit Singh", "Tum Hi Ho");
		System.out.println(added);
		added = s.addSong("Shreya Ghoshal", "Sun Raha Hai");
		System.out.println(added);
		added = s.addSong("Sid Sriram", "Samajavaragamana");
		System.out.println(added);
		added = s.addSong("Anirudh", "Why This Kolaveri");
		System.out.println(added);
		added = s.addSong("Atif Aslam", "Jeene Laga Hoon");
		System.out.println(added);
		added = s.addSong("Neha Kakkar", "Dilbar");
		System.out.println(added);
		added = s.addSong("Armaan Malik", "Bol Do Na Zara");
		System.out.println(added);
		added = s.addSong("KK", "Zara Sa");
		System.out.println(added);
		added = s.addSong("Sonu Nigam", "Abhi Mujh Mein Kahin");
		System.out.println(added);
		added = s.addSong("Badshah", "DJ Waley Babu");
		System.out.println(added);

		s.getSongs();
	}
}