class Platform {

    int platformId;
    String platformName;
    int capacity;
    String trainType;
    String status;

    public void getPlatformDetails() {

        System.out.println("The platformId is: " + platformId);
        System.out.println("The platformName is: " + platformName);
        System.out.println("The capacity is: " + capacity);
        System.out.println("The trainType is: " + trainType);
        System.out.println("The status is: " + status);
    }
}