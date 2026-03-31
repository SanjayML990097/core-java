class Gym {
    
    int gymId;
    String gymName;
    String location;
    int membershipFee;
    String gymType;
    
    Trainer trainer;

    public void getGymDetails() {
        System.out.println("The gymId is: " + gymId);
        System.out.println("The gymName is: " + gymName);
        System.out.println("The location is: " + location);
        System.out.println("The membershipFee is: " + membershipFee);
        System.out.println("The gymType is: " + gymType);

        trainer.getTrainerDetails();
    }
}


