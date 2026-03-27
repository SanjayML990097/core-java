
class MicrowaveTimerExecuter {

    public static void main(String[] args) {

        MicrowaveTimer.turnOn();
        MicrowaveTimer.increaseTime(5);
        System.out.println("Current Time: " + MicrowaveTimer.getTime());
        MicrowaveTimer.decreaseTime(2);
        MicrowaveTimer.turnOff();
    }
}