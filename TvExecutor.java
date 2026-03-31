class TvExecutor {

    public static void main(String args[]) {

        Tv ref = new Tv();
        ref.tvId = 1;
        ref.brand = "Samsung";
        ref.model = "QLED Q60";
        ref.price = 60000;
        ref.screenType = "QLED";

        Remote r = new Remote();
        r.remoteId = 101;
        r.remoteBrand = "Samsung";
        r.batteryCount = 2;
        r.range = "10m";
        r.color = "Black";

        ref.remote = r;
		// 1
Tv ref1 = new Tv();
ref1.tvId = 1;
ref1.brand = "Samsung";
ref1.model = "Model1";
ref1.price = 30000;
ref1.screenType = "LED";

Remote r1 = new Remote();
r1.remoteId = 101;
r1.remoteBrand = "Samsung";
r1.batteryCount = 2;
r1.range = "10m";
r1.color = "Black";

ref1.remote = r1;
ref1.getTvDetails();

// 2
Tv ref2 = new Tv();
ref2.tvId = 2;
ref2.brand = "LG";
ref2.model = "Model2";
ref2.price = 35000;
ref2.screenType = "OLED";

Remote r2 = new Remote();
r2.remoteId = 102;
r2.remoteBrand = "LG";
r2.batteryCount = 2;
r2.range = "12m";
r2.color = "White";

ref2.remote = r2;
ref2.getTvDetails();

// 3
Tv ref3 = new Tv();
ref3.tvId = 3;
ref3.brand = "Sony";
ref3.model = "Model3";
ref3.price = 40000;
ref3.screenType = "LED";

Remote r3 = new Remote();
r3.remoteId = 103;
r3.remoteBrand = "Sony";
r3.batteryCount = 2;
r3.range = "15m";
r3.color = "Black";

ref3.remote = r3;
ref3.getTvDetails();

// 4
Tv ref4 = new Tv();
ref4.tvId = 4;
ref4.brand = "Mi";
ref4.model = "Model4";
ref4.price = 25000;
ref4.screenType = "LED";

Remote r4 = new Remote();
r4.remoteId = 104;
r4.remoteBrand = "Mi";
r4.batteryCount = 2;
r4.range = "10m";
r4.color = "Grey";

ref4.remote = r4;
ref4.getTvDetails();

// 5
Tv ref5 = new Tv();
ref5.tvId = 5;
ref5.brand = "OnePlus";
ref5.model = "Model5";
ref5.price = 45000;
ref5.screenType = "QLED";

Remote r5 = new Remote();
r5.remoteId = 105;
r5.remoteBrand = "OnePlus";
r5.batteryCount = 2;
r5.range = "12m";
r5.color = "Black";

ref5.remote = r5;
ref5.getTvDetails();

// 6
Tv ref6 = new Tv();
ref6.tvId = 6;
ref6.brand = "Panasonic";
ref6.model = "Model6";
ref6.price = 28000;
ref6.screenType = "LED";

Remote r6 = new Remote();
r6.remoteId = 106;
r6.remoteBrand = "Panasonic";
r6.batteryCount = 2;
r6.range = "10m";
r6.color = "Silver";

ref6.remote = r6;
ref6.getTvDetails();

// 7
Tv ref7 = new Tv();
ref7.tvId = 7;
ref7.brand = "TCL";
ref7.model = "Model7";
ref7.price = 27000;
ref7.screenType = "LED";

Remote r7 = new Remote();
r7.remoteId = 107;
r7.remoteBrand = "TCL";
r7.batteryCount = 2;
r7.range = "9m";
r7.color = "Black";

ref7.remote = r7;
ref7.getTvDetails();

// 8
Tv ref8 = new Tv();
ref8.tvId = 8;
ref8.brand = "Vu";
ref8.model = "Model8";
ref8.price = 26000;
ref8.screenType = "LED";

Remote r8 = new Remote();
r8.remoteId = 108;
r8.remoteBrand = "Vu";
r8.batteryCount = 2;
r8.range = "10m";
r8.color = "Black";

ref8.remote = r8;
ref8.getTvDetails();

// 9
Tv ref9 = new Tv();
ref9.tvId = 9;
ref9.brand = "Philips";
ref9.model = "Model9";
ref9.price = 32000;
ref9.screenType = "LED";

Remote r9 = new Remote();
r9.remoteId = 109;
r9.remoteBrand = "Philips";
r9.batteryCount = 2;
r9.range = "11m";
r9.color = "White";

ref9.remote = r9;
ref9.getTvDetails();

// 10
Tv ref10 = new Tv();
ref10.tvId = 10;
ref10.brand = "Samsung";
ref10.model = "Model10";
ref10.price = 50000;
ref10.screenType = "QLED";

Remote r10 = new Remote();
r10.remoteId = 110;
r10.remoteBrand = "Samsung";
r10.batteryCount = 2;
r10.range = "15m";
r10.color = "Black";

ref10.remote = r10;
ref10.getTvDetails();

// 11–29 (same clean format pattern)

Tv ref11 = new Tv();
ref11.tvId = 11;
ref11.brand = "LG";
ref11.model = "Model11";
ref11.price = 37000;
ref11.screenType = "OLED";

Remote r11 = new Remote();
r11.remoteId = 111;
r11.remoteBrand = "LG";
r11.batteryCount = 2;
r11.range = "12m";
r11.color = "White";

ref11.remote = r11;
ref11.getTvDetails();

// continue same pattern till 29

        ref.getTvDetails();
    }
}