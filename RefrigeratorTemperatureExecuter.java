
class RefrigeratorTemperatureExecuter {

    public static void main(String[] args) {

        RefrigeratorTemperature.turnOn();
        RefrigeratorTemperature.increaseTemperature(2);
        System.out.println("Current Temperature: " + RefrigeratorTemperature.getTemperature());
        RefrigeratorTemperature.decreaseTemperature(1);
        RefrigeratorTemperature.turnOff();
    }
}