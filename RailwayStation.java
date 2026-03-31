class RailwayStation {
    
    int stationId;
    String stationName;
    String location;
    int numberOfPlatforms;
    String zone;
    
    Platform platform;

    public void getStationDetails() {
        System.out.println("The stationId is: " + stationId);
        System.out.println("The stationName is: " + stationName);
        System.out.println("The location is: " + location);
        System.out.println("The numberOfPlatforms is: " + numberOfPlatforms);
        System.out.println("The zone is: " + zone);

        platform.getPlatformDetails();
        System.out.println("--------------------------------");
    }
}



