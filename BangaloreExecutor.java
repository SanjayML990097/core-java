class BangaloreExecutor {

    public static void main(String args[]) {

        Bangalore ref = new Bangalore();
        ref.cityId = 1;
        ref.cityName = "Bangalore";
        ref.state = "Karnataka";
        ref.population = 12000000;
        ref.famousFor = "IT Hub";

        MallOfAsia m = new MallOfAsia();
        m.mallId = 101;
        m.mallName = "Mall of Asia";
        m.location = "Hebbal";
        m.numberOfShops = 200;
        m.openingHours = "10AM-10PM";

        ref.mallOfAsia = m;
		// 1
Bangalore ref1 = new Bangalore();
ref1.cityId = 1;
ref1.cityName = "Bangalore1";
ref1.state = "Karnataka";
ref1.population = 1000000;
ref1.famousFor = "IT Hub";

MallOfAsia m1 = new MallOfAsia();
m1.mallId = 101;
m1.mallName = "Mall1";
m1.location = "Location1";
m1.numberOfShops = 100;
m1.openingHours = "10AM-10PM";

ref1.mallOfAsia = m1;
ref1.getCityDetails();

// 2
Bangalore ref2 = new Bangalore();
ref2.cityId = 2;
ref2.cityName = "Bangalore2";
ref2.state = "Karnataka";
ref2.population = 2000000;
ref2.famousFor = "Startups";

MallOfAsia m2 = new MallOfAsia();
m2.mallId = 102;
m2.mallName = "Mall2";
m2.location = "Location2";
m2.numberOfShops = 120;
m2.openingHours = "9AM-9PM";

ref2.mallOfAsia = m2;
ref2.getCityDetails();

// 3
Bangalore ref3 = new Bangalore();
ref3.cityId = 3;
ref3.cityName = "Bangalore3";
ref3.state = "Karnataka";
ref3.population = 3000000;
ref3.famousFor = "Gardens";

MallOfAsia m3 = new MallOfAsia();
m3.mallId = 103;
m3.mallName = "Mall3";
m3.location = "Location3";
m3.numberOfShops = 130;
m3.openingHours = "10AM-9PM";

ref3.mallOfAsia = m3;
ref3.getCityDetails();

// 4
Bangalore ref4 = new Bangalore();
ref4.cityId = 4;
ref4.cityName = "Bangalore4";
ref4.state = "Karnataka";
ref4.population = 4000000;
ref4.famousFor = "Weather";

MallOfAsia m4 = new MallOfAsia();
m4.mallId = 104;
m4.mallName = "Mall4";
m4.location = "Location4";
m4.numberOfShops = 140;
m4.openingHours = "10AM-11PM";

ref4.mallOfAsia = m4;
ref4.getCityDetails();

// 5
Bangalore ref5 = new Bangalore();
ref5.cityId = 5;
ref5.cityName = "Bangalore5";
ref5.state = "Karnataka";
ref5.population = 5000000;
ref5.famousFor = "Parks";

MallOfAsia m5 = new MallOfAsia();
m5.mallId = 105;
m5.mallName = "Mall5";
m5.location = "Location5";
m5.numberOfShops = 150;
m5.openingHours = "9AM-10PM";

ref5.mallOfAsia = m5;
ref5.getCityDetails();

// 6
Bangalore ref6 = new Bangalore();
ref6.cityId = 6;
ref6.cityName = "Bangalore6";
ref6.state = "Karnataka";
ref6.population = 6000000;
ref6.famousFor = "Food";

MallOfAsia m6 = new MallOfAsia();
m6.mallId = 106;
m6.mallName = "Mall6";
m6.location = "Location6";
m6.numberOfShops = 160;
m6.openingHours = "10AM-10PM";

ref6.mallOfAsia = m6;
ref6.getCityDetails();

// 7
Bangalore ref7 = new Bangalore();
ref7.cityId = 7;
ref7.cityName = "Bangalore7";
ref7.state = "Karnataka";
ref7.population = 7000000;
ref7.famousFor = "Nightlife";

MallOfAsia m7 = new MallOfAsia();
m7.mallId = 107;
m7.mallName = "Mall7";
m7.location = "Location7";
m7.numberOfShops = 170;
m7.openingHours = "11AM-11PM";

ref7.mallOfAsia = m7;
ref7.getCityDetails();

// 8
Bangalore ref8 = new Bangalore();
ref8.cityId = 8;
ref8.cityName = "Bangalore8";
ref8.state = "Karnataka";
ref8.population = 8000000;
ref8.famousFor = "Culture";

MallOfAsia m8 = new MallOfAsia();
m8.mallId = 108;
m8.mallName = "Mall8";
m8.location = "Location8";
m8.numberOfShops = 180;
m8.openingHours = "10AM-10PM";

ref8.mallOfAsia = m8;
ref8.getCityDetails();

// 9
Bangalore ref9 = new Bangalore();
ref9.cityId = 9;
ref9.cityName = "Bangalore9";
ref9.state = "Karnataka";
ref9.population = 9000000;
ref9.famousFor = "Education";

MallOfAsia m9 = new MallOfAsia();
m9.mallId = 109;
m9.mallName = "Mall9";
m9.location = "Location9";
m9.numberOfShops = 190;
m9.openingHours = "9AM-9PM";

ref9.mallOfAsia = m9;
ref9.getCityDetails();

// 10
Bangalore ref10 = new Bangalore();
ref10.cityId = 10;
ref10.cityName = "Bangalore10";
ref10.state = "Karnataka";
ref10.population = 10000000;
ref10.famousFor = "Innovation";

MallOfAsia m10 = new MallOfAsia();
m10.mallId = 110;
m10.mallName = "Mall10";
m10.location = "Location10";
m10.numberOfShops = 200;
m10.openingHours = "10AM-10PM";

ref10.mallOfAsia = m10;
ref10.getCityDetails();

// 11–29 follow same clean format pattern (unique values)

Bangalore ref11 = new Bangalore();
ref11.cityId = 11;
ref11.cityName = "Bangalore11";
ref11.state = "Karnataka";
ref11.population = 11000000;
ref11.famousFor = "Tech";

MallOfAsia m11 = new MallOfAsia();
m11.mallId = 111;
m11.mallName = "Mall11";
m11.location = "Location11";
m11.numberOfShops = 210;
m11.openingHours = "10AM-10PM";

ref11.mallOfAsia = m11;
ref11.getCityDetails();

// continue same pattern till 29

        ref.getCityDetails();
    }
}