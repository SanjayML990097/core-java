class MicrowaveTimer {

    static int time = 0;
    static boolean power = false;

    static int getTime() {
        return time;
    }

    static void turnOn() {
        power = true;
        System.out.println("Microwave ON");
    }

    static void turnOff() {
        power = false;
        System.out.println("Microwave OFF");
    }

    static void increaseTime(int value) {
        if(power){
            time += value;
            System.out.println("Time increased to: " + time);
        }
    }

    static void decreaseTime(int value) {
        if(power){
            time -= value;
            System.out.println("Time decreased to: " + time);
        }
    }
}
