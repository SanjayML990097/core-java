class RailwayExecutor{

    public static void main(String args[]) {

        // 1
        RailwayStation ref1 = new RailwayStation();
        ref1.stationId = 1;
        ref1.stationName = "Station1";
        ref1.location = "City1";
        ref1.numberOfPlatforms = 5;
        ref1.zone = "South";

        Platform p1 = new Platform();
        p1.platformId = 101;
        p1.platformName = "P1";
        p1.capacity = 1000;
        p1.trainType = "Express";
        p1.status = "Active";

        ref1.platform = p1;
        ref1.getStationDetails();

        // 2
        RailwayStation ref2 = new RailwayStation();
        ref2.stationId = 2;
        ref2.stationName = "Station2";
        ref2.location = "City2";
        ref2.numberOfPlatforms = 6;
        ref2.zone = "North";

        Platform p2 = new Platform();
        p2.platformId = 102;
        p2.platformName = "P2";
        p2.capacity = 1200;
        p2.trainType = "Passenger";
        p2.status = "Active";

        ref2.platform = p2;
        ref2.getStationDetails();

        // 3
        RailwayStation ref3 = new RailwayStation();
        ref3.stationId = 3;
        ref3.stationName = "Station3";
        ref3.location = "City3";
        ref3.numberOfPlatforms = 4;
        ref3.zone = "East";

        Platform p3 = new Platform();
        p3.platformId = 103;
        p3.platformName = "P3";
        p3.capacity = 900;
        p3.trainType = "Express";
        p3.status = "Busy";

        ref3.platform = p3;
        ref3.getStationDetails();

        // Continue same pattern...

        RailwayStation ref4 = new RailwayStation();
        ref4.stationId = 4; ref4.stationName="Station4"; ref4.location="City4"; ref4.numberOfPlatforms=7; ref4.zone="West";
        Platform p4 = new Platform();
        p4.platformId=104; p4.platformName="P4"; p4.capacity=1500; p4.trainType="Superfast"; p4.status="Active";
        ref4.platform=p4; ref4.getStationDetails();

        RailwayStation ref5 = new RailwayStation();
        ref5.stationId = 5; ref5.stationName="Station5"; ref5.location="City5"; ref5.numberOfPlatforms=3; ref5.zone="South";
        Platform p5 = new Platform();
        p5.platformId=105; p5.platformName="P5"; p5.capacity=800; p5.trainType="Passenger"; p5.status="Idle";
        ref5.platform=p5; ref5.getStationDetails();

        RailwayStation ref6 = new RailwayStation();
        ref6.stationId=6; ref6.stationName="Station6"; ref6.location="City6"; ref6.numberOfPlatforms=5; ref6.zone="North";
        Platform p6 = new Platform();
        p6.platformId=106; p6.platformName="P6"; p6.capacity=1100; p6.trainType="Express"; p6.status="Active";
        ref6.platform=p6; ref6.getStationDetails();

        RailwayStation ref7 = new RailwayStation();
        ref7.stationId=7; ref7.stationName="Station7"; ref7.location="City7"; ref7.numberOfPlatforms=6; ref7.zone="East";
        Platform p7 = new Platform();
        p7.platformId=107; p7.platformName="P7"; p7.capacity=1300; p7.trainType="Superfast"; p7.status="Busy";
        ref7.platform=p7; ref7.getStationDetails();

        RailwayStation ref8 = new RailwayStation();
        ref8.stationId=8; ref8.stationName="Station8"; ref8.location="City8"; ref8.numberOfPlatforms=4; ref8.zone="West";
        Platform p8 = new Platform();
        p8.platformId=108; p8.platformName="P8"; p8.capacity=950; p8.trainType="Passenger"; p8.status="Active";
        ref8.platform=p8; ref8.getStationDetails();

        RailwayStation ref9 = new RailwayStation();
        ref9.stationId=9; ref9.stationName="Station9"; ref9.location="City9"; ref9.numberOfPlatforms=5; ref9.zone="South";
        Platform p9 = new Platform();
        p9.platformId=109; p9.platformName="P9"; p9.capacity=1000; p9.trainType="Express"; p9.status="Active";
        ref9.platform=p9; ref9.getStationDetails();

        RailwayStation ref10 = new RailwayStation();
        ref10.stationId=10; ref10.stationName="Station10"; ref10.location="City10"; ref10.numberOfPlatforms=6; ref10.zone="North";
        Platform p10 = new Platform();
        p10.platformId=110; p10.platformName="P10"; p10.capacity=1400; p10.trainType="Superfast"; p10.status="Busy";
        ref10.platform=p10; ref10.getStationDetails();

        // 11 to 29

        RailwayStation ref11=new RailwayStation(); ref11.stationId=11; ref11.stationName="Station11"; ref11.location="City11"; ref11.numberOfPlatforms=5; ref11.zone="East";
        Platform p11=new Platform(); p11.platformId=111; p11.platformName="P11"; p11.capacity=1000; p11.trainType="Express"; p11.status="Active"; ref11.platform=p11; ref11.getStationDetails();

        RailwayStation ref12=new RailwayStation(); ref12.stationId=12; ref12.stationName="Station12"; ref12.location="City12"; ref12.numberOfPlatforms=4; ref12.zone="West";
        Platform p12=new Platform(); p12.platformId=112; p12.platformName="P12"; p12.capacity=900; p12.trainType="Passenger"; p12.status="Idle"; ref12.platform=p12; ref12.getStationDetails();

        RailwayStation ref13=new RailwayStation(); ref13.stationId=13; ref13.stationName="Station13"; ref13.location="City13"; ref13.numberOfPlatforms=6; ref13.zone="South";
        Platform p13=new Platform(); p13.platformId=113; p13.platformName="P13"; p13.capacity=1200; p13.trainType="Superfast"; p13.status="Active"; ref13.platform=p13; ref13.getStationDetails();

        RailwayStation ref14=new RailwayStation(); ref14.stationId=14; ref14.stationName="Station14"; ref14.location="City14"; ref14.numberOfPlatforms=5; ref14.zone="North";
        Platform p14=new Platform(); p14.platformId=114; p14.platformName="P14"; p14.capacity=1100; p14.trainType="Express"; p14.status="Busy"; ref14.platform=p14; ref14.getStationDetails();

        RailwayStation ref15=new RailwayStation(); ref15.stationId=15; ref15.stationName="Station15"; ref15.location="City15"; ref15.numberOfPlatforms=3; ref15.zone="East";
        Platform p15=new Platform(); p15.platformId=115; p15.platformName="P15"; p15.capacity=800; p15.trainType="Passenger"; p15.status="Active"; ref15.platform=p15; ref15.getStationDetails();

        RailwayStation ref16=new RailwayStation(); ref16.stationId=16; ref16.stationName="Station16"; ref16.location="City16"; ref16.numberOfPlatforms=7; ref16.zone="West";
        Platform p16=new Platform(); p16.platformId=116; p16.platformName="P16"; p16.capacity=1500; p16.trainType="Superfast"; p16.status="Busy"; ref16.platform=p16; ref16.getStationDetails();

        RailwayStation ref17=new RailwayStation(); ref17.stationId=17; ref17.stationName="Station17"; ref17.location="City17"; ref17.numberOfPlatforms=5; ref17.zone="South";
        Platform p17=new Platform(); p17.platformId=117; p17.platformName="P17"; p17.capacity=1000; p17.trainType="Express"; p17.status="Active"; ref17.platform=p17; ref17.getStationDetails();

        RailwayStation ref18=new RailwayStation(); ref18.stationId=18; ref18.stationName="Station18"; ref18.location="City18"; ref18.numberOfPlatforms=4; ref18.zone="North";
        Platform p18=new Platform(); p18.platformId=118; p18.platformName="P18"; p18.capacity=900; p18.trainType="Passenger"; p18.status="Idle"; ref18.platform=p18; ref18.getStationDetails();

        RailwayStation ref19=new RailwayStation(); ref19.stationId=19; ref19.stationName="Station19"; ref19.location="City19"; ref19.numberOfPlatforms=6; ref19.zone="East";
        Platform p19=new Platform(); p19.platformId=119; p19.platformName="P19"; p19.capacity=1300; p19.trainType="Superfast"; p19.status="Active"; ref19.platform=p19; ref19.getStationDetails();

        RailwayStation ref20=new RailwayStation(); ref20.stationId=20; ref20.stationName="Station20"; ref20.location="City20"; ref20.numberOfPlatforms=5; ref20.zone="West";
        Platform p20=new Platform(); p20.platformId=120; p20.platformName="P20"; p20.capacity=1100; p20.trainType="Express"; p20.status="Busy"; ref20.platform=p20; ref20.getStationDetails();

        RailwayStation ref21=new RailwayStation(); ref21.stationId=21; ref21.stationName="Station21"; ref21.location="City21"; ref21.numberOfPlatforms=3; ref21.zone="South";
        Platform p21=new Platform(); p21.platformId=121; p21.platformName="P21"; p21.capacity=800; p21.trainType="Passenger"; p21.status="Active"; ref21.platform=p21; ref21.getStationDetails();

        RailwayStation ref22=new RailwayStation(); ref22.stationId=22; ref22.stationName="Station22"; ref22.location="City22"; ref22.numberOfPlatforms=7; ref22.zone="North";
        Platform p22=new Platform(); p22.platformId=122; p22.platformName="P22"; p22.capacity=1500; p22.trainType="Superfast"; p22.status="Busy"; ref22.platform=p22; ref22.getStationDetails();

        RailwayStation ref23=new RailwayStation(); ref23.stationId=23; ref23.stationName="Station23"; ref23.location="City23"; ref23.numberOfPlatforms=5; ref23.zone="East";
        Platform p23=new Platform(); p23.platformId=123; p23.platformName="P23"; p23.capacity=1000; p23.trainType="Express"; p23.status="Active"; ref23.platform=p23; ref23.getStationDetails();

        RailwayStation ref24=new RailwayStation(); ref24.stationId=24; ref24.stationName="Station24"; ref24.location="City24"; ref24.numberOfPlatforms=4; ref24.zone="West";
        Platform p24=new Platform(); p24.platformId=124; p24.platformName="P24"; p24.capacity=900; p24.trainType="Passenger"; p24.status="Idle"; ref24.platform=p24; ref24.getStationDetails();

        RailwayStation ref25=new RailwayStation(); ref25.stationId=25; ref25.stationName="Station25"; ref25.location="City25"; ref25.numberOfPlatforms=6; ref25.zone="South";
        Platform p25=new Platform(); p25.platformId=125; p25.platformName="P25"; p25.capacity=1200; p25.trainType="Superfast"; p25.status="Active"; ref25.platform=p25; ref25.getStationDetails();

        RailwayStation ref26=new RailwayStation(); ref26.stationId=26; ref26.stationName="Station26"; ref26.location="City26"; ref26.numberOfPlatforms=5; ref26.zone="North";
        Platform p26=new Platform(); p26.platformId=126; p26.platformName="P26"; p26.capacity=1100; p26.trainType="Express"; p26.status="Busy"; ref26.platform=p26; ref26.getStationDetails();

        RailwayStation ref27=new RailwayStation(); ref27.stationId=27; ref27.stationName="Station27"; ref27.location="City27"; ref27.numberOfPlatforms=3; ref27.zone="East";
        Platform p27=new Platform(); p27.platformId=127; p27.platformName="P27"; p27.capacity=800; p27.trainType="Passenger"; p27.status="Active"; ref27.platform=p27; ref27.getStationDetails();

        RailwayStation ref28=new RailwayStation(); ref28.stationId=28; ref28.stationName="Station28"; ref28.location="City28"; ref28.numberOfPlatforms=7; ref28.zone="West";
        Platform p28=new Platform(); p28.platformId=128; p28.platformName="P28"; p28.capacity=1500; p28.trainType="Superfast"; p28.status="Busy"; ref28.platform=p28; ref28.getStationDetails();

        RailwayStation ref29=new RailwayStation(); ref29.stationId=29; ref29.stationName="Station29"; ref29.location="City29"; ref29.numberOfPlatforms=5; ref29.zone="South";
        Platform p29=new Platform(); p29.platformId=129; p29.platformName="P29"; p29.capacity=1000; p29.trainType="Express"; p29.status="Active"; ref29.platform=p29; ref29.getStationDetails();

    }
}