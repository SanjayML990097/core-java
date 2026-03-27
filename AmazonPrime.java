class AmazonPrime {
	
       static String ottName = "Amazon Prime";

       static String kannadaSeries[] = {
            "Loose Connection","Humble Politician Nograj","Gaalipata Series","By Mistake","Love You Abhi","Campus Kahani",
            "Bengaluru Diaries","Kannada Crime Files","Metro Stories","Silicon City Nights",
            "Mysuru Mysteries","Karavali Chronicles","Namma Ooru","Startup Kannada","Royal Blood",
            "Naadu Kathegalu","City Detectives","Village Tales","Kannada Thrillers","Rajya Rahasya",
            "Bengaluru 560001","Naadina Nayaka","Katha Sangraha","Tech Park","Marali Baa",
            "Police File","Kannada Web Show","Drama Junction","Weekend Stories","Janamana"
        };

        static String englishSeries[] = {
            "The Boys","Reacher","Jack Ryan","The Marvelous Mrs Maisel","The Man in the High Castle",
            "Good Omens","Upload","Hunters","Fleabag","Invincible",
            "Outer Range","The Expanse","Bosch","Carnival Row","Homecoming",
            "Modern Love","Citadel","The Wheel of Time","Gen V","The Terminal List",
            "Tales from the Loop","Night Sky","Patriot","Forever","Sneaky Pete",
            "The Wilds","Utopia","Absentia","Truth Seekers","Clarkson Farm"
        };

       static  String hindiSeries[] = {
            "Mirzapur","The Family Man","Paatal Lok","Farzi","Made in Heaven",
            "Bandish Bandits","Breathe","Inside Edge","Mumbai Diaries","Panchayat",
            "Hostel Daze","Guilty Minds","Rasbhari","Tandav","Modern Love Mumbai",
            "Four More Shots","Comicstaan","Jubilee","Dahaad","Call Me Bae",
            "Campus Beats","Crash Course","Laakhon Mein Ek","The Forgotten Army","Hush Hush",
            "Happy Family","Trial by Fire","Suzhal Hindi","Indian Police Force","Rainbow Rishta"
        };

       static  String tamilSeries[] = {
            "Suzhal","The Village","Vadhandhi","Modern Love Chennai","Inspector Rishi",
            "Time Enna Boss","Paper Rocket","Iru Dhuruvam","November Story","Navarasa",
            "Queen","Auto Shankar","Vella Raja","High Priestess","Live Telecast",
            "PUBGOA","Anantham","Addham","Sengalam","Label",
            "Story of Things","Fall","Ayali","Tamil Chronicles","Metro Crime",
            "Chutney Sambar","Office Tamil","Kana Kaanum","As I Am Suffering","Thalaimai"
        };

       static String teluguSeries[] = {
            "The Family Man Telugu","Mirzapur Telugu","Panchayat Telugu","Newsense","Modern Love Hyderabad",
            "Agent Anand","Kudi Yedamaithe","Unheard","Locked","3 Roses",
            "Mansion 24","ATM","Parampara","Loser","Sin",
            "Meet Cute","Jhansi","Dayaa","Recce","Telugu Crime Files",
            "Vyavastha","Oka Chinna Family Story","Puli Meka","Highway","Bhamakalapam",
            "Save the Tigers","Dhootha","Aha Naa Pellanta","Kudi Right","Gaalivaana"
        };

      static  String malayalamSeries[] = {
            "Kerala Crime Files","The Village Malayalam","Modern Love Kochi","Masterpeace","Perilloor Premier League",
            "Jai Mahendran","Oru Chiri Iru Chiri","Average Ambili","Instagraamam","Meow Series",
            "Family Web","Malayali Detectives","Curry and Cyanide","The Last Page","Godman",
            "Monsoon Stories","Backwaters","Thrissur Files","Kochi Diaries","Metro Malayali",
            "Campus Malayalam","Village 24","Crime Story","Nerariyan","Home Series",
            "Police Station","Coastal Tales","City Nights","Mollywood Hub","2018 Series"
        };
    public static void main(String[] args) {
			System.out.println("ihe OTT name is :" + ottName);
				System.out.println("the series list are:");
				getkannadaSeries();
				getenglishSeries();
				gethindiSeries();
				gettamilSeries();
				gettelguSeries();
				getmalyalamSeries();
		}
		
		
		public static void getkannadaSeries(){
			for(String kannadaserie : kannadaSeries){
				System.out.println(kannadaserie);
			}
		}
		
		
		public static void getenglishSeries(){
			for(String englishserie:englishSeries){
				System.out.println(englishserie);
			}
		}
		
		
		public static void gethindiSeries(){
			for(String hindiserie:hindiSeries){
				System.out.println(hindiserie);
			}
		}
		
		
		public static void gettamilSeries(){
			for(String tamilserie:tamilSeries){
				System.out.println(tamilserie);
			}
		}
		
		
		public static void gettelguSeries(){
			for(String telguserie:teluguSeries){
				System.out.println(telguserie);
			}
		}
		
		
		public static void getmalyalamSeries(){
			for(String malyalamserie:malayalamSeries){
				System.out.println(malyalamserie);
			}
		}
}
