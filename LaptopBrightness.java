class LaptopBrightness {

    static int brightness = 5;
    static boolean power = false;

    static int getBrightness() {
        return brightness;
    }

    static void turnOn() {
        power = true;
        System.out.println("Laptop ON");
    }

    static void turnOff() {
        power = false;
        System.out.println("Laptop OFF");
    }

    static void increaseBrightness(int value) {
        if(power){
            brightness += value;
            System.out.println("Brightness increased to: " + brightness);
        }
    }

    static void decreaseBrightness(int value) {
        if(power){
            brightness -= value;
            System.out.println("Brightness decreased to: " + brightness);
        }
    }
}
