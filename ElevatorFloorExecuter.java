
class ElevatorFloorExecuter {

    public static void main(String[] args) {

        ElevatorFloor.goUp(5);
        System.out.println("Current Floor: " + ElevatorFloor.getFloor());
        ElevatorFloor.goDown(2);
    }
}