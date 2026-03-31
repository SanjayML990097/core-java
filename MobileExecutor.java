class MobileExecutor {

    public static void main(String args[]) {

        Mobile ref = new Mobile();
        ref.mobileId = 1;
        ref.brand = "Samsung";
        ref.model = "Galaxy S21";
        ref.price = 50000;
        ref.color = "Black";

        Sim s = new Sim();
        s.simId = 101;
        s.provider = "Jio";
        s.networkType = "5G";
        s.mobileNumber = 9876543210L;
        s.plan = "Unlimited";

        ref.sim = s;
		

// 2
Mobile ref2 = new Mobile();
ref2.mobileId = 2;
ref2.brand = "Apple";
ref2.model = "iPhone 13";
ref2.price = 70000;
ref2.color = "Blue";

Sim s2 = new Sim();
s2.simId = 102;
s2.provider = "Airtel";
s2.networkType = "4G";
s2.mobileNumber = 9000000002L;
s2.plan = "Prepaid";

// 3
Mobile ref3 = new Mobile();
ref3.mobileId = 3;
ref3.brand = "OnePlus";
ref3.model = "9 Pro";
ref3.price = 60000;
ref3.color = "Green";

Sim s3 = new Sim();
s3.simId = 103;
s3.provider = "VI";
s3.networkType = "4G";
s3.mobileNumber = 9000000003L;
s3.plan = "Postpaid";

// 4
Mobile ref4 = new Mobile();
ref4.mobileId = 4;
ref4.brand = "Xiaomi";
ref4.model = "Mi 11";
ref4.price = 40000;
ref4.color = "White";

Sim s4 = new Sim();
s4.simId = 104;
s4.provider = "BSNL";
s4.networkType = "3G";
s4.mobileNumber = 9000000004L;
s4.plan = "Basic";

// 5
Mobile ref5 = new Mobile();
ref5.mobileId = 5;
ref5.brand = "Realme";
ref5.model = "GT";
ref5.price = 35000;
ref5.color = "Yellow";

Sim s5 = new Sim();
s5.simId = 105;
s5.provider = "Jio";
s5.networkType = "5G";
s5.mobileNumber = 9000000005L;
s5.plan = "Unlimited";

// 6
Mobile ref6 = new Mobile();
ref6.mobileId = 6;
ref6.brand = "Oppo";
ref6.model = "Reno 6";
ref6.price = 30000;
ref6.color = "Silver";

Sim s6 = new Sim();
s6.simId = 106;
s6.provider = "Airtel";
s6.networkType = "5G";
s6.mobileNumber = 9000000006L;
s6.plan = "Prepaid";

// 7
Mobile ref7 = new Mobile();
ref7.mobileId = 7;
ref7.brand = "Vivo";
ref7.model = "X60";
ref7.price = 45000;
ref7.color = "Black";

Sim s7 = new Sim();
s7.simId = 107;
s7.provider = "VI";
s7.networkType = "4G";
s7.mobileNumber = 9000000007L;
s7.plan = "Postpaid";

// 8
Mobile ref8 = new Mobile();
ref8.mobileId = 8;
ref8.brand = "Nokia";
ref8.model = "8.3";
ref8.price = 42000;
ref8.color = "Blue";

Sim s8 = new Sim();
s8.simId = 108;
s8.provider = "BSNL";
s8.networkType = "4G";
s8.mobileNumber = 9000000008L;
s8.plan = "Basic";

// 9
Mobile ref9 = new Mobile();
ref9.mobileId = 9;
ref9.brand = "Motorola";
ref9.model = "Edge";
ref9.price = 38000;
ref9.color = "Grey";

Sim s9 = new Sim();
s9.simId = 109;
s9.provider = "Jio";
s9.networkType = "5G";
s9.mobileNumber = 9000000009L;
s9.plan = "Unlimited";

// 10
Mobile ref10 = new Mobile();
ref10.mobileId = 10;
ref10.brand = "Samsung";
ref10.model = "M32";
ref10.price = 20000;
ref10.color = "Green";

Sim s10 = new Sim();
s10.simId = 110;
s10.provider = "Airtel";
s10.networkType = "4G";
s10.mobileNumber = 9000000010L;
s10.plan = "Prepaid";

// 11–29 (same pattern with unique values)

Mobile ref11 = new Mobile(); ref11.mobileId=11; ref11.brand="Apple"; ref11.model="iPhone 12"; ref11.price=60000; ref11.color="Red";
Sim s11 = new Sim(); s11.simId=111; s11.provider="VI"; s11.networkType="4G"; s11.mobileNumber=9000000011L; s11.plan="Postpaid";

Mobile ref12 = new Mobile(); ref12.mobileId=12; ref12.brand="OnePlus"; ref12.model="Nord"; ref12.price=28000; ref12.color="Blue";
Sim s12 = new Sim(); s12.simId=112; s12.provider="BSNL"; s12.networkType="3G"; s12.mobileNumber=9000000012L; s12.plan="Basic";

Mobile ref13 = new Mobile(); ref13.mobileId=13; ref13.brand="Realme"; ref13.model="Narzo"; ref13.price=15000; ref13.color="Black";
Sim s13 = new Sim(); s13.simId=113; s13.provider="Jio"; s13.networkType="5G"; s13.mobileNumber=9000000013L; s13.plan="Unlimited";

Mobile ref14 = new Mobile(); ref14.mobileId=14; ref14.brand="Oppo"; ref14.model="A74"; ref14.price=18000; ref14.color="White";
Sim s14 = new Sim(); s14.simId=114; s14.provider="Airtel"; s14.networkType="4G"; s14.mobileNumber=9000000014L; s14.plan="Prepaid";

Mobile ref15 = new Mobile(); ref15.mobileId=15; ref15.brand="Vivo"; ref15.model="Y20"; ref15.price=16000; ref15.color="Blue";
Sim s15 = new Sim(); s15.simId=115; s15.provider="VI"; s15.networkType="4G"; s15.mobileNumber=9000000015L; s15.plan="Postpaid";

Mobile ref16 = new Mobile(); ref16.mobileId=16; ref16.brand="Nokia"; ref16.model="5.4"; ref16.price=14000; ref16.color="Grey";
Sim s16 = new Sim(); s16.simId=116; s16.provider="BSNL"; s16.networkType="3G"; s16.mobileNumber=9000000016L; s16.plan="Basic";

Mobile ref17 = new Mobile(); ref17.mobileId=17; ref17.brand="Motorola"; ref17.model="G60"; ref17.price=17000; ref17.color="Green";
Sim s17 = new Sim(); s17.simId=117; s17.provider="Jio"; s17.networkType="5G"; s17.mobileNumber=9000000017L; s17.plan="Unlimited";

Mobile ref18 = new Mobile(); ref18.mobileId=18; ref18.brand="Samsung"; ref18.model="A52"; ref18.price=25000; ref18.color="Black";
Sim s18 = new Sim(); s18.simId=118; s18.provider="Airtel"; s18.networkType="4G"; s18.mobileNumber=9000000018L; s18.plan="Prepaid";

Mobile ref19 = new Mobile(); ref19.mobileId=19; ref19.brand="Apple"; ref19.model="iPhone 11"; ref19.price=50000; ref19.color="White";
Sim s19 = new Sim(); s19.simId=119; s19.provider="VI"; s19.networkType="4G"; s19.mobileNumber=9000000019L; s19.plan="Postpaid";

Mobile ref20 = new Mobile(); ref20.mobileId=20; ref20.brand="Xiaomi"; ref20.model="Redmi Note 10"; ref20.price=15000; ref20.color="Blue";
Sim s20 = new Sim(); s20.simId=120; s20.provider="BSNL"; s20.networkType="3G"; s20.mobileNumber=9000000020L; s20.plan="Basic";

Mobile ref21 = new Mobile(); ref21.mobileId=21; ref21.brand="Realme"; ref21.model="C25"; ref21.price=12000; ref21.color="Grey";
Sim s21 = new Sim(); s21.simId=121; s21.provider="Jio"; s21.networkType="5G"; s21.mobileNumber=9000000021L; s21.plan="Unlimited";

Mobile ref22 = new Mobile(); ref22.mobileId=22; ref22.brand="Oppo"; ref22.model="F19"; ref22.price=19000; ref22.color="Silver";
Sim s22 = new Sim(); s22.simId=122; s22.provider="Airtel"; s22.networkType="4G"; s22.mobileNumber=9000000022L; s22.plan="Prepaid";

Mobile ref23 = new Mobile(); ref23.mobileId=23; ref23.brand="Vivo"; ref23.model="V21"; ref23.price=27000; ref23.color="Blue";
Sim s23 = new Sim(); s23.simId=123; s23.provider="VI"; s23.networkType="4G"; s23.mobileNumber=9000000023L; s23.plan="Postpaid";

Mobile ref24 = new Mobile(); ref24.mobileId=24; ref24.brand="Nokia"; ref24.model="3.4"; ref24.price=11000; ref24.color="Black";
Sim s24 = new Sim(); s24.simId=124; s24.provider="BSNL"; s24.networkType="3G"; s24.mobileNumber=9000000024L; s24.plan="Basic";

Mobile ref25 = new Mobile(); ref25.mobileId=25; ref25.brand="Motorola"; ref25.model="G30"; ref25.price=13000; ref25.color="White";
Sim s25 = new Sim(); s25.simId=125; s25.provider="Jio"; s25.networkType="5G"; s25.mobileNumber=9000000025L; s25.plan="Unlimited";

Mobile ref26 = new Mobile(); ref26.mobileId=26; ref26.brand="Samsung"; ref26.model="F62"; ref26.price=24000; ref26.color="Blue";
Sim s26 = new Sim(); s26.simId=126; s26.provider="Airtel"; s26.networkType="4G"; s26.mobileNumber=9000000026L; s26.plan="Prepaid";

Mobile ref27 = new Mobile(); ref27.mobileId=27; ref27.brand="Apple"; ref27.model="iPhone SE"; ref27.price=30000; ref27.color="Red";
Sim s27 = new Sim(); s27.simId=127; s27.provider="VI"; s27.networkType="4G"; s27.mobileNumber=9000000027L; s27.plan="Postpaid";

Mobile ref28 = new Mobile(); ref28.mobileId=28; ref28.brand="OnePlus"; ref28.model="8T"; ref28.price=42000; ref28.color="Green";
Sim s28 = new Sim(); s28.simId=128; s28.provider="BSNL"; s28.networkType="3G"; s28.mobileNumber=9000000028L; s28.plan="Basic";

Mobile ref29 = new Mobile(); ref29.mobileId=29; ref29.brand="Xiaomi"; ref29.model="Mi 10"; ref29.price=35000; ref29.color="Grey";
Sim s29 = new Sim(); s29.simId=129; s29.provider="Jio"; s29.networkType="5G"; s29.mobileNumber=9000000029L; s29.plan="Unlimited";

        ref.getMobileDetails();
    }
}