
class CarSpeedExecuter {

    public static void main(String[] args) {

        CarSpeed.startEngine();
        CarSpeed.accelerate(40);
        System.out.println("Current Speed: " + CarSpeed.getSpeed());
        CarSpeed.brake(10);
        CarSpeed.stopEngine();
    }
}