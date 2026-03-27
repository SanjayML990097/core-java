
class RoomLightIntensityExecuter {

    public static void main(String[] args) {

        RoomLightIntensity.turnOn();
        RoomLightIntensity.increaseIntensity(3);
        System.out.println("Current Intensity: " + RoomLightIntensity.getIntensity());
        RoomLightIntensity.decreaseIntensity(1);
        RoomLightIntensity.turnOff();
    }
}