class GasStoveFlame {

    static int flame = 0;
    static boolean gas = false;

    static int getFlame() {
        return flame;
    }

    static void gasOn() {
        gas = true;
        System.out.println("Gas Stove ON");
    }

    static void gasOff() {
        gas = false;
        System.out.println("Gas Stove OFF");
    }

    static void increaseFlame(int value) {
        if(gas){
            flame = flame + value;
            System.out.println("Flame increased to: " + flame);
        } else {
            System.out.println("Gas is OFF");
        }
    }

    static void decreaseFlame(int value) {
        if(gas){
            flame = flame - value;
            System.out.println("Flame decreased to: " + flame);
        }
    }
}
