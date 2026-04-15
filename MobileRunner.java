class MobileRunner {

    public static void main(String[] args) {

        Mobile mobiles[] = new Mobile[15];

        Mobile m1 = new Mobile();
        m1.mobileId = 801;
        m1.brand = "Samsung";
        m1.model = "Galaxy S21";
        m1.price = 65000;
        m1.color = "Black";
        mobiles[0] = m1;

        Mobile m2 = new Mobile();
        m2.mobileId = 802;
        m2.brand = "Apple";
        m2.model = "iPhone 13";
        m2.price = 75000;
        m2.color = "Blue";
        mobiles[1] = m2;

        Mobile m3 = new Mobile();
        m3.mobileId = 803;
        m3.brand = "OnePlus";
        m3.model = "9 Pro";
        m3.price = 60000;
        m3.color = "Green";
        mobiles[2] = m3;

        Mobile m4 = new Mobile();
        m4.mobileId = 804;
        m4.brand = "Xiaomi";
        m4.model = "Mi 11";
        m4.price = 50000;
        m4.color = "White";
        mobiles[3] = m4;

        Mobile m5 = new Mobile();
        m5.mobileId = 805;
        m5.brand = "Realme";
        m5.model = "GT";
        m5.price = 40000;
        m5.color = "Yellow";
        mobiles[4] = m5;

        Mobile m6 = new Mobile();
        m6.mobileId = 806;
        m6.brand = "Vivo";
        m6.model = "X70";
        m6.price = 45000;
        m6.color = "Blue";
        mobiles[5] = m6;

        Mobile m7 = new Mobile();
        m7.mobileId = 807;
        m7.brand = "Oppo";
        m7.model = "Find X3";
        m7.price = 55000;
        m7.color = "Black";
        mobiles[6] = m7;

        Mobile m8 = new Mobile();
        m8.mobileId = 808;
        m8.brand = "Nokia";
        m8.model = "8.3";
        m8.price = 48000;
        m8.color = "Silver";
        mobiles[7] = m8;

        Mobile m9 = new Mobile();
        m9.mobileId = 809;
        m9.brand = "Motorola";
        m9.model = "Edge 20";
        m9.price = 42000;
        m9.color = "Grey";
        mobiles[8] = m9;

        Mobile m10 = new Mobile();
        m10.mobileId = 810;
        m10.brand = "Google";
        m10.model = "Pixel 6";
        m10.price = 70000;
        m10.color = "Black";
        mobiles[9] = m10;

        Mobile m11 = new Mobile();
        m11.mobileId = 811;
        m11.brand = "Samsung";
        m11.model = "Galaxy A52";
        m11.price = 30000;
        m11.color = "Blue";
        mobiles[10] = m11;

        Mobile m12 = new Mobile();
        m12.mobileId = 812;
        m12.brand = "Apple";
        m12.model = "iPhone 12";
        m12.price = 65000;
        m12.color = "Red";
        mobiles[11] = m12;

        Mobile m13 = new Mobile();
        m13.mobileId = 813;
        m13.brand = "OnePlus";
        m13.model = "Nord 2";
        m13.price = 35000;
        m13.color = "Green";
        mobiles[12] = m13;

        Mobile m14 = new Mobile();
        m14.mobileId = 814;
        m14.brand = "Realme";
        m14.model = "Narzo 50";
        m14.price = 20000;
        m14.color = "Black";
        mobiles[13] = m14;

        Mobile m15 = new Mobile();
        m15.mobileId = 815;
        m15.brand = "Xiaomi";
        m15.model = "Redmi Note 11";
        m15.price = 18000;
        m15.color = "White";
        mobiles[14] = m15;

        for (Mobile mobile : mobiles) {
            System.out.println(mobile.mobileId);
            System.out.println(mobile.brand);
            System.out.println(mobile.model);
            System.out.println(mobile.price);
            System.out.println(mobile.color);
            System.out.println("----------------------");
        }
    }
}