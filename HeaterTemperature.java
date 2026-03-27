class HeaterTemperature {

    static int temperature = 20;

    static int getTemperature() {
        return temperature;
    }

    static void increaseTemperature(int value) {
        temperature += value;
        System.out.println("Temperature increased to: " + temperature);
    }

    static void decreaseTemperature(int value) {
        temperature -= value;
        System.out.println("Temperature decreased to: " + temperature);
    }
}
