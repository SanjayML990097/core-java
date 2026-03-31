class OttPlatformExecutor
{
    public static void main(String args[])
    {
        System.out.println("OTT Platform Details Fetching...");

        OttPlatform o1 = new OttPlatform(); Subscription s1 = new Subscription();
        s1.subscriptionId=1; s1.type="Basic"; s1.price=199; s1.duration="1 Month"; s1.isActive=true;
        o1.platformId=1; o1.platformName="Netflix"; o1.language="English"; o1.rating=4.5; o1.subscription=s1;

        OttPlatform o2 = new OttPlatform(); Subscription s2 = new Subscription();
        s2.subscriptionId=2; s2.type="Standard"; s2.price=299; s2.duration="1 Month"; s2.isActive=true;
        o2.platformId=2; o2.platformName="Amazon Prime"; o2.language="Multi"; o2.rating=4.4; o2.subscription=s2;

        OttPlatform o3 = new OttPlatform(); Subscription s3 = new Subscription();
        s3.subscriptionId=3; s3.type="Premium"; s3.price=499; s3.duration="1 Month"; s3.isActive=true;
        o3.platformId=3; o3.platformName="Disney+ Hotstar"; o3.language="Hindi"; o3.rating=4.3; o3.subscription=s3;

        OttPlatform o4 = new OttPlatform(); Subscription s4 = new Subscription();
        s4.subscriptionId=4; s4.type="Basic"; s4.price=149; s4.duration="1 Month"; s4.isActive=true;
        o4.platformId=4; o4.platformName="Zee5"; o4.language="Hindi"; o4.rating=4.0; o4.subscription=s4;

        OttPlatform o5 = new OttPlatform(); Subscription s5 = new Subscription();
        s5.subscriptionId=5; s5.type="Standard"; s5.price=199; s5.duration="1 Month"; s5.isActive=true;
        o5.platformId=5; o5.platformName="SonyLIV"; o5.language="Multi"; o5.rating=4.1; o5.subscription=s5;

        OttPlatform o6 = new OttPlatform(); Subscription s6 = new Subscription();
        s6.subscriptionId=6; s6.type="Premium"; s6.price=399; s6.duration="1 Month"; s6.isActive=true;
        o6.platformId=6; o6.platformName="Voot"; o6.language="Hindi"; o6.rating=3.9; o6.subscription=s6;

        OttPlatform o7 = new OttPlatform(); Subscription s7 = new Subscription();
        s7.subscriptionId=7; s7.type="Basic"; s7.price=99; s7.duration="1 Month"; s7.isActive=true;
        o7.platformId=7; o7.platformName="MX Player"; o7.language="Hindi"; o7.rating=3.8; o7.subscription=s7;

        OttPlatform o8 = new OttPlatform(); Subscription s8 = new Subscription();
        s8.subscriptionId=8; s8.type="Premium"; s8.price=599; s8.duration="1 Month"; s8.isActive=true;
        o8.platformId=8; o8.platformName="Apple TV+"; o8.language="English"; o8.rating=4.6; o8.subscription=s8;

        OttPlatform o9 = new OttPlatform(); Subscription s9 = new Subscription();
        s9.subscriptionId=9; s9.type="Standard"; s9.price=249; s9.duration="1 Month"; s9.isActive=true;
        o9.platformId=9; o9.platformName="Sun NXT"; o9.language="Tamil"; o9.rating=4.0; o9.subscription=s9;

        OttPlatform o10 = new OttPlatform(); Subscription s10 = new Subscription();
        s10.subscriptionId=10; s10.type="Basic"; s10.price=149; s10.duration="1 Month"; s10.isActive=true;
        o10.platformId=10; o10.platformName="Aha"; o10.language="Telugu"; o10.rating=4.1; o10.subscription=s10;

        OttPlatform o11 = new OttPlatform(); Subscription s11 = new Subscription();
        s11.subscriptionId=11; s11.type="Premium"; s11.price=499; s11.duration="1 Month"; s11.isActive=true;
        o11.platformId=11; o11.platformName="Netflix Plus"; o11.language="English"; o11.rating=4.7; o11.subscription=s11;

        OttPlatform o12 = new OttPlatform(); Subscription s12 = new Subscription();
        s12.subscriptionId=12; s12.type="Standard"; s12.price=299; s12.duration="1 Month"; s12.isActive=true;
        o12.platformId=12; o12.platformName="Prime Plus"; o12.language="Multi"; o12.rating=4.5; o12.subscription=s12;

        OttPlatform o13 = new OttPlatform(); Subscription s13 = new Subscription();
        s13.subscriptionId=13; s13.type="Basic"; s13.price=129; s13.duration="1 Month"; s13.isActive=true;
        o13.platformId=13; o13.platformName="Hotstar Lite"; o13.language="Hindi"; o13.rating=4.2; o13.subscription=s13;

        OttPlatform o14 = new OttPlatform(); Subscription s14 = new Subscription();
        s14.subscriptionId=14; s14.type="Premium"; s14.price=599; s14.duration="1 Month"; s14.isActive=true;
        o14.platformId=14; o14.platformName="Zee5 Gold"; o14.language="Hindi"; o14.rating=4.3; o14.subscription=s14;

        OttPlatform o15 = new OttPlatform(); Subscription s15 = new Subscription();
        s15.subscriptionId=15; s15.type="Standard"; s15.price=249; s15.duration="1 Month"; s15.isActive=true;
        o15.platformId=15; o15.platformName="SonyLIV Pro"; o15.language="Multi"; o15.rating=4.2; o15.subscription=s15;

        OttPlatform o16 = new OttPlatform(); Subscription s16 = new Subscription();
        s16.subscriptionId=16; s16.type="Basic"; s16.price=99; s16.duration="1 Month"; s16.isActive=true;
        o16.platformId=16; o16.platformName="Voot Lite"; o16.language="Hindi"; o16.rating=3.9; o16.subscription=s16;

        OttPlatform o17 = new OttPlatform(); Subscription s17 = new Subscription();
        s17.subscriptionId=17; s17.type="Premium"; s17.price=399; s17.duration="1 Month"; s17.isActive=true;
        o17.platformId=17; o17.platformName="MX Gold"; o17.language="Hindi"; o17.rating=4.0; o17.subscription=s17;

        OttPlatform o18 = new OttPlatform(); Subscription s18 = new Subscription();
        s18.subscriptionId=18; s18.type="Standard"; s18.price=299; s18.duration="1 Month"; s18.isActive=true;
        o18.platformId=18; o18.platformName="Apple TV Pro"; o18.language="English"; o18.rating=4.6; o18.subscription=s18;

        OttPlatform o19 = new OttPlatform(); Subscription s19 = new Subscription();
        s19.subscriptionId=19; s19.type="Basic"; s19.price=149; s19.duration="1 Month"; s19.isActive=true;
        o19.platformId=19; o19.platformName="Sun NXT Lite"; o19.language="Tamil"; o19.rating=4.1; o19.subscription=s19;

        OttPlatform o20 = new OttPlatform(); Subscription s20 = new Subscription();
        s20.subscriptionId=20; s20.type="Premium"; s20.price=499; s20.duration="1 Month"; s20.isActive=true;
        o20.platformId=20; o20.platformName="Aha Gold"; o20.language="Telugu"; o20.rating=4.3; o20.subscription=s20;

        System.out.println(o1.platformName+" - "+o1.subscription.type);
        System.out.println(o2.platformName+" - "+o2.subscription.type);
        System.out.println(o3.platformName+" - "+o3.subscription.type);
        System.out.println(o4.platformName+" - "+o4.subscription.type);
        System.out.println(o5.platformName+" - "+o5.subscription.type);
        System.out.println(o6.platformName+" - "+o6.subscription.type);
        System.out.println(o7.platformName+" - "+o7.subscription.type);
        System.out.println(o8.platformName+" - "+o8.subscription.type);
        System.out.println(o9.platformName+" - "+o9.subscription.type);
        System.out.println(o10.platformName+" - "+o10.subscription.type);
        System.out.println(o11.platformName+" - "+o11.subscription.type);
        System.out.println(o12.platformName+" - "+o12.subscription.type);
        System.out.println(o13.platformName+" - "+o13.subscription.type);
        System.out.println(o14.platformName+" - "+o14.subscription.type);
        System.out.println(o15.platformName+" - "+o15.subscription.type);
        System.out.println(o16.platformName+" - "+o16.subscription.type);
        System.out.println(o17.platformName+" - "+o17.subscription.type);
        System.out.println(o18.platformName+" - "+o18.subscription.type);
        System.out.println(o19.platformName+" - "+o19.subscription.type);
        System.out.println(o20.platformName+" - "+o20.subscription.type);
    }
}