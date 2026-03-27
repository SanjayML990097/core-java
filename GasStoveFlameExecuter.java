
class GasStoveFlameExecuter {

    public static void main(String[] args) {

        GasStoveFlame.gasOn();
        GasStoveFlame.increaseFlame(3);
        System.out.println("Current Flame: " + GasStoveFlame.getFlame());
        GasStoveFlame.decreaseFlame(1);
        GasStoveFlame.gasOff();
    }
}