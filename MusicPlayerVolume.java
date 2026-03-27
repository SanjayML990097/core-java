class MusicPlayerVolume {

    static int volume = 5;
    static boolean power = false;

    static int getVolume() {
        return volume;
    }

    static void turnOn() {
        power = true;
        System.out.println("Music Player ON");
    }

    static void turnOff() {
        power = false;
        System.out.println("Music Player OFF");
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
