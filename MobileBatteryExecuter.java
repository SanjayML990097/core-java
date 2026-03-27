
class MobileBatteryExecuter {

    public static void main(String[] args) {

        MobileBattery.startCharging();
        MobileBattery.chargeBattery(20);
        System.out.println("Current Battery: " + MobileBattery.getBattery());
        MobileBattery.useBattery(10);
        MobileBattery.stopCharging();
    }
}