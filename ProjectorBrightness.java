class ProjectorBrightness {

    static int brightness = 5;

    static int getBrightness() {
        return brightness;
    }

    static void increaseBrightness(int value) {
        brightness += value;
        System.out.println("Brightness increased to: " + brightness);
    }

    static void decreaseBrightness(int value) {
        brightness -= value;
        System.out.println("Brightness decreased to: " + brightness);
    }
}
