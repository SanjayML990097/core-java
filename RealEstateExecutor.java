class RealEstateExecutor {

    public static void main(String args[]) {

        RealEstate ref1=new RealEstate(); ref1.realEstateId=1; ref1.companyName="Company1"; ref1.location="City1"; ref1.propertyType="Flat"; ref1.totalValue=1000000;
        Property p1=new Property(); p1.propertyId=101; p1.propertyName="Property1"; p1.area=1000; p1.price=500000; p1.status="Available"; ref1.property=p1; ref1.getRealEstateDetails();

        RealEstate ref2=new RealEstate(); ref2.realEstateId=2; ref2.companyName="Company2"; ref2.location="City2"; ref2.propertyType="Villa"; ref2.totalValue=2000000;
        Property p2=new Property(); p2.propertyId=102; p2.propertyName="Property2"; p2.area=1200; p2.price=600000; p2.status="Sold"; ref2.property=p2; ref2.getRealEstateDetails();

        RealEstate ref3=new RealEstate(); ref3.realEstateId=3; ref3.companyName="Company3"; ref3.location="City3"; ref3.propertyType="Plot"; ref3.totalValue=1500000;
        Property p3=new Property(); p3.propertyId=103; p3.propertyName="Property3"; p3.area=900; p3.price=450000; p3.status="Available"; ref3.property=p3; ref3.getRealEstateDetails();

        RealEstate ref4=new RealEstate(); ref4.realEstateId=4; ref4.companyName="Company4"; ref4.location="City4"; ref4.propertyType="Flat"; ref4.totalValue=1800000;
        Property p4=new Property(); p4.propertyId=104; p4.propertyName="Property4"; p4.area=1100; p4.price=550000; p4.status="Booked"; ref4.property=p4; ref4.getRealEstateDetails();

        RealEstate ref5=new RealEstate(); ref5.realEstateId=5; ref5.companyName="Company5"; ref5.location="City5"; ref5.propertyType="Villa"; ref5.totalValue=2500000;
        Property p5=new Property(); p5.propertyId=105; p5.propertyName="Property5"; p5.area=1300; p5.price=650000; p5.status="Sold"; ref5.property=p5; ref5.getRealEstateDetails();

        RealEstate ref6=new RealEstate(); ref6.realEstateId=6; ref6.companyName="Company6"; ref6.location="City6"; ref6.propertyType="Plot"; ref6.totalValue=1400000;
        Property p6=new Property(); p6.propertyId=106; p6.propertyName="Property6"; p6.area=950; p6.price=470000; p6.status="Available"; ref6.property=p6; ref6.getRealEstateDetails();

        RealEstate ref7=new RealEstate(); ref7.realEstateId=7; ref7.companyName="Company7"; ref7.location="City7"; ref7.propertyType="Flat"; ref7.totalValue=1700000;
        Property p7=new Property(); p7.propertyId=107; p7.propertyName="Property7"; p7.area=1050; p7.price=520000; p7.status="Booked"; ref7.property=p7; ref7.getRealEstateDetails();

        RealEstate ref8=new RealEstate(); ref8.realEstateId=8; ref8.companyName="Company8"; ref8.location="City8"; ref8.propertyType="Villa"; ref8.totalValue=2600000;
        Property p8=new Property(); p8.propertyId=108; p8.propertyName="Property8"; p8.area=1350; p8.price=700000; p8.status="Sold"; ref8.property=p8; ref8.getRealEstateDetails();

        RealEstate ref9=new RealEstate(); ref9.realEstateId=9; ref9.companyName="Company9"; ref9.location="City9"; ref9.propertyType="Plot"; ref9.totalValue=1300000;
        Property p9=new Property(); p9.propertyId=109; p9.propertyName="Property9"; p9.area=900; p9.price=450000; p9.status="Available"; ref9.property=p9; ref9.getRealEstateDetails();

        RealEstate ref10=new RealEstate(); ref10.realEstateId=10; ref10.companyName="Company10"; ref10.location="City10"; ref10.propertyType="Flat"; ref10.totalValue=1900000;
        Property p10=new Property(); p10.propertyId=110; p10.propertyName="Property10"; p10.area=1150; p10.price=580000; p10.status="Booked"; ref10.property=p10; ref10.getRealEstateDetails();

        // 11–29

        RealEstate ref11=new RealEstate(); ref11.realEstateId=11; ref11.companyName="Company11"; ref11.location="City11"; ref11.propertyType="Villa"; ref11.totalValue=2700000;
        Property p11=new Property(); p11.propertyId=111; p11.propertyName="Property11"; p11.area=1400; p11.price=720000; p11.status="Sold"; ref11.property=p11; ref11.getRealEstateDetails();

        RealEstate ref12=new RealEstate(); ref12.realEstateId=12; ref12.companyName="Company12"; ref12.location="City12"; ref12.propertyType="Plot"; ref12.totalValue=1200000;
        Property p12=new Property(); p12.propertyId=112; p12.propertyName="Property12"; p12.area=850; p12.price=420000; p12.status="Available"; ref12.property=p12; ref12.getRealEstateDetails();

        RealEstate ref13=new RealEstate(); ref13.realEstateId=13; ref13.companyName="Company13"; ref13.location="City13"; ref13.propertyType="Flat"; ref13.totalValue=1600000;
        Property p13=new Property(); p13.propertyId=113; p13.propertyName="Property13"; p13.area=1000; p13.price=500000; p13.status="Booked"; ref13.property=p13; ref13.getRealEstateDetails();

        RealEstate ref14=new RealEstate(); ref14.realEstateId=14; ref14.companyName="Company14"; ref14.location="City14"; ref14.propertyType="Villa"; ref14.totalValue=2800000;
        Property p14=new Property(); p14.propertyId=114; p14.propertyName="Property14"; p14.area=1450; p14.price=750000; p14.status="Sold"; ref14.property=p14; ref14.getRealEstateDetails();

        RealEstate ref15=new RealEstate(); ref15.realEstateId=15; ref15.companyName="Company15"; ref15.location="City15"; ref15.propertyType="Plot"; ref15.totalValue=1100000;
        Property p15=new Property(); p15.propertyId=115; p15.propertyName="Property15"; p15.area=800; p15.price=400000; p15.status="Available"; ref15.property=p15; ref15.getRealEstateDetails();

        RealEstate ref16=new RealEstate(); ref16.realEstateId=16; ref16.companyName="Company16"; ref16.location="City16"; ref16.propertyType="Flat"; ref16.totalValue=1750000;
        Property p16=new Property(); p16.propertyId=116; p16.propertyName="Property16"; p16.area=1080; p16.price=530000; p16.status="Booked"; ref16.property=p16; ref16.getRealEstateDetails();

        RealEstate ref17=new RealEstate(); ref17.realEstateId=17; ref17.companyName="Company17"; ref17.location="City17"; ref17.propertyType="Villa"; ref17.totalValue=2600000;
        Property p17=new Property(); p17.propertyId=117; p17.propertyName="Property17"; p17.area=1380; p17.price=710000; p17.status="Sold"; ref17.property=p17; ref17.getRealEstateDetails();

        RealEstate ref18=new RealEstate(); ref18.realEstateId=18; ref18.companyName="Company18"; ref18.location="City18"; ref18.propertyType="Plot"; ref18.totalValue=1250000;
        Property p18=new Property(); p18.propertyId=118; p18.propertyName="Property18"; p18.area=880; p18.price=430000; p18.status="Available"; ref18.property=p18; ref18.getRealEstateDetails();

        RealEstate ref19=new RealEstate(); ref19.realEstateId=19; ref19.companyName="Company19"; ref19.location="City19"; ref19.propertyType="Flat"; ref19.totalValue=1850000;
        Property p19=new Property(); p19.propertyId=119; p19.propertyName="Property19"; p19.area=1120; p19.price=560000; p19.status="Booked"; ref19.property=p19; ref19.getRealEstateDetails();

        RealEstate ref20=new RealEstate(); ref20.realEstateId=20; ref20.companyName="Company20"; ref20.location="City20"; ref20.propertyType="Villa"; ref20.totalValue=2900000;
        Property p20=new Property(); p20.propertyId=120; p20.propertyName="Property20"; p20.area=1500; p20.price=780000; p20.status="Sold"; ref20.property=p20; ref20.getRealEstateDetails();

        RealEstate ref21=new RealEstate(); ref21.realEstateId=21; ref21.companyName="Company21"; ref21.location="City21"; ref21.propertyType="Plot"; ref21.totalValue=1150000;
        Property p21=new Property(); p21.propertyId=121; p21.propertyName="Property21"; p21.area=820; p21.price=410000; p21.status="Available"; ref21.property=p21; ref21.getRealEstateDetails();

        RealEstate ref22=new RealEstate(); ref22.realEstateId=22; ref22.companyName="Company22"; ref22.location="City22"; ref22.propertyType="Flat"; ref22.totalValue=1650000;
        Property p22=new Property(); p22.propertyId=122; p22.propertyName="Property22"; p22.area=1020; p22.price=510000; p22.status="Booked"; ref22.property=p22; ref22.getRealEstateDetails();

        RealEstate ref23=new RealEstate(); ref23.realEstateId=23; ref23.companyName="Company23"; ref23.location="City23"; ref23.propertyType="Villa"; ref23.totalValue=2750000;
        Property p23=new Property(); p23.propertyId=123; p23.propertyName="Property23"; p23.area=1420; p23.price=730000; p23.status="Sold"; ref23.property=p23; ref23.getRealEstateDetails();

        RealEstate ref24=new RealEstate(); ref24.realEstateId=24; ref24.companyName="Company24"; ref24.location="City24"; ref24.propertyType="Plot"; ref24.totalValue=1180000;
        Property p24=new Property(); p24.propertyId=124; p24.propertyName="Property24"; p24.area=840; p24.price=420000; p24.status="Available"; ref24.property=p24; ref24.getRealEstateDetails();

        RealEstate ref25=new RealEstate(); ref25.realEstateId=25; ref25.companyName="Company25"; ref25.location="City25"; ref25.propertyType="Flat"; ref25.totalValue=1800000;
        Property p25=new Property(); p25.propertyId=125; p25.propertyName="Property25"; p25.area=1100; p25.price=550000; p25.status="Booked"; ref25.property=p25; ref25.getRealEstateDetails();

        RealEstate ref26=new RealEstate(); ref26.realEstateId=26; ref26.companyName="Company26"; ref26.location="City26"; ref26.propertyType="Villa"; ref26.totalValue=2850000;
        Property p26=new Property(); p26.propertyId=126; p26.propertyName="Property26"; p26.area=1480; p26.price=760000; p26.status="Sold"; ref26.property=p26; ref26.getRealEstateDetails();

        RealEstate ref27=new RealEstate(); ref27.realEstateId=27; ref27.companyName="Company27"; ref27.location="City27"; ref27.propertyType="Plot"; ref27.totalValue=1120000;
        Property p27=new Property(); p27.propertyId=127; p27.propertyName="Property27"; p27.area=810; p27.price=405000; p27.status="Available"; ref27.property=p27; ref27.getRealEstateDetails();

        RealEstate ref28=new RealEstate(); ref28.realEstateId=28; ref28.companyName="Company28"; ref28.location="City28"; ref28.propertyType="Flat"; ref28.totalValue=1700000;
        Property p28=new Property(); p28.propertyId=128; p28.propertyName="Property28"; p28.area=1050; p28.price=525000; p28.status="Booked"; ref28.property=p28; ref28.getRealEstateDetails();

        RealEstate ref29=new RealEstate(); ref29.realEstateId=29; ref29.companyName="Company29"; ref29.location="City29"; ref29.propertyType="Villa"; ref29.totalValue=2950000;
        Property p29=new Property(); p29.propertyId=129; p29.propertyName="Property29"; p29.area=1520; p29.price=800000; p29.status="Sold"; ref29.property=p29; ref29.getRealEstateDetails();
    }
}