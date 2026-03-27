class RoomLightIntensity {

    static int intensity = 5;
    static boolean light = false;

    static int getIntensity() {
        return intensity;
    }

    static void turnOn() {
        light = true;
        System.out.println("Light ON");
    }

    static void turnOff() {
        light = false;
        System.out.println("Light OFF");
    }

    static void increaseIntensity(int value) {
        if(light){
            intensity += value;
            System.out.println("Intensity increased to: " + intensity);
        }
    }

    static void decreaseIntensity(int value) {
        if(light){
            intensity -= value;
            System.out.println("Intensity decreased to: " + intensity);
        }
    }
}
