
class CoffeeMachineLevelExecuter {

    public static void main(String[] args) {

        CoffeeMachineLevel.turnOn();
        CoffeeMachineLevel.addCoffee(10);
        System.out.println("Current Coffee Level: " + CoffeeMachineLevel.getCoffeeLevel());
        CoffeeMachineLevel.useCoffee(5);
        CoffeeMachineLevel.turnOff();
    }
}