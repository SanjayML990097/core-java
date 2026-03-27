class DroneAltitude {

    static int altitude = 0;

    static int getAltitude() {
        return altitude;
    }

    static void increaseAltitude(int value) {
        altitude += value;
        System.out.println("Altitude increased to: " + altitude);
    }

    static void decreaseAltitude(int value) {
        altitude -= value;
        System.out.println("Altitude decreased to: " + altitude);
    }
}
