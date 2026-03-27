
class SmartLightBrightnessExecuter {

    public static void main(String[] args) {

        SmartLightBrightness.turnOn();
        SmartLightBrightness.increaseBrightness(3);
        System.out.println("Current Brightness: " + SmartLightBrightness.getBrightness());
        SmartLightBrightness.decreaseBrightness(1);
        SmartLightBrightness.turnOff();
    }
}