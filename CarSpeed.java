class CarSpeed {

    static int speed = 0;
    static boolean engine = false;

    static int getSpeed() {
        return speed;
    }

    static void startEngine() {
        engine = true;
        System.out.println("Car Engine Started");
    }

    static void stopEngine() {
        engine = false;
        System.out.println("Car Engine Stopped");
    }

    static void accelerate(int value) {
        if(engine){
            speed += value;
            System.out.println("Speed increased to: " + speed);
        }
    }

    static void brake(int value) {
        if(engine){
            speed -= value;
            System.out.println("Speed decreased to: " + speed);
        }
    }
}
