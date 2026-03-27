class TrafficSignalTimerExecuter {

    public static void main(String[] args) {

        TrafficSignalTimer.turnOn();

        TrafficSignalTimer.increaseTimer(30);

        System.out.println("Current Timer: " + TrafficSignalTimer.getTimer());

        TrafficSignalTimer.decreaseTimer(10);

        TrafficSignalTimer.turnOff();
    }
}