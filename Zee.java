class Zee {

    static String ottName = "Zee5";

    static String kannadaSerials[] = {
        "Gattimela","Jothe Jotheyali","Satya","Kamali","Paaru",
        "Naagini","Yaare Nee Mohini","Brahmagantu","Kendasampige","Mangala Gowri Maduve",
        "Subbalakshmi Samsara","Putmalli","Radha Kalyana","Mahadevi","Shubhavivaha",
        "Varalakshmi Stores","Nammane Yuvarani","Seetha Rama","Lakshmi Nivasa","Annapoorna",
        "Hitler Kalyana","Ganga","Sarojini","Bhagyalakshmi","Nagini 2",
        "Devayani","Arundhati","Mahanayaka","Kaveri","Sundari"
    };

    static String englishSerials[] = {
        "The Young and the Restless","Days of Our Lives","General Hospital","The Bold and the Beautiful","EastEnders",
        "Coronation Street","Emmerdale","Holby City","Neighbours","Home and Away",
        "Dynasty","Dallas","Melrose Place","Beverly Hills 90210","The OC",
        "Grey Anatomy","Chicago Fire","Chicago Med","Chicago PD","NCIS",
        "Blue Bloods","This Is Us","Desperate Housewives","Downton Abbey","The Crown",
        "Riverdale","Gossip Girl","Pretty Little Liars","Revenge","One Tree Hill"
    };

    static String hindiSerials[] = {
        "Kumkum Bhagya","Kundali Bhagya","Bhagya Lakshmi","Radha Mohan","Meet",
        "Pavitra Rishta","Kasamh Se","Yeh Teri Galiyan","Qubool Hai","Jodha Akbar",
        "Jamai Raja","Tashan e Ishq","Ishq Subhan Allah","Banoo Main Teri Dulhann","Saat Phere",
        "Zindagi Ki Mehek","Aap Ke Aa Jane Se","Guddan Tumse Na Ho Payega","Kaleerein","Tujhse Hai Raabta",
        "Kaala Teeka","Fear Files","Rabb Se Hai Dua","Main Hoon Aparajita","Pyaar Ka Pehla Naam Radha Mohan",
        "Dil Dhoondta Hai","Ek Tha Raja Ek Thi Rani","Hitler Didi","Sanjog","Yeh Vaada Raha"
    };

    static String tamilSerials[] = {
        "Sembaruthi","Yaaradi Nee Mohini","Poove Poochudava","Oru Oorla Oru Rajakumari","Sathya",
        "Rajamagal","Kannathil Muthamittal","Neethane Enthan Ponvasantham","Thavamai Thavamirundhu","Ninaithale Inikkum",
        "Anbe Sivam","Peranbu","Deivam Thantha Poove","Sandhya Raagam","Vidhya No 1",
        "Maari","Amudhavum Annalakshmiyum","Iniya Iru Malargal","Chithi 2","Siva Manasula Sakthi",
        "Vallamai Tharayo","Mullum Malarum","Uyire","Thirumathi Hitler","Azhagiya Tamil Magal",
        "Anandha Ragam","Sundari","Poove Unakkaga","Kalyana Vaibhogam","Thalaiyanai Pookal"
    };

    static String teluguSerials[] = {
        "Prema Entha Madhuram","Trinayani","Krishna Tulasi","Mithai Kottu Chittemma","Radhamma Kuthuru",
        "Kalyana Vaibhogam","Maate Mantramu","Suryakantham","Rama Sakkani Seetha","Inti Guttu",
        "Hitler Gari Pellam","Mudda Mandaram","Mangamma Gari Manavaralu","Nagini","Bharyamani",
        "Amma Na Kodala","Varudhini Parinayam","Iddaru Ammayilu","Punar Vivaham","Sankranthi",
        "Agni Sakshi","Subhasya Seeghram","Chadarangam","Devatha","Radhika Madhu",
        "Nindu Noorella Saavasam","Attarintlo Akka Chellellu","Karthika Deepam","Gundamma Katha","Sravana Sameeralu"
    };

    static String malayalamSerials[] = {
        "Chembarathi","Kabani","Neeyum Njanum","Pookalam Varavayi","Sathya Enna Penkutty",
        "Vanambadi","Karuthamuthu","Seetha","Parasparam","Bharya",
        "Akkareyanente Maanasam","Amma","Chandanamazha","Kasthooriman","Mounaragam",
        "Paadatha Painkili","Kudumbavilakku","Thoovalsparsham","Santhwanam","Mrs Hitler",
        "Manjurukum Kaalam","Sumangali Bhava","Sthree","Indulekha","Pranayini",
        "Nizhalattam","Mayamohini","Ayalathe Sundari","Bhagyalakshmi","Nandini"
    };

    public static void main(String[] args) {

        System.out.println("The OTT Platform Name is: " + ottName);

        System.out.println("The Kannada Serials are:");
        getKannadaSerials();

        System.out.println("The English Serials are:");
        getEnglishSerials();

        System.out.println("The Hindi Serials are:");
        getHindiSerials();

        System.out.println("The Tamil Serials are:");
        getTamilSerials();

        System.out.println("The Telugu Serials are:");
        getTeluguSerials();

        System.out.println("The Malayalam Serials are:");
        getMalayalamSerials();
    }

    public static void getKannadaSerials() {
        for(String serial : kannadaSerials) {
            System.out.println(serial);
        }
    }

    public static void getEnglishSerials() {
        for(String serial : englishSerials) {
            System.out.println(serial);
        }
    }

    public static void getHindiSerials() {
        for(String serial : hindiSerials) {
            System.out.println(serial);
        }
    }

    public static void getTamilSerials() {
        for(String serial : tamilSerials) {
            System.out.println(serial);
        }
    }

    public static void getTeluguSerials() {
        for(String serial : teluguSerials) {
            System.out.println(serial);
        }
    }

    public static void getMalayalamSerials() {
        for(String serial : malayalamSerials) {
            System.out.println(serial);
        }
    }
}