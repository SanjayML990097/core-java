class RefrigeratorTemperature {

    static int temperature = 5;
    static boolean power = false;

    static int getTemperature() {
        return temperature;
    }

    static void turnOn() {
        power = true;
        System.out.println("Refrigerator ON");
    }

    static void turnOff() {
        power = false;
        System.out.println("Refrigerator OFF");
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
