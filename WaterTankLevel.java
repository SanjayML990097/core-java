class WaterTankLevel {

    static int level = 0;
    static boolean motor = false;

    static int getLevel() {
        return level;
    }

    static void motorOn() {
        motor = true;
        System.out.println("Motor is ON");
    }

    static void motorOff() {
        motor = false;
        System.out.println("Motor is OFF");
    }

    static void fillWater(int value) {
        if(motor){
            if(level + value <= 100){
                level = level + value;
                System.out.println("Water level increased to: " + level);
            } else {
                System.out.println("Tank is Full");
            }
        } else {
            System.out.println("Motor is OFF");
        }
    }

    static void useWater(int value) {
        if(level - value >= 0){
            level = level - value;
            System.out.println("Water level decreased to: " + level);
        } else {
            System.out.println("Tank is Empty");
        }
    }
}
