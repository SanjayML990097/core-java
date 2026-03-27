
class WashingMachineTimerExecuter {

    public static void main(String[] args) {

        WashingMachineTimer.turnOn();
        WashingMachineTimer.increaseTime(10);
        System.out.println("Current Time: " + WashingMachineTimer.getTime());
        WashingMachineTimer.decreaseTime(5);
        WashingMachineTimer.turnOff();
    }
}