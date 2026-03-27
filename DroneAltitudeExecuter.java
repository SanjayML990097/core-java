
class DroneAltitudeExecuter {

    public static void main(String[] args) {

        DroneAltitude.increaseAltitude(50);
        System.out.println("Current Altitude: " + DroneAltitude.getAltitude());
        DroneAltitude.decreaseAltitude(20);
    }
}