class GameSound {

    static int volume = 5;

    static int getVolume() {
        return volume;
    }

    static void increaseVolume(int value) {
        volume += value;
        System.out.println("Game Volume: " + volume);
    }

    static void decreaseVolume(int value) {
        volume -= value;
        System.out.println("Game Volume: " + volume);
    }
}
