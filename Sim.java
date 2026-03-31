class Sim {

    int simId;
    String provider;
    String networkType;
    long mobileNumber;
    String plan;

    public void getSimDetails() {

        System.out.println("The simId is: " + simId);
        System.out.println("The provider is: " + provider);
        System.out.println("The networkType is: " + networkType);
        System.out.println("The mobileNumber is: " + mobileNumber);
        System.out.println("The plan is: " + plan);

    }
}