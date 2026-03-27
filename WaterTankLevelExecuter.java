
class WaterTankLevelExecuter {

    public static void main(String[] args) {

        WaterTankLevel.motorOn();
        WaterTankLevel.fillWater(50);
        System.out.println("Current Level: " + WaterTankLevel.getLevel());
        WaterTankLevel.useWater(20);
        WaterTankLevel.motorOff();
    }
}