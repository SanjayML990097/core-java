class MxPlayer {

    static String ottName = "MX Player";

    static String kannadaCartoons[] = {
        "Chinnu Adventures","Bheemana Kathe","Ganesha Tales","Panchatantra Kannada","Tenali Rama Kannada",
        "Akbar Birbal Kannada","Mysuru Magic","Karnataka Kids","Chitra Kathe","Bala Ganesha",
        "Krishna Leela Kannada","Hanuman Kannada","Junior Detectives","Village Kids","City Champs",
        "Kannada Toons","Happy Garden","Little Royals","Fun Factory Kannada","Rainbow Kids",
        "Chandamama Stories","Tiny Warriors","Magic Tree","Play Time","Wonder Kids",
        "Cartoon Junction","Super Kids","Dream Land","Adventure Park","Laughing Stars"
    };

    static String englishCartoons[] = {
        "Tom and Jerry","Scooby Doo","Looney Tunes","Popeye","The Flintstones",
        "Johnny Bravo","Dexter Laboratory","Powerpuff Girls","Ben 10","Teen Titans",
        "SpongeBob SquarePants","Dragon Tales","Pokemon","Transformers","He Man",
        "Batman Animated","Superman Series","Avengers Assemble","Kung Fu Panda","Madagascar Toons",
        "Boss Baby","Kung Fu Kids","Adventure Time","Regular Show","Steven Universe",
        "Cars Toons","Mickey Mouse Clubhouse","Duck Tales","Aladdin Series","Lion Guard"
    };

    static String hindiCartoons[] = {
        "Chhota Bheem","Motu Patlu","Shinchan Hindi","Doraemon Hindi","Roll No 21",
        "Little Singham","Vir The Robot Boy","Krishna Balram","Bal Hanuman","Rudra",
        "Pakdam Pakdai","Guru Aur Bhole","Bheem Junior","Gattu Battu","Mighty Raju",
        "Arjun Prince","Lambu G Tingu G","Chorr Police","Bhoot Bandhus","Tarak Mehta Toons",
        "Happy Kids Hindi","Golmaal Junior","Kumbh Karan","Alibaba Cartoon","Jungle Book Hindi",
        "Chacha Bhatija","Akbar Birbal Hindi","Tenali Rama Hindi","Bal Krishna","Super V"
    };

    static String tamilCartoons[] = {
        "Chutti Bheem","Doraemon Tamil","Shinchan Tamil","Motu Patlu Tamil","Roll No 21 Tamil",
        "Little Krishna Tamil","Hanuman Tamil","Tamil Kids Show","Village Heroes","City Kids Tamil",
        "Magic Pot","Tiny World","Adventure Kids Tamil","Junior Superstars","Fun Time Tamil",
        "Cartoon Express","Happy Friends","Rainbow Tamil","Chinna Stories","Kutty Adventures",
        "Kids Planet","Wonder Tamil","Play School","Dream Kids Tamil","Magic Balloon",
        "Animal Tales","Fairy Land","Super Kutty","Happy Garden Tamil","Laughing Kids"
    };

    static String teluguCartoons[] = {
        "Chhota Bheem Telugu","Doraemon Telugu","Shinchan Telugu","Motu Patlu Telugu","Roll No 21 Telugu",
        "Little Singham Telugu","Krishna Telugu","Hanuman Telugu","Bala Ganesh Telugu","Junior Heroes",
        "Telugu Toons","Fun Bucket","Tiny Champs","Village Champs","City Heroes Telugu",
        "Magic World","Rainbow Telugu","Kids Express","Adventure Telugu","Dream World",
        "Cartoon Club","Super Kids Telugu","Animal Planet Kids","Fairy Tales Telugu","Play Time Telugu",
        "Chinni Krishna","Bheem Returns","Jungle Heroes","Happy Telugu Kids","Laugh Out Loud"
    };

    static String malayalamCartoons[] = {
        "Chhota Bheem Malayalam","Doraemon Malayalam","Shinchan Malayalam","Motu Patlu Malayalam","Roll No 21 Malayalam",
        "Little Krishna Malayalam","Bal Hanuman Malayalam","Junior Stars","Magic Kerala","Tiny Kids",
        "Malayalam Toons","Happy World","Adventure Kerala","Rainbow Malayalam","Dream Kids Malayalam",
        "Fun Planet","Animal Tales Malayalam","Fairy World","Super Tots","Laughing Kerala",
        "Cartoon Time","Kids Club Malayalam","Wonder Land","Play House","Magic Balloon Malayalam",
        "Jungle Book Malayalam","Bheem Junior Malayalam","Chutti Heroes","Happy Garden Malayalam","Smiley Kids"
    };

    public static void main(String[] args) {

        System.out.println("The OTT Platform Name is: " + ottName);

        System.out.println("The Kannada cartoons are:");
        getKannadaCartoons();

        System.out.println("The English cartoons are:");
        getEnglishCartoons();

        System.out.println("The Hindi cartoons are:");
        getHindiCartoons();

        System.out.println("The Tamil cartoons are:");
        getTamilCartoons();

        System.out.println("The Telugu cartoons are:");
        getTeluguCartoons();

        System.out.println("The Malayalam cartoons are:");
        getMalayalamCartoons();
    }

    public static void getKannadaCartoons() {
        for(String cartoon : kannadaCartoons) {
            System.out.println(cartoon);
        }
    }

    public static void getEnglishCartoons() {
        for(String cartoon : englishCartoons) {
            System.out.println(cartoon);
        }
    }

    public static void getHindiCartoons() {
        for(String cartoon : hindiCartoons) {
            System.out.println(cartoon);
        }
    }

    public static void getTamilCartoons() {
        for(String cartoon : tamilCartoons) {
            System.out.println(cartoon);
        }
    }

    public static void getTeluguCartoons() {
        for(String cartoon : teluguCartoons) {
            System.out.println(cartoon);
        }
    }

    public static void getMalayalamCartoons() {
        for(String cartoon : malayalamCartoons) {
            System.out.println(cartoon);
        }
    }
}