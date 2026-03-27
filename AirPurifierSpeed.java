class AirPurifierSpeed {

    static int speed = 1;

    static int getSpeed() {
        return speed;
    }

    static void increaseSpeed(int value) {
        speed += value;
        System.out.println("Speed increased to: " + speed);
    }

    static void decreaseSpeed(int value) {
        speed -= value;
        System.out.println("Speed decreased to: " + speed);
    }
}
