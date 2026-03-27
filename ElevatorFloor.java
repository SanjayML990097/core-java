class ElevatorFloor {

    static int floor = 0;

    static int getFloor() {
        return floor;
    }

    static void goUp(int value) {
        floor += value;
        System.out.println("Elevator moved to floor: " + floor);
    }

    static void goDown(int value) {
        floor -= value;
        System.out.println("Elevator moved to floor: " + floor);
    }
}
