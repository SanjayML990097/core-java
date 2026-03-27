
class BikeSpeedExecuter {

    public static void main(String[] args) {

        BikeSpeed.startEngine();
        BikeSpeed.accelerate(40);
        System.out.println("Current Speed: " + BikeSpeed.getSpeed());
        BikeSpeed.brake(10);
        BikeSpeed.stopEngine();
    }
}