
class SpeakerVolumeExecuter {

    public static void main(String[] args) {

        SpeakerVolume.turnOn();
        SpeakerVolume.increaseVolume(2);
        System.out.println("Current Volume: " + SpeakerVolume.getVolume());
        SpeakerVolume.decreaseVolume(1);
        SpeakerVolume.turnOff();
    }
}