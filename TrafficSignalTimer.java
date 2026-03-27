class TrafficSignalTimer {

    static int timer = 0;
    static boolean signalOn = false;

    static int getTimer() {
        return timer;
    }

    static void turnOn() {
        signalOn = true;
        System.out.println("Traffic Signal is ON");
    }

    static void turnOff() {
        signalOn = false;
        System.out.println("Traffic Signal is OFF");
    }

    static void increaseTimer(int value) {
        if(signalOn){
            if(timer + value <= 120){
                timer = timer + value;
                System.out.println("Timer increased to: " + timer + " seconds");
            } else {
                System.out.println("Maximum timer is 120 seconds");
            }
        } else {
            System.out.println("Signal is OFF. Cannot change timer");
        }
    }

    static void decreaseTimer(int value) {
        if(signalOn){
            if(timer - value >= 0){
                timer = timer - value;
                System.out.println("Timer decreased to: " + timer + " seconds");
            } else {
                System.out.println("Timer cannot go below 0");
            }
        } else {
            System.out.println("Signal is OFF. Cannot change timer");
        }
    }
}