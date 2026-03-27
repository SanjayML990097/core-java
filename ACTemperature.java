class ACTemperature {

    static int temperature = 24;
    static boolean power = false;

    static int getTemperature() {
        return temperature;
    }

    static void turnOn() {
        power = true;
        System.out.println("AC is ON");
    }

    static void turnOff() {
        power = false;
        System.out.println("AC is OFF");
    }

    static void increaseTemperature(int value) {
        if(power){
            temperature += value;
            System.out.println("Temperature increased to: " + temperature);
        }
    }

    static void decreaseTemperature(int value) {
        if(power){
            temperature -= value;
            System.out.println("Temperature decreased to: " + temperature);
        }
    }
}
