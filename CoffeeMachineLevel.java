class CoffeeMachineLevel {

    static int coffeeLevel = 0;
    static boolean machine = false;

    static int getCoffeeLevel() {
        return coffeeLevel;
    }

    static void turnOn() {
        machine = true;
        System.out.println("Coffee Machine ON");
    }

    static void turnOff() {
        machine = false;
        System.out.println("Coffee Machine OFF");
    }

    static void addCoffee(int value) {
        if(machine){
            coffeeLevel += value;
            System.out.println("Coffee level increased to: " + coffeeLevel);
        }
    }

    static void useCoffee(int value) {
        if(machine){
            coffeeLevel -= value;
            System.out.println("Coffee level decreased to: " + coffeeLevel);
        }
    }
}
