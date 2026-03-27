
class AirPurifierSpeedExecuter {

    public static void main(String[] args) {

        AirPurifierSpeed.increaseSpeed(2);
        System.out.println("Current Speed: " + AirPurifierSpeed.getSpeed());
        AirPurifierSpeed.decreaseSpeed(1);
    }
}