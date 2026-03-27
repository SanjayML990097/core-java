class JioStar {

    static String ottName = "JioStar";

    static String englishHorrorMovies[] = {
        "The Conjuring","Annabelle","The Nun","Insidious","The Exorcist","It","The Ring","The Grudge","A Quiet Place","The Babadook",
        "Hereditary","The Shining","Sinister","The Nun 2","Evil Dead","Lights Out","The Conjuring 2","Annabelle Creation","The Curse of La Llorona","The Omen",
        "Paranormal Activity","The Exorcism of Emily Rose","The Autopsy of Jane Doe","Smile","The Haunting","The Possession","Drag Me to Hell","The Visit","Orphan","The Cabin in the Woods"
    };

    static String hindiHorrorMovies[] = {
        "Raaz","1920","Bhoot","Pari","Stree","Tumbbad","Ragini MMS","Haunted 3D","Ek Thi Daayan","Bhool Bhulaiyaa",
        "Phoonk","Krishna Cottage","Vaastu Shastra","Darna Mana Hai","Darna Zaroori Hai","Raat","Kaal","Horror Story","Pizza","Nanu Ki Jaanu",
        "Ghost","The House Next Door","Chhorii","Bulbbul","Roohi","13B","Shapit","Creature 3D","Agyaat","Alone"
    };

    static String tamilHorrorMovies[] = {
        "Chandramukhi","Aranmanai","Demonte Colony","Pizza","Kanchana","Maya","Yaamirukka Bayamey","Aval","Kolaiyuthir Kaalam","Darling",
        "Jackson Durai","Sivi","Iruttu","Boomerang","Airaa","U Turn","Pisaasu","Massu Engira Masilamani","Eeram","Kalavani 2",
        "Sangili Bungili Kadhava Thorae","Devi","Anando Brahma","Nenjam Marappathillai","Mercury","Game Over","Kaatteri","Muni","Aranmanai 2","Aranmanai 3"
    };

    static String teluguHorrorMovies[] = {
        "Arundhati","Raju Gari Gadhi","Avunu","Prema Katha Chitram","Geethanjali","Anando Brahma","Bhaagamathie","Rakshasudu","Masooda","Ekkadiki Pothavu Chinnavada",
        "Chandramukhi","Kanchana","Ice Cream","Tripura","Shiva Ganga","Ravoyi Chandamama","Nagavalli","Deyyam","A Film by Aravind","Mantra",
        "Vaishali","Kalavaramaye Madilo","Kshanam","Zombie Reddy","Punnami Ratri","Ammoru","Gruham","Marri Chettu","Preyasi Raave","Drushyam 2"
    };

    static String malayalamHorrorMovies[] = {
        "Manichitrathazhu","Anandabhadram","Ezra","Bhargavi Nilayam","Winter","Bhoothakaalam","Romancham","The Priest","Cold Case","Geethanjali",
        "Yakshi","Lisa","Adharvam","Sreekrishna Parunthu","Chathikkatha Chanthu","Devadoothan","Moonnam Pakkam","My Dear Kuttichathan","Aakashaganga","Vellinakshatram",
        "Nine","Kanchana","Pisaasu","Ghost Villa","Neelavelicham","Pretham","Pretham 2","Kinavalli","Thegidi","Kumari"
    };

    public static void main(String[] args) {

        System.out.println("The OTT Platform Name is : " + ottName);

        System.out.println("The English Horror Movies are:");
        getEnglishHorrorMovies();

        System.out.println("The Hindi Horror Movies are:");
        getHindiHorrorMovies();

        System.out.println("The Tamil Horror Movies are:");
        getTamilHorrorMovies();

        System.out.println("The Telugu Horror Movies are:");
        getTeluguHorrorMovies();

        System.out.println("The Malayalam Horror Movies are:");
        getMalayalamHorrorMovies();
    }

    public static void getEnglishHorrorMovies() {
        for(String movie : englishHorrorMovies) {
            System.out.println(movie);
        }
    }

    public static void getHindiHorrorMovies() {
        for(String movie : hindiHorrorMovies) {
            System.out.println(movie);
        }
    }

    public static void getTamilHorrorMovies() {
        for(String movie : tamilHorrorMovies) {
            System.out.println(movie);
        }
    }

    public static void getTeluguHorrorMovies() {
        for(String movie : teluguHorrorMovies) {
            System.out.println(movie);
        }
    }

    public static void getMalayalamHorrorMovies() {
        for(String movie : malayalamHorrorMovies) {
            System.out.println(movie);
        }
    }
}