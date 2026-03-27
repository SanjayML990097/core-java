
class MobileBrightnessExecuter {

    public static void main(String[] args) {

        MobileBrightness.turnOn();
        MobileBrightness.increaseBrightness(3);
        System.out.println("Current Brightness: " + MobileBrightness.getBrightness());
        MobileBrightness.decreaseBrightness(1);
        MobileBrightness.turnOff();
    }
}