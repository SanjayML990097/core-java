class Netflix {

    static String ottName = "Netflix";

    static String kannadaMovies[] = {
        "Kirik Party","Avane Srimannarayana","Bell Bottom","Googly","Rajakumara","James","Gaalipata","Milana","Mungaru Male","Shivalinga",
        "Hebbuli","Kotigobba","Roberrt","Yajamana","RangiTaranga","Simple Agi Ondh Love Story","Bhajarangi","Mr and Mrs Ramachari","Power","Victory",
        "Chamak","Natasaarvabhowma","Ranna","Addhuri","Drama","Krishna","Bulbul","Sarkari Hi Pra Shaale","Love 360","Ondu Motteya Kathe"
    };

    static String englishMovies[] = {
        "The Adam Project","Glass Onion","The Platform","Army of the Dead","The Trial of Chicago 7","Marriage Story","Roma","The Pale Blue Eye","Damsel",
        "Leave the World Behind","The Mother","Lift","Code 8","Bright","Okja","To All the Boys","The Kissing Booth","The Old Guard","Polar","The Prom",
        "The Midnight Sky","Extinction","The Babysitter","Project Power","Bird Box Barcelona","Kate","Tall Girl","The Silence","Outside the Wire","Spectral"
    };

    static String hindiMovies[] = {
        "3 Idiots","Dangal","Andhadhun","Drishyam","Queen","Barfi","Pink","Tumbbad","Stree","Uri",
        "Raazi","Kesari","Shershaah","Special 26","Talvar","Hindi Medium","October","Badhaai Ho","Article 15","Kahaani",
        "Madras Cafe","Airlift","Lootera","Tamasha","Rockstar","Swades","Lagaan","Chak De India","PK","Zindagi Na Milegi Dobara"
    };

    static String tamilMovies[] = {
        "Thuppakki","Anniyan","Ghilli","Kaala","Vettaiyan","Captain Miller","Don","Doctor","Etharkkum Thunindhavan","Valimai",
        "Beast","Varisu","Thunivu","Karnan","Maanaadu","Jai Bhim","Ponniyin Selvan 2","Indian","Lingaa","Kaithi",
        "Bigil","Master","Leo","Jailer","Viswasam","Asuran","Vikram","Darbar","Petta","Theri"
    };

    static String teluguMovies[] = {
        "Baahubali","Pushpa","RRR","Arjun Reddy","Ala Vaikunthapurramuloo","Eega","Magadheera","Srimanthudu","Attarintiki Daredi","Businessman",
        "Mirchi","Sye","Leader","Fidaa","Majili","Geetha Govindam","Okkadu","Simhadri","Indra","Yevadu",
        "Temper","Race Gurram","Bheemla Nayak","Akhanda","Sarrainodu","Bharat Ane Nenu","Rangasthalam","Jersey","Dear Comrade","Chatrapathi"
    };

    static String malayalamMovies[] = {
        "Drishyam 2","Premalu","Lucifer 2","Minnal Murali 2","Aadu","Urumi","Iyobinte Pusthakam","Virus","Driving Licence","Kali",
        "Maheshinte Prathikaaram","Take Off","Oppam","Nayattu","Jallikattu","Trance","Ayyappanum Koshiyum","Kumbalangi Nights","Bangalore Days","Pulimurugan",
        "Home","The Priest","Cold Case","Malikappuram","Varathan","Anjaam Pathiraa","CBI","Kurup","Bheeshma Parvam","2018"
    };

    public static void main(String[] args) {

        System.out.println("The OTT Platform Name is: " + ottName);

        System.out.println("The Kannada Movies are:");
        getKannadaMovies();

        System.out.println("The English Movies are:");
        getEnglishMovies();

        System.out.println("The Hindi Movies are:");
        getHindiMovies();

        System.out.println("The Tamil Movies are:");
        getTamilMovies();

        System.out.println("The Telugu Movies are:");
        getTeluguMovies();

        System.out.println("The Malayalam Movies are:");
        getMalayalamMovies();
    }

    public static void getKannadaMovies() {
        for(String movie : kannadaMovies) {
            System.out.println(movie);
        }
    }

    public static void getEnglishMovies() {
        for(String movie : englishMovies) {
            System.out.println(movie);
        }
    }

    public static void getHindiMovies() {
        for(String movie : hindiMovies) {
            System.out.println(movie);
        }
    }

    public static void getTamilMovies() {
        for(String movie : tamilMovies) {
            System.out.println(movie);
        }
    }

    public static void getTeluguMovies() {
        for(String movie : teluguMovies) {
            System.out.println(movie);
        }
    }

    public static void getMalayalamMovies() {
        for(String movie : malayalamMovies) {
            System.out.println(movie);
        }
    }
}