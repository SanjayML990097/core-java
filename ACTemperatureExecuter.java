
class ACTemperatureExecuter {

    public static void main(String[] args) {

        ACTemperature.turnOn();
        ACTemperature.increaseTemperature(2);
        System.out.println("Current Temperature: " + ACTemperature.getTemperature());
        ACTemperature.decreaseTemperature(1);
        ACTemperature.turnOff();
    }
}