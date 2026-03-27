
class ProjectorBrightnessExecuter {

    public static void main(String[] args) {

        ProjectorBrightness.increaseBrightness(3);
        System.out.println("Current Brightness: " + ProjectorBrightness.getBrightness());
        ProjectorBrightness.decreaseBrightness(1);
    }
}