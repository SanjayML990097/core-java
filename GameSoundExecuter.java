
class GameSoundExecuter {

    public static void main(String[] args) {

        GameSound.increaseVolume(2);
        System.out.println("Current Volume: " + GameSound.getVolume());
        GameSound.decreaseVolume(1);
    }
}