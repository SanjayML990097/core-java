
class HeaterTemperatureExecuter {

    public static void main(String[] args) {

        HeaterTemperature.increaseTemperature(5);
        System.out.println("Current Temperature: " + HeaterTemperature.getTemperature());
        HeaterTemperature.decreaseTemperature(2);
    }
}