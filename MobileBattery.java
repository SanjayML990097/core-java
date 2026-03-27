class MobileBattery {

    static int battery = 50;
    static boolean charging = false;

    static int getBattery() {
        return battery;
    }

    static void startCharging() {
        charging = true;
        System.out.println("Charging Started");
    }

    static void stopCharging() {
        charging = false;
        System.out.println("Charging Stopped");
    }

    static void chargeBattery(int value) {
        if(charging){
            battery = battery + value;
            System.out.println("Battery increased to: " + battery);
        }
    }

    static void useBattery(int value) {
        battery = battery - value;
        System.out.println("Battery decreased to: " + battery);
    }
}
