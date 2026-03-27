class SpeakerVolume {

    static int volume = 3;
    static boolean power = false;

    static int getVolume() {
        return volume;
    }

    static void turnOn() {
        power = true;
        System.out.println("Speaker ON");
    }

    static void turnOff() {
        power = false;
        System.out.println("Speaker OFF");
    }

    static void increaseVolume(int value) {
        if(power){
            volume += value;
            System.out.println("Volume increased to: " + volume);
        }
    }

    static void decreaseVolume(int value) {
        if(power){
            volume -= value;
            System.out.println("Volume decreased to: " + volume);
        }
    }
}
