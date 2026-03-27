
class MusicPlayerVolumeExecuter {

    public static void main(String[] args) {

        MusicPlayerVolume.turnOn();
        MusicPlayerVolume.increaseVolume(3);
        System.out.println("Current Volume: " + MusicPlayerVolume.getVolume());
        MusicPlayerVolume.decreaseVolume(1);
        MusicPlayerVolume.turnOff();
    }
}