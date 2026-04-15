class BatteryRunner {

    public static void main(String[] args) {

        Battery batteries[] = new Battery[15];

        Battery b1 = new Battery();
        b1.batteryId = 1501;
        b1.capacity = 4000;
        b1.type = "Li-ion";
        b1.brand = "Samsung";
        b1.warrantyYears = 2;
        batteries[0] = b1;

        Battery b2 = new Battery();
        b2.batteryId = 1502;
        b2.capacity = 5000;
        b2.type = "Li-ion";
        b2.brand = "LG";
        b2.warrantyYears = 2;
        batteries[1] = b2;

        Battery b3 = new Battery();
        b3.batteryId = 1503;
        b3.capacity = 6000;
        b3.type = "Li-polymer";
        b3.brand = "Sony";
        b3.warrantyYears = 3;
        batteries[2] = b3;

        Battery b4 = new Battery();
        b4.batteryId = 1504;
        b4.capacity = 4500;
        b4.type = "Li-ion";
        b4.brand = "Panasonic";
        b4.warrantyYears = 2;
        batteries[3] = b4;

        Battery b5 = new Battery();
        b5.batteryId = 1505;
        b5.capacity = 7000;
        b5.type = "Li-polymer";
        b5.brand = "Duracell";
        b5.warrantyYears = 3;
        batteries[4] = b5;

        Battery b6 = new Battery();
        b6.batteryId = 1506;
        b6.capacity = 8000;
        b6.type = "Li-ion";
        b6.brand = "Exide";
        b6.warrantyYears = 4;
        batteries[5] = b6;

        Battery b7 = new Battery();
        b7.batteryId = 1507;
        b7.capacity = 3000;
        b7.type = "NiMH";
        b7.brand = "Eveready";
        b7.warrantyYears = 1;
        batteries[6] = b7;

        Battery b8 = new Battery();
        b8.batteryId = 1508;
        b8.capacity = 5500;
        b8.type = "Li-polymer";
        b8.brand = "Amaron";
        b8.warrantyYears = 3;
        batteries[7] = b8;

        Battery b9 = new Battery();
        b9.batteryId = 1509;
        b9.capacity = 6500;
        b9.type = "Li-ion";
        b9.brand = "Bosch";
        b9.warrantyYears = 4;
        batteries[8] = b9;

        Battery b10 = new Battery();
        b10.batteryId = 1510;
        b10.capacity = 7200;
        b10.type = "Li-polymer";
        b10.brand = "Toshiba";
        b10.warrantyYears = 3;
        batteries[9] = b10;

        Battery b11 = new Battery();
        b11.batteryId = 1511;
        b11.capacity = 4800;
        b11.type = "Li-ion";
        b11.brand = "Samsung";
        b11.warrantyYears = 2;
        batteries[10] = b11;

        Battery b12 = new Battery();
        b12.batteryId = 1512;
        b12.capacity = 5200;
        b12.type = "Li-polymer";
        b12.brand = "LG";
        b12.warrantyYears = 2;
        batteries[11] = b12;

        Battery b13 = new Battery();
        b13.batteryId = 1513;
        b13.capacity = 6100;
        b13.type = "Li-ion";
        b13.brand = "Sony";
        b13.warrantyYears = 3;
        batteries[12] = b13;

        Battery b14 = new Battery();
        b14.batteryId = 1514;
        b14.capacity = 7500;
        b14.type = "Li-polymer";
        b14.brand = "Panasonic";
        b14.warrantyYears = 4;
        batteries[13] = b14;

        Battery b15 = new Battery();
        b15.batteryId = 1515;
        b15.capacity = 8200;
        b15.type = "Li-ion";
        b15.brand = "Exide";
        b15.warrantyYears = 5;
        batteries[14] = b15;

      
        for (Battery battery : batteries) {
            System.out.println(battery.batteryId);
            System.out.println(battery.capacity);
            System.out.println(battery.type);
            System.out.println(battery.brand);
            System.out.println(battery.warrantyYears);
            System.out.println("----------------------");
        }
    }
}