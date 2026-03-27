
class LaptopBrightnessExecuter {

    public static void main(String[] args) {

        LaptopBrightness.turnOn();
        LaptopBrightness.increaseBrightness(2);
        System.out.println("Current Brightness: " + LaptopBrightness.getBrightness());
        LaptopBrightness.decreaseBrightness(1);
        LaptopBrightness.turnOff();
    }
}